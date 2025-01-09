package com.alphamoney.repayment.controller;

import com.alphamoney.repayment.model.User;
import com.alphamoney.repayment.service.UserService;
import com.alphamoney.repayment.util.ApiResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alphamoney.repayment.constants.ApiEndpoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> getUsers() {
        logger.info("Fetching all users");
        List<User> users = userService.getAllUsers();
        return ApiResponseUtil.success("Fetched all users successfully", users);
    }

    @GetMapping(ApiEndpoints.USERS_WITH_ESCROW)
    public ResponseEntity<?> getUsersWithEscrowAccount() {
        logger.debug("Fetching users with escrow accounts");
        List<User> users = userService.getUsersWithEscrowAccount();
        return ApiResponseUtil.success("Fetched users with escrow account successfully", users);
    }
}
