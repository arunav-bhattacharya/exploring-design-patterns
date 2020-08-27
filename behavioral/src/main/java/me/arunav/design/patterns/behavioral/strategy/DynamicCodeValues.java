package me.arunav.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import me.arunav.design.patterns.behavioral.strategy.vo.AppDTO;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

@AllArgsConstructor
@Builder
@Getter
public class DynamicCodeValues {

    private Function<AppDTO, Double> amount;
    private Function<AppDTO, String> status;
    private Function<Date, String> date;
    private Supplier<String> description;

    public static <T> T fetch(Supplier<T> supplier) {
        return supplier.get();
    }

    public static <T, R> R transform(Function<T, R> function, T param) {
        return function.apply(param);
    }
}
