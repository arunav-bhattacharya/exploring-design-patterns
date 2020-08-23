package me.arunav.design.patterns.behavioral.strategy.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class AppDTO {

    private String key;
    private String country;
    private Date date;
    private double amount;
    private String description;
    private int statusId;

}
