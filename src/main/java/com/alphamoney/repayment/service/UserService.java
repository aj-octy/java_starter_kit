package com.alphamoney.repayment.service;

import com.alphamoney.repayment.exception.ApiException;
import com.alphamoney.repayment.exception.ResourceNotFoundException;
import com.alphamoney.repayment.model.User;
import com.alphamoney.repayment.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        try {
            List<User> users = userRepository.findAll();
            if (users.isEmpty()) {
                throw new ResourceNotFoundException("No users found in the database.");
            }
            return users;
        } catch (Exception ex) {
            throw new ApiException("Failed to fetch all users. Reason: " + ex.getMessage());
        }
    }

    public List<User> getUsersWithEscrowAccount() {
        try {
            List<User> users = userRepository.findByEscrowAccountIdIsNotNull();
            if (users.isEmpty()) {
                throw new ResourceNotFoundException("No users with escrow account IDs found.");
            }
            return users;
        } catch (Exception ex) {
            throw new ApiException("Failed to fetch users with escrow account. Reason: " + ex.getMessage());
        }
    }
}
