package binarySearch;

public class BinarySearchAnyOrder {
    public static void main(String[] args) {
//        int[] arrD = {18, 16, 14, 9, 5, 3, 2};
//        int[] arrA = {2, 3, 5, 9, 14, 16, 18};
//        int target = 14;
        int[] arrD = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("Index of target is : " + orderAgnosticBinarySearch(arrD, target));
    }


    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
