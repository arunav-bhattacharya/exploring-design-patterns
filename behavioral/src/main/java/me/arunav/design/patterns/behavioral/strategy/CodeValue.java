package me.arunav.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CodeValue {

    private StaticCodeValues staticCodeValues;
    private DynamicCodeValues dynamicCodeValues;
}

