package com.test;

public class TestScript {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(!test.isDuplicateAvailable(new int[]{1, 2, 3, 4, 5}));
        System.out.println(test.isDuplicateAvailable(new int[]{1, 2, 2, 4, 5}));
        System.out.println(!test.isDuplicateAvailable(new int[]{1}));
        System.out.println(!test.isDuplicateAvailable(new int[]{1,5}));
        System.out.println(!test.isDuplicateAvailable(new int[]{3,4,5}));
        System.out.println(test.isDuplicateAvailable(new int[]{1,1,2,5}));
        System.out.println(!test.isDuplicateAvailable(null));
    }

}
