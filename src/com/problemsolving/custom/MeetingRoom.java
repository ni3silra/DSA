package com.problemsolving.custom;

import com.datastructure.array.Arrays;
import com.problemsolving.arrays.Interval;

public class MeetingRoom {
    public boolean canAttendMeetings(Interval[] interval) {
        Integer[] start = new Integer[interval.length];
        Integer[] end = new Integer[interval.length];

        for (int i = 0; i < interval.length; i++) {
            start[i] = interval[i].start;
            end[i] = interval[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < start.length - 1; i++)
            if (start[i + 1] < end[i])
                return false;
        return true;
    }
}
