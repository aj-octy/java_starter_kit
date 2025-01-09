package com.alphamoney.repayment.repository;

import com.alphamoney.repayment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM p2p_logindetails WHERE escrow_account_id IS NOT NULL", nativeQuery = true)
    List<User> findByEscrowAccountIdIsNotNull();
}
