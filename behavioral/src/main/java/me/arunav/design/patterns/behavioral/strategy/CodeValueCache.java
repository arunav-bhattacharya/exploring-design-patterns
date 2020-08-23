package me.arunav.design.patterns.behavioral.strategy;

import me.arunav.design.patterns.behavioral.strategy.mockedDB.StaticCodeValuesTable;

import java.util.HashMap;
import java.util.Map;

import static me.arunav.design.patterns.behavioral.strategy.DynamicCodeValuesMappingStrategy.*;

public class CodeValueCache {

    private static final Map<String, CodeValue> codeValueMap = new HashMap<>();

    // Building the cache during application startup
    public static void buildCodeValues() {

        System.out.println("Building Cache...");
        codeValueMap.put("key1", new CodeValue(getStaticCodeValueFromDB("key1"), DynamicCodeValues.builder()
                .amount(USD_AMOUNT)
                .status(SIMPLE_STATUS)
                .description(DESCRIPTION1)
                .date(TIME)
                .build()));

        codeValueMap.put("key2", new CodeValue(getStaticCodeValueFromDB("key2"), DynamicCodeValues.builder()
                .amount(INR_AMOUNT)
                .status(DERIVED_STATUS)
                .description(DESCRIPTION1)
                .date(DATE)
                .build()));

        codeValueMap.put("key3", new CodeValue(getStaticCodeValueFromDB("key3"), DynamicCodeValues.builder()
                .amount(GBP_AMOUNT)
                .status(DERIVED_STATUS)
                .description(DESCRIPTION2)
                .date(DATE)
                .build()));
    }

    public static CodeValue getCodeValue(String key) {
        return codeValueMap.get(key);
    }

    private static StaticCodeValues getStaticCodeValueFromDB(String key) {
        return StaticCodeValuesTable.getStaticCodeValue(key);
    }
}
