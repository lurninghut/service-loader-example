package com.lurninghut.service;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        ServiceLoader<Calculator> services = ServiceLoader.load(Calculator.class);
        services.findFirst().ifPresent(calculator -> System.out.println(calculator.sumInt(2,2)));
    }
}
