package com.problemsolving.math;

import java.util.PriorityQueue;

public class CheckFactor {

    public boolean isUgly(int n) {
        if (n <= 1) return true;

        int reducedNum = removeFactor(n,2);

        if(reducedNum != 1)
            reducedNum = removeFactor(reducedNum,3);
        if(reducedNum != 1)
            reducedNum = removeFactor(reducedNum,5);

        return reducedNum == 1;
    }

    public int removeFactor(int num,int factor){
        while(num%factor == 0)
            num/=factor;
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new CheckFactor().getNthUglyNo(11));
    }
// [1, 2, 3, 4, 5, 6,
//  8, 9, 10, 12]
    public int nthUglyNumber(int n) {

        if(n == 1) return 1;

        int output = 0;
        int count = 1;

        for(int i = 2 ; i <=2*n;i++){
            if(count == n){
                output = i-1;
                break;
            }
            if(i%2== 0 || i%3 == 0|| i%5 == 0)
                count++;
        }

        return output;
    }

     int getNthUglyNo(int n)
    {
        if(n==1) return 1;

        PriorityQueue<Long> q = new PriorityQueue();

        q.add(1l);

        for(long i=1; i<n; i++) {

            long tmp = q.peek();

            while(!q.isEmpty() && q.peek()==tmp)
                     q.poll();

            q.add(tmp*2);
            q.add(tmp*3);
            q.add(tmp*5);
        }
        return q.peek().intValue();
    }


}
