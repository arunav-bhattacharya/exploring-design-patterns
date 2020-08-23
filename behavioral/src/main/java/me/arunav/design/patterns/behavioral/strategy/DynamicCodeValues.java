package me.arunav.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

@AllArgsConstructor
@Getter
@Builder
public class DynamicCodeValues {

    private Function<AppDTO, Double> amount;
    private Function<AppDTO, String> status;
    private Function<Date, String> date;
    private Supplier<String> description;

}
