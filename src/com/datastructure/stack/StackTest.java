package com.datastructure.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> mySyack = new StackByTwoQueue();
        java.util.Stack<Integer> javaStack = new java.util.Stack<>();

        for (int i = 0; i < 5; i++) {
            mySyack.push(i);
            javaStack.push(i);
        }

        javaStack.pop();
        mySyack.pop();

        mySyack.push(4);
        javaStack.push(4);

        if(mySyack.size() == javaStack.size())
            System.out.println("SIZE SUCCESS");

        if(mySyack.isEmpty() == javaStack.isEmpty())
            System.out.println("EMPTY SUCCESS");

        for (int i = 0; i < javaStack.size(); i++) {
            int currentElement = javaStack.pop();
            int currentElementFromMyStack = mySyack.peek();
            if (currentElement != currentElementFromMyStack)
                System.out.println("NO SUCCESS");
            mySyack.pop();
        }
        System.out.println("READ SUCCESS");

        if(mySyack.isEmpty() == javaStack.isEmpty())
            System.out.println("EMPTY SUCCESS");



    }
}
