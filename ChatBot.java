import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        greetUser();
        String userName = askName();
        int userAge = guessUserAge();
        tellStoryAboutUser(userName, userAge);
        countToNumber();
        testProgrammingKnowledge();
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome to the chat bot program.");
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you please tell me your name? ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    public static int guessUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game. I will try to guess your age.");
        System.out.print("In which year were you born? ");
        int yearBorn = scanner.nextInt();
        int currentYear = 2024;
        int age = currentYear - yearBorn;
        System.out.println("Let me guess... You are " + age + " years old!");
        return age;
    }

    public static void tellStoryAboutUser(String name, int age) {
        System.out.println("Here's a little story about you, " + name + ":");
        System.out.println("Once upon a time, in a world not so far away, there was a person named " + name + ".");
        System.out.println(name + " was " + age + " years old and full of energy and curiosity.");
        System.out.println("Every day was an adventure for " + name + ", whether it was exploring new hobbies, learning new things, or making new friends.");
        System.out.println(name + " always found a way to bring joy and positivity to those around them.");
        System.out.println("And this is just the beginning of many more wonderful chapters in the story of " + name + "'s life.");
    }

    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and I will count to it: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        String question = "Which of the following is a Python data type?";
        String[] options = {"1. String", "2. Integer", "3. List", "4. All of the above"};
        String correctAnswer = "4";

        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }

        String answer;
        do {
            System.out.print("Enter the number of the correct answer: ");
            answer = scanner.nextLine();
            if (!answer.equals(correctAnswer)) {
                System.out.println("Incorrect. Try again.");
            }
        } while (!answer.equals(correctAnswer));

        System.out.println("Correct! Well done!");
    }
}