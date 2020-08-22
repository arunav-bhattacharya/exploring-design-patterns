package me.arunav.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import me.arunav.design.patterns.behavioral.strategy.vo.DomainDO;
import me.arunav.design.patterns.behavioral.strategy.vo.SomeCodeValueDO;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@AllArgsConstructor
@Getter
@Builder
public class DynamicCodeValue {

    private Function<DomainDO, String> func1;
    private Function<SomeCodeValueDO, String> func2;
    private BiFunction<DomainDO, SomeCodeValueDO, String> biFunc1;
    private Supplier<String> supp1;
}
