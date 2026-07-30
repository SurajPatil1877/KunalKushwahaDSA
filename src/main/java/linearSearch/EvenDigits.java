package linearSearch;

public class EvenDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2055626481/
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

    }

   static int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

     static boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        return count % 2 == 0;
    }
}
