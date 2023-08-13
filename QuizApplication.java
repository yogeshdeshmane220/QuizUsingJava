import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String question;
    private ArrayList<String> options;
    private int correctOption;

    public Question(String question, ArrayList<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOption;
    }

   public int getCorrectOption() {
        return correctOption;
    }
}

class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());
            
            ArrayList<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer: ");
            int userChoice = scanner.nextInt();

            if (currentQuestion.isCorrect(userChoice)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + options.get(currentQuestion.getCorrectOption()));
                System.out.println();
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}

public class QuizApplication {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz (10 to 15 questions)
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("4");
        options1.add("5");
        options1.add("6");
        options1.add("7");
        Question question1 = new Question("What is 2 + 2?", options1, 1);
        quiz.addQuestion(question1);

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("Mercury");
        options2.add("Venus");
        options2.add("Mars");
        options2.add("Jupiter");
        Question question2 = new Question("Which planet is known as the 'Red Planet'?", options2, 3);
        quiz.addQuestion(question2);

        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Light Amplification by Stimulated Emission of Radiation");
        options3.add("Linear Amplification by Stimulated Energy of Radiation");
        options3.add("Low Amplitude by Stimulated Emission of Radio");
        options3.add("Light Amplification by Stimulated Emission of Radio");
        Question question3 = new Question("What does the acronym 'LASER' stand for?", options3, 1);
        quiz.addQuestion(question3);

        // Add more questions...

        // Start the quiz
        System.out.println("Welcome to the Quiz!");
        quiz.startQuiz();
    }
}
