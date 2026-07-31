package linearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4,-5,100};
        System.out.println("Min: " + min(arr));
        System.out.println("Max: " + max(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
