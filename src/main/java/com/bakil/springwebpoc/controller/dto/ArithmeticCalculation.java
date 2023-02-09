package com.bakil.springwebpoc.controller.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ArithmeticCalculation extends ResponseModel{
    @NotNull
    @Pattern(regexp = "^[\\d]", message = "The value1 should be a number")
    private String value1;
    @NotNull
    @Pattern(regexp = "^[\\d]", message = "The value2 should be a number")
    private String value2;
    @NotNull
    @Size(max = 1, message = "The operation should be either +, -, / or *")
    private String operation;

    private double result;

    public double getResult() {
        return result;
    }

    public ArithmeticCalculation setResult(double result) {
        this.result = result;
        return this;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
