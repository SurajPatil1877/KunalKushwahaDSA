package randomQuestionProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GetRandomQuestionToRun {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("**************** Welcome to Random Question Portal ****************");
        System.out.println("Please select option from given below list.");
        System.out.println("1. Add Question\n2. Get Random Question\n 3. Get Question on ID\n4. Update Question Details");


        int options = Integer.parseInt(br.readLine());

        switch (options) {
            case 1:
                System.out.println("Enter Question");
                String question = br.readLine();
                System.out.println("Do want to add description?");
                System.out.println("1. Yes\n 2. No");
                int isDescription = Integer.parseInt(br.readLine());
                switch (isDescription) {
                    case 1:
                        System.out.println("Please enter description");
                        String questionDescription = br.readLine();
                        System.out.println("********** Adding Details in DB **********");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Invalid Option selected");
                }
                // will call add question method
                break;
            case 2:
                // will call getRandom Question method
                break;
            case 3:
                //will call question on id
                System.out.println("Please enter question id");
                int questionId = Integer.parseInt(br.readLine());
                break;
            case 4:
                //will update question details on id
                System.out.println("Please enter question id");
                int questionIdForUpdate = Integer.parseInt(br.readLine());
                break;
            default:
                System.out.println("Invalid Option selected");
        }

//        String url = "jdbc:postgresql://localhost:5432/DSAQuestions";
//        String username = "postgres";
//        String password = "toor";
//
//        String query = "INSERT INTO questions (question) VALUES  (?)";
//        try (
//                Connection connection = DriverManager.getConnection(url, username, password);
//                PreparedStatement ps = connection.prepareStatement(query)
//        ) {
//            ps.setString(1, "testQuestion1");
//            int i = ps.executeUpdate();
//            System.out.println("Row inserted " + i);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    static void addQuestion() {

    }

    static void getRandomQuestion() {

    }

    static void updateQuestionDetails() {

    }

}
