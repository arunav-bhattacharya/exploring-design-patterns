package me.arunav.design.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CodeValue {

    private StaticCodeValue staticCodeValue;
    private DynamicCodeValue dynamicCodeValue;
}

