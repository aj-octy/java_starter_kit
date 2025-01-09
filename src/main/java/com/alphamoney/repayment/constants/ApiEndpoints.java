package com.alphamoney.repayment.constants;

/**
 * Centralized class to hold all API endpoint constants.
 */
public final class ApiEndpoints {

    private ApiEndpoints() {
        // Prevent instantiation
    }

    public static final String USERS_BASE = "/api/users";
    public static final String USERS_WITH_ESCROW = "/with-escrow-account";
}
