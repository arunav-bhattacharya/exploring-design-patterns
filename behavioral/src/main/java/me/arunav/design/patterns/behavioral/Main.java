package me.arunav.design.patterns.behavioral;

import me.arunav.design.patterns.behavioral.strategy.CodeValueCache;
import me.arunav.design.patterns.behavioral.strategy.Mapper;
import me.arunav.design.patterns.behavioral.strategy.mockedDB.StaticCodeValuesTable;
import me.arunav.design.patterns.behavioral.strategy.mockedDB.StatusTable;
import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        testStrategyPattern();
    }

    private static void testStrategyPattern() {
        StaticCodeValuesTable.loadData();
        StatusTable.loadData();
        CodeValueCache.buildCodeValues();

        Mapper mapper = new Mapper();
        mapper.mapCodeValues(new AppDTO("key1", "US", new Date(), 100.23, "desc for key1", 1));
        mapper.mapCodeValues(new AppDTO("key1", "US", new Date(), 200.00, "desc for key1", 2));
        mapper.mapCodeValues(new AppDTO("key1", "US", new Date(), 300.00, "desc for key1", 3));
        mapper.mapCodeValues(new AppDTO("key2", "IN", new Date(), 100.59, "desc for key2", 1));
        mapper.mapCodeValues(new AppDTO("key2", "IN", new Date(), 200.00, "desc for key2", 2));
        mapper.mapCodeValues(new AppDTO("key2", "IN", new Date(), 200.00, "desc for key2", 3));
        mapper.mapCodeValues(new AppDTO("key3", "GB", new Date(), 200.00, "desc for key3", 1));
        mapper.mapCodeValues(new AppDTO("key3", "GB", new Date(), 100.33, "desc for key3", 2));
        mapper.mapCodeValues(new AppDTO("key3", "GB", new Date(), 100.33, "desc for key3", 3));
    }
}
