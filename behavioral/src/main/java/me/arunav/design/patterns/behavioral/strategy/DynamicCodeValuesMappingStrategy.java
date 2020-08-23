package me.arunav.design.patterns.behavioral.strategy;

import me.arunav.design.patterns.behavioral.strategy.mockedDB.StatusTable;
import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class DynamicCodeValuesMappingStrategy {

    private DynamicCodeValuesMappingStrategy() {
    }

    // Amount Strategy
    public static final Function<AppDTO, Double> USD_AMOUNT = appDTO -> Math.ceil(appDTO.getAmount());
    public static final Function<AppDTO, Double> INR_AMOUNT = appDTO -> Math.ceil(appDTO.getAmount() * 74.93);
    public static final Function<AppDTO, Double> GBP_AMOUNT = appDTO -> Math.ceil(appDTO.getAmount() * 0.76);

    // Status Strategy
    public static final Function<AppDTO, String> SIMPLE_STATUS =
            (appDTO) -> StatusTable.getDescription(appDTO.getStatusId());
    public static final Function<AppDTO, String> DERIVED_STATUS =
            appDTO -> (appDTO.getStatusId() == 1 || appDTO.getStatusId() == 2) ? StatusTable.getDescription(2) :
                    StatusTable.getDescription(appDTO.getStatusId());

    // Description Strategy
    public static final Supplier<String> DESCRIPTION1 = () -> "Custom desc1 from DB";
    public static final Supplier<String> DESCRIPTION2 = () -> "Custom desc2 from DB";

    // Date Strategy
    public static final Function<Date, String> TIME = date -> String.valueOf(date.getTime());
    public static final Function<Date, String> DATE = Date::toString;
}
