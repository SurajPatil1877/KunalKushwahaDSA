package interviewQuestions;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};

        //using stream
//        List<Integer> unique = Arrays.stream(arr)
//                                      .distinct()
//                                      .boxed()
//                                      .toList();
//
//        System.out.println(unique);

        //using core

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }

        for(int i =0;i<index;i++){
            System.out.println(arr[i]);
        }


    }
}
