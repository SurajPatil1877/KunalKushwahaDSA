package interviewQuestions;

public class RemoveOccurrences {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 5, 1};
        int[] temp = new int[arr.length];
        int key = 1;
        int count = 0;
        for (int i : arr) {
            if (i != key) {
                temp[count++] = i;
            }
        }

     for(int i =0;i<count ; i++){
         System.out.println(temp[i]);
     }
    }
}
