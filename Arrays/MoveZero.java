import java.util.*;

public class MoveZero {
    // Optimal Technique
    // Two Pointer Apporaches
    public static void MoveZeroEle(int[] arra) {
        int j = 0;

        for (int i = 0; i < arra.length; i++) {
            if (arra[i] != 0) {
                int temp = arra[i];
                arra[i] = arra[j];
                arra[j] = temp;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        /*
         * 1.Problem Statement - > Move Zero to the END
         * 2.Input output -> IP - arr[] ={ 0,0 ,5,2,0,8} -> OP arr[] ={ 5,2,8,0,0,0}
         * 3.Brute Force - 1. arr Temp
         * 2. travel arr
         * 3. copy temp arr
         * 4. remain stay zero
         * 5.copy arrays temp arr back
         * 
         * 4.Optimal Apporach
         * 5.Java Code
         * 6.Dry run
         * 7.TC & SC
         * 8.Edge case
         */

        int[] arr = { 0, 5, 2, 0, 8 };
        int[] arra = { 1, 0, 0, 4, 5 };
        int n = arr.length;

        int temp[] = new int[n];

        int index = 0;
        // copy non - zero element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // copy non -zero element bacjoriginal element add

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));

        MoveZeroEle(arra);
        System.out.println((Arrays.toString(arra)));
    }
}