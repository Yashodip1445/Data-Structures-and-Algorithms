// merged two sorted Arrays

/*
core logic
 #1-> Brute force
 - Create new arrays
 - copy arr1
 - copy arr2
 - sort
 - result 
 
 

*/
import java.util.*;

public class MergedSorted {


    
    public static void main(String[] args) {

        int arr1[] = { 1, 9, 4, 8 };
        int arr2[] = { 2, 8, 5, 6 };

        int n = arr1.length;
        int m = arr2.length;

        int merged[] = new int[n + m];

        // copy arr1

        for (int i = 0; i < n; i++) {
            merged[i] = arr1[i];

        }
        // copy arr2
        for (int j = 0; j < n; j++) {
            merged[n + j] = arr2[j];
        }

        Arrays.sort(merged);

        System.out.println(Arrays.toString(merged));

    }
}