/*
AlgoForge ⚔️ — LeetCode 1295
Find Numbers with Even Number of Digits
*/

public class findNumbers{

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                digits++;
                num = num / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 6666, 44, 5678};

        int result = findNumbers(nums);

        System.out.println(result);
    }
}