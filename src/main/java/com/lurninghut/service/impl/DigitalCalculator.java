package com.lurninghut.service.impl;

import com.lurninghut.service.Calculator;

public class DigitalCalculator implements Calculator {
    @Override
    public int sumInt(int i, int j) {
        return i + j;
    }

    @Override
    public int diffInt(int i, int j) {
        return i - j;
    }
}
