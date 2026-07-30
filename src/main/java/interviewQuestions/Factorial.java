package interviewQuestions;

public class Factorial {
    public static void main(String[] args) {
        int value = 11;
        int fact = 1;
        for (int i = value; i > 0; i--) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
