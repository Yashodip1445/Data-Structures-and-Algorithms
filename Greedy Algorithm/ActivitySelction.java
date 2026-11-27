
/* Question

You are given an activity with their start and end time. 
Select the maximum number of activity that can be performed by a single person,
assuming that a person can only work on a single activity at a time. 
Activity are sorted according to the end time ? */
import java.util.*;
import java.util.ArrayList;

public class ActivitySelction {

    public static void main(String args[]) {

        // int start[] = { 1, 3, 0, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9 };
        int start[] = { 10 , 12, 20};
        int end[] = { 20 , 25, 30};

        // logic :->

        // 1. End time sorted
        // 2 A0 1St activity
        // 3. Non overlapping -> start time >= last choose act end time

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // actvity
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }

        }
        System.out.println("max acitvity = " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A " + ans.get(i) + "");
        }

        System.out.println();

    }

}

/*
 * import java.util.*;
 * 
 * class Activity {
 * int start;
 * int finish;
 * 
 * Activity(int start, int finish) {
 * this.start = start;
 * this.finish = finish;
 * }
 * }
 * 
 * public class ActivitySelction {
 * static int maxActivities(Activity[] activities) {
 * Arrays.sort(activities,
 * Comparator.comparingInt(a -> a.finish));
 * 
 * int count = 0;
 * int lastFinish = Integer.MIN_VALUE;
 * 
 * for (Activity activity : activities) {
 * if (activity.start >= lastFinish) {
 * count++;
 * lastFinish = activity.finish;
 * }
 * }
 * 
 * return count;
 * }
 * 
 * public static void main(String[] args) {
 * Activity[] activities = {
 * new Activity(1, 3),
 * new Activity(2, 5),
 * new Activity(4, 6),
 * new Activity(6, 7),
 * new Activity(5, 9),
 * new Activity(8, 9)
 * };
 * 
 * System.out.println(maxActivities(activities)); // 4
 * }
 * }
 */