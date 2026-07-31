package interviewQuestions;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9};
        int sum = 0;

        for(int i: arr){
            sum+=i;
        }

        System.out.println(sum);

    }
}
