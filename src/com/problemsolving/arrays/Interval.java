package com.problemsolving.arrays;

public class Interval {
        public int start;
        public int end;

        public Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval [start=" + start + ", end=" + end + "]";
        }

}
