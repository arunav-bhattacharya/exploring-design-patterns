package me.arunav.design.patterns.behavioral.strategy.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SomeDomainDO {

    private String attr1;
    private List<String> attr2List;
    private String status;
    private String timeStamp;
    private double amount;
    private String description;
}
