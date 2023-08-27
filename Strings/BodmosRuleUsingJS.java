package Strings;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class BodmosRuleUsingJS {
    public static double solveBODMAS(char[] input) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char c : input) {
            if (Character.isDigit(c)) {
                numbers.push((double) (c - '0')); // Convert char digit to double
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    double operand2 = numbers.pop();
                    double operand1 = numbers.pop();
                    char operator = operators.pop();
                    double result = applyOperator(operand1, operand2, operator);
                    numbers.push(result);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            double operand2 = numbers.pop();
            double operand1 = numbers.pop();
            char operator = operators.pop();
            double result = applyOperator(operand1, operand2, operator);
            numbers.push(result);
        }

        return numbers.pop();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static double applyOperator(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        char[] input = {'1', '+', '2', '-', '3', '*', '4', '/', '2'};
        double result = solveBODMAS(input);
        System.out.println("Result: " + result);
    }
}
