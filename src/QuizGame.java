import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // JAVA QUIZ GAME WITH 2D Arrays

        // Task:
        // Questions array[]
        // Options array[][]
        // Declare variables
        // Welcome message
        // Question (in loop)
        // Options
        // Get guess from user
        // Check user's guess
        // Display final score

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the default value of a local variable in Java?",
                "Which keyword is used to prevent a class from being inherited in Java?",
                "Which collection class allows you to store elements as key-value pairs?"
        };
        String[][] options = {
                { "null", "It does not have a default value and must be initialized before use", "0" },
                { "final", "static", "abstract" },
                { "ArrayList", "HashSet", "HashMap" }
        };
        int[] answers = { 2, 1, 3 };
        int score = 0;

        welcomeMessage();

        for (int i = 0; i < questions.length; i++) {
            showQuestion(questions, options, i);
            score += respondQuestion(scanner, i, answers);
        }

        showScore(score);

        scanner.close();
    }

    static void welcomeMessage() {
        System.out.println("------------");
        System.out.println("JAVA QUIZ GAME");
        System.out.println("------------");
    }

    static void showQuestion(String[] questions, String[][] options, int curQuestionIndex) {
        System.out.println(curQuestionIndex + 1 + ". " + questions[curQuestionIndex]);

        for (String answer : options[curQuestionIndex]) {
            System.out.println("- " + answer);
        }
    }

    static int respondQuestion(Scanner scanner, int qurQuestionIndex, int[] answers) {
        System.out.print("Choose an answer of question: ");
        int answer = scanner.nextInt();

        if (answer == answers[qurQuestionIndex]) {
            return 1;
        }

        return 0;
    }

    static void showScore(int score) {
        System.out.println("------------");
        System.out.printf("Finish! Your score is: %d\n", score);
        System.out.println("------------");
    }
}