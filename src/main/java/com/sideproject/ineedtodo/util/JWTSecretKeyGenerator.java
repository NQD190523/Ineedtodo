package com.sideproject.ineedtodo.util;

import java.security.SecureRandom;
import java.util.Base64;

public class JWTSecretKeyGenerator {
    public static void main(String[] args) {
        // Độ dài của secret key (tính bằng byte)
        int keyLength = 64; // Độ dài 64 byte tương đương 512 bit

        // Tạo mảng byte ngẫu nhiên
        byte[] randomBytes = generateRandomBytes(keyLength);

        // Chuyển đổi mảng byte thành chuỗi base64 để sử dụng làm secret key cho JWT
        String jwtSecretKey = Base64.getEncoder().encodeToString(randomBytes);

        // In ra secret key đã tạo
        System.out.println("JWT Secret Key: " + jwtSecretKey);
    }

    // Phương thức tạo mảng byte ngẫu nhiên
    private static byte[] generateRandomBytes(int length) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[length];
        secureRandom.nextBytes(randomBytes);
        return randomBytes;
    }
}
