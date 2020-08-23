package me.arunav.design.patterns.behavioral.strategy;

import me.arunav.design.patterns.behavioral.strategy.mockedDB.XYZCodeValueTable;
import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class DynamicCodeValueStrategies {

    private DynamicCodeValueStrategies() {
    }

    public static final Function<AppDTO, Double> USD_AMOUNT = appDTO -> appDTO.getAmount();
    public static final Function<AppDTO, Double> INR_AMOUNT = appDTO -> appDTO.getAmount() * 74.93;
    public static final Function<AppDTO, Double> GBP_AMOUNT = appDTO -> appDTO.getAmount() * 0.76;

    public static final Function<AppDTO, String> SIMPLE_STATUS =
            (appDTO) -> XYZCodeValueTable.getDescription(appDTO.getStatusId());

    public static final Function<AppDTO, String> MERGED_STATUS = appDTO ->
            (appDTO.getStatusId() == 1 || appDTO.getStatusId() == 2) ? XYZCodeValueTable.getDescription(2) :
                    XYZCodeValueTable.getDescription(appDTO.getStatusId());

    public static final Supplier<String> DESCRIPTION1 = () -> "Fetch some custom desc1 from DB";
    public static final Supplier<String> DESCRIPTION2 = () -> "Fetch some custom desc2 from DB";

    public static final Function<Date, String> TIME = date -> String.valueOf(date.getTime());
    public static final Function<Date, String> DATE = Date::toString;

}
