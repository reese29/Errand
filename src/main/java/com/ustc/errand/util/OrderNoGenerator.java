package com.ustc.errand.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderNoGenerator {
    private static final int RANDOM_PART_LENGTH = 24;

    public static String generateOrderNumber() {
        // 获取当前时间
        Date now = new Date();
        // 格式化时间为年月日的格式
        String timePart = new SimpleDateFormat("yyyyMMdd").format(now);
        // 生成随机数部分
        String randomPart = generateRandomString();

        // 拼接订单编号
        String orderNumber = timePart + randomPart;
        return orderNumber;
    }

    private static String generateRandomString() {
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(OrderNoGenerator.RANDOM_PART_LENGTH);
        for (int i = 0; i < OrderNoGenerator.RANDOM_PART_LENGTH; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}

