package calculator.domain;

import java.util.function.BinaryOperator;

public enum Operator {
    PLUS("+", (nowNumber, returnValue) -> returnValue + nowNumber),
    MINUS("-", (nowNumber, returnValue) -> returnValue - nowNumber),
    MULTIPLY("*", (nowNumber, returnValue) -> returnValue * nowNumber),
    DIVIDE("/", (nowNumber, returnValue) -> returnValue / nowNumber);

    private String operator;
    private BinaryOperator<Double> expression;

    Operator(String operator, BinaryOperator<Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public double calculate(double nowNumber, double returnValue) {
        return expression.apply(nowNumber, returnValue);
    }

    public String getOperator() {
        return this.operator;
    }
}