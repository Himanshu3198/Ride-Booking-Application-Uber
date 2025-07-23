package hs.ridebooking.core.util;

import java.security.SecureRandom;

public class OTPGenerator {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final int MIN_OTP = 1000;
    private static final int MAX_OTP = 9999;

    private OTPGenerator() {
        // Prevent instantiation
    }

    public static int generateOTP() {
        return secureRandom.nextInt(MAX_OTP - MIN_OTP + 1) + MIN_OTP;
    }
}
