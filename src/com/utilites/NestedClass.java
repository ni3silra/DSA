package com.utilites;

public class NestedClass {
    ParentClass parentClass;

    static class ParentClass {
        Child1 child1;

        static class Child1 {
            Child11 child11;
            Child12 child12;

            static class Child11 {
            }

            static class Child12 {
            }
        }
    }

    public static NestedClass createOriginal() {
        ParentClass.Child1.Child12 child12 = new ParentClass.Child1.Child12();
        ParentClass.Child1.Child11 child11 = new ParentClass.Child1.Child11();

        ParentClass.Child1 child1 = new ParentClass.Child1();
        child1.child11 = child11;
        child1.child12 = child12;

        ParentClass parentClass = new ParentClass();
        parentClass.child1 = child1;

        NestedClass nestedClass = new NestedClass();
        nestedClass.parentClass = parentClass;
        return nestedClass;
    }


    public static void main(String[] args) {
        NestedClass nestedClass = createOriginal();
        NestedClass deepCopy = deepCopy(nestedClass);
    }

    private static NestedClass deepCopy(NestedClass nestedClass) {
        return nestedClass;
    }
}
