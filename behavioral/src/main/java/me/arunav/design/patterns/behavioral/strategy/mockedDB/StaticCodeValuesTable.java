package me.arunav.design.patterns.behavioral.strategy.mockedDB;

import me.arunav.design.patterns.behavioral.strategy.StaticCodeValues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticCodeValuesTable {

    private static final Map<String, StaticCodeValues> staticCodeValues = new HashMap<>();

    public static StaticCodeValues getStaticCodeValue(String key) {
        return staticCodeValues.get(key);
    }

    public static void loadData() {
        System.out.println("Loading Static Code Values...");
        staticCodeValues.put("key1", new StaticCodeValues("key1_attr1", List.of("key1_attr2a", "key1_attr2b"), true, 1));
        staticCodeValues.put("key2", new StaticCodeValues("key2_attr1", List.of("key2_attr2a", "key2_attr2b"), false, 2));
        staticCodeValues.put("key3", new StaticCodeValues("key3_attr1", List.of("key3_attr2a", "key3_attr2b"), false, 3));
    }
}
