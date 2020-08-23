package me.arunav.design.patterns.behavioral.strategy.mockedDB;

import java.util.HashMap;
import java.util.Map;

public class StatusTable {

    private static final Map<Integer, String> statusValues = new HashMap<>();

    public static String getDescription(int key) {
        return statusValues.get(key);
    }

    public static void loadData() {
        System.out.println("Loading Status...");
        statusValues.put(1, "PENDING");
        statusValues.put(2, "PROCESSING");
        statusValues.put(3, "PROCESSED");
    }
}
