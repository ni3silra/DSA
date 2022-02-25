package com.problemsolving.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{([])}"));
        System.out.println(new ValidParentheses().isValid("(){"));
        System.out.println(new ValidParentheses().isValid("()[]"));
        System.out.println(new ValidParentheses().isValid("))))))))"));
        System.out.println(new ValidParentheses().isValid("()"));
    }


    private boolean isValid(String s) {
        Map<Character,Character> mapSymbol = new HashMap<>();
        mapSymbol.put('(',')');
        mapSymbol.put('{','}');
        mapSymbol.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(mapSymbol.containsKey(c)){
                stack.push(c);
            }
            else {
                if(stack.size() == 0)
                    return false;
                if(mapSymbol.get(stack.peek()).equals(c))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.size() == 0 ? true : false;
    }

}
