package com.company;

import java.util.Stack;

public class ExpressionParsingAlgorithm {

    public static double parse(String expression) {
        char[] chars = expression.toCharArray();

        Stack<Character> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

        for(int i = 0; i < chars.length; i ++){
            char symbol = chars[i];

            if(symbol == '(') {

            } else if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/'){
                operators.push(symbol);
            } else if(symbol == ')') {
                char operator = operators.pop();
                double rightValue = values.pop();
                double leftValue = values.pop();

                if(operator == '+') {
                    double tempValue = leftValue + rightValue;
                    values.push(tempValue);

                } else if(operator == '-') {
                    double tempValue = leftValue - rightValue;
                    values.push(tempValue);

                } else if(operator == '*') {
                    double tempValue = leftValue * rightValue;
                    values.push(tempValue);

                } else if(operator == '/') {
                    double tempValue = leftValue / rightValue;
                    values.push(tempValue);
                }

            } else {
                values.push(Double.parseDouble(String.valueOf(symbol)));
            }
        }

        return values.pop();
    }
}
