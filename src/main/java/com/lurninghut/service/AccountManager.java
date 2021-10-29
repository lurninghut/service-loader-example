package com.lurninghut.service;

import java.util.ServiceLoader;

public class AccountManager {
    private Calculator digitalCalculator;

    public AccountManager() {
        ServiceLoader.load(Calculator.class).findFirst().ifPresent(dc -> this.digitalCalculator = dc);
    }

    public void audit(){
        System.out.println(digitalCalculator.sumInt(2,2));
    }
}
