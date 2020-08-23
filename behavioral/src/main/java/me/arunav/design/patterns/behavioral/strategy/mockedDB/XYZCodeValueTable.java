package me.arunav.design.patterns.behavioral.strategy.mockedDB;

import java.util.HashMap;
import java.util.Map;

public class XYZCodeValueTable {

    private static final Map<Integer, String> xyzCodeValues = new HashMap<>();

    public static String getDescription(int key) {
        return xyzCodeValues.get(key);
    }

    public static void loadData() {
        System.out.println("Loading XYZ Code Values...");
        xyzCodeValues.put(1, "PENDING");
        xyzCodeValues.put(2, "PROCESSING");
        xyzCodeValues.put(3, "PROCESSED");
    }
}
