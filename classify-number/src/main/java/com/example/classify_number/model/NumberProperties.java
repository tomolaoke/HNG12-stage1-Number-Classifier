package com.example.classifynumber.model;

import java.util.List;

public class NumberProperties {
    private int number;
    private boolean isPrime;
    private boolean isPerfect;
    private List<String> properties;
    private int digitSum;
    private String funFact;
    private boolean error;

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public boolean isPerfect() {
        return isPerfect;
    }

    public void setPerfect(boolean perfect) {
        isPerfect = perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public int getDigitSum() {
        return digitSum;
    }

    public void setDigitSum(int digitSum) {
        this.digitSum = digitSum;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
