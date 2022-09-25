package com.problemsolving.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class PolishSolution {


    public static void main(String[] args) {
        System.out.println(evalRPN(new ArrayList<>(List.of("4", "13", "5", "/", "+"))));
        System.out.println(evalRPN(new ArrayList<>(List.of("2", "1", "+", "3", "*"))));
    }

    public static int evalRPN(ArrayList<String> A) {
        Stack<Integer> stack = new Stack<>();
        for (String s : A) {
            switch (s) {
                case "+":
                    performOperation(stack, "+");
                    break;
                case "-":
                    performOperation(stack, "-");
                    break;
                case "*":
                    performOperation(stack, "*");
                    break;
                case "/":
                    performOperation(stack, "/");
                    break;
                case "":
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        return stack.pop();
    }

    private static void performOperation(Stack<Integer> stack, String s) {
        int num2 = stack.pop();
        int num1 = stack.pop();
        switch (s) {
            case "+":
                stack.push(num1 + num2);
                break;
            case "-":
                stack.push(num1 - num2);
                break;
            case "*":
                stack.push(num1 * num2);
                break;
            case "/":
                stack.push(num1 / num2);
                break;
            default:
                break;
        }
    }

    public static int evalRPN2(String[] A) {
        int n = A.length;
        Stack<String> st = new Stack<>();
        for (String s : A) {
            if (isOperator(s) && !isOperator(st.peek()) && st.size() >= 2) {
                String top1 = st.pop();
                String top2 = st.pop();
                st.push(add(top1, top2, s));
            }
            st.push(s);
        }
        return Integer.parseInt(st.pop());
    }

    static String add(String num1, String num2, String oper) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = 0;
        if (Objects.equals(oper, "+")) {
            z = x + y;
        } else if (Objects.equals(oper, "-")) {
            z = y - x;
        } else if (Objects.equals(oper, "/")) {
            z = y / x;
        } else {
            z = x * y;
        }
        return z + "";
    }

    static boolean isOperator(String s) {
        return Objects.equals(s, "+") || Objects.equals(s, "/") || Objects.equals(s, "*") || Objects.equals(s, "-");
    }
}
