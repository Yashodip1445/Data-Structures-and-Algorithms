
/* Question

You are given an activity with their start and end time. 
Select the maximum number of activity that can be performed by a single person,
assuming that a person can only work on a single activity at a time. 
Activity are sorted according to the end time ? */

import java.util.*;

class Activity {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelction {
    static int maxActivities(Activity[] activities) {
        Arrays.sort(activities,
                Comparator.comparingInt(a -> a.finish));

        int count = 0;
        int lastFinish = Integer.MIN_VALUE;

        for (Activity activity : activities) {
            if (activity.start >= lastFinish) {
                count++;
                lastFinish = activity.finish;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Activity[] activities = {
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(4, 6),
                new Activity(6, 7),
                new Activity(5, 9),
                new Activity(8, 9)
        };

        System.out.println(maxActivities(activities)); // 4
    }
}