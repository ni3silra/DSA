package com.other;

public class Simple {
    public static void main(String[] args) {
//        int a = 0;//
//        int b = 25;//
//        int result = 0;
//        try {
//            result = b / a;
//        } catch (Exception e) {
//            System.out.println("Pagal h kya... " + e.getMessage());
//        }
//        System.out.println(result);

        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 6;

        try {
            arr[3] = 5;
        } catch (Exception e) {
            System.out.println("size toh dekh le ganwaar...");
        }


        // database open
        try {
            // database data fetch -> table not present (Exception)
        }catch (Exception e){
           // handle table not found
        }finally {
            // clean up activity
            // database close
        }

    }
}
