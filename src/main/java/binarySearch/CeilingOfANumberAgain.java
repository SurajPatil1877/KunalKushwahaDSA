package binarySearch;

public class CeilingOfANumberAgain {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;

        System.out.println("Ceiling of a Target Number is " + floor(arr, target));

    }

    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return start;
    }

    static int floor(int[] arr, int target) {
        if (target < arr[0]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
