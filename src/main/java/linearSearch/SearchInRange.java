package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 28;
        int startRange = 1;
        int endRange = 4;

        System.out.println(searchRange(startRange, endRange, arr, target));
    }

    static int searchRange(int startRange, int endRange, int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = startRange; i <= endRange; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
