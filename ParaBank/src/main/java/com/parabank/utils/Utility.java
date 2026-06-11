package com.parabank.utils;

public class Utility {

    public static String getUniqueUsername() {

        long time = System.currentTimeMillis();

        return "user" + time;
    }
}