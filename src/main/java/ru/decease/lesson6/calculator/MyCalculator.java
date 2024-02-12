package ru.decease.lesson6.calculator;

import java.util.Collection;

public class MyCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }

    @Override
    public double avg(Collection<Integer> nums) {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("Empty collection");
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.size();
    }

    @Override
    public int min(Collection<Integer> nums) {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("Empty collection");
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(Collection<Integer> nums) {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("Empty collection");
        }
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
