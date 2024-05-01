/* Author: Jose Romero
    Created Date: Mar 23, 2024
    Description: This program is intended to randomly generate 5 practice times tables problems.
    At the end of the program, the user will be given their score for the test and told which questions 
    they got incorrect. 
 */

import java.util.Scanner;
import java.util.ArrayList;

class TimesTables {
    // Beginning of Main method
    public static void main(String[] args){
        // Declares new Scanner reader.
        Scanner input = new Scanner(System.in);
        // Greets the user and prompts them for their name.
        System.out.println("Hello, my name is Robo-bert. I will be the proctor for your exam today.");
        System.out.print("What's your name? ");
        // Reads the user's inputted name.
        String name = input.nextLine();
        // Greets the user by name.
        System.out.println("\n--------------------");
        System.out.println("Hello, " + name + "! It is nice to meet you!");

        // Explain instructions to user.
        explainInstructions();

        // Declares variable to check store if user is ready or not.
        String readiness = "";

        // While loop will start test if user is ready and end program if user is not ready.
        while (readiness == "") {
            System.out.print("\nAre you ready to start your practice session? (Type Y for yes or N for no): ");
            readiness = input.nextLine();
            // If user is ready, begin test.
            if(readiness.equalsIgnoreCase("Y")) {
                System.out.println("\n--------------------");
                System.out.println("Great! Let's get started!");
                startTest();
            }
            // If user is not ready, end program.
            else if (readiness.equalsIgnoreCase("N")) {
                System.out.println("\n--------------------");
                System.out.println("That's okay! Feel free to come back anytime once you're ready to practice :)");
            }
            // If user adds an invalid input, tell them to only answer with Y or N, then restart loop.
            else {
                System.out.println("\n--------------------");
                System.out.println("Please only answer Y or N.");
                System.out.println("\n--------------------");
                readiness = ""; // Set readiness to "" to reset loop.
            }
        }
        // Close Scanner object to prevent resource leak
        input.close();
    } // End of Main method

    // This method prints instructions to the user
    public static void explainInstructions(){
        // Here are the instructions that will be printed. The \n escape character is utilized to make the insturctions more legible in the console.
        System.out.println("\nToday we are going to do a mini math test. \nI will ask you 5 math questions, and at the end, \nI will tell you how you did. \n\nFor each question, you should only answer with integer values (1, 2, 3, etc.). \n\nDecimal values, letters, spaces, and special characters will not be accepted\n");
    }

    // This method is used to begin the practice test
    public static void startTest() {
        // Create Scanner object to read user's answers.
        Scanner input = new Scanner(System.in);
        // correctCount counts the number of questions the user gets correct.
        int correctCount = 0;
        // ArrayList used to record which questions the user gets wrong.
        ArrayList<Integer> wrongList = new ArrayList<>();
        // questionNum will label the questions for the user so they know if it is question 1, 2, 3, 4, or 5.
        Integer questionNum = 1;

        // for loop will generate random questions for the user.
        for (int question = 1; question <= 5; question++) {
            // Generate 2 random integers that will be multiplied together in our questions
            int firstNumber = 1 + (int) (Math.random() * 12);
            int secondNumber = 1 + (int) (Math.random() * 12);
            // answer stores the answer to the randomly generated question.
            int answer = firstNumber * secondNumber;
            // Print out question
            System.out.print(questionNum + ". " + firstNumber + " X " + secondNumber + " = ");
            // responseStr will store the user's response as a String.
            String responseStr;
            boolean validInput = false;
            while (!validInput) {
                // Read user's input
                responseStr = input.nextLine();
                // If user's response contains a space, prompt them to try answering again.
                // If the user's response does not contain a space, then try to read the user's input.
                if (!responseStr.contains(" ")) {
                    try {
                        // Read user's input, convert it to an integer, and save it to response variable.
                        int response = Integer.parseInt(responseStr);
                        // If user's response is the correct answer, give them a point and ask the next question.
                        if (response == answer) {
                            validInput = true;
                            correctCount++;
                            System.out.println("\n--------------------");
                        } 
                        // If user answers incorrectly, do not give them a point, and record the question they got incorrect.
                        else {
                            System.out.println("\n--------------------");
                            wrongList.add(questionNum);
                            break; // break out of the loop to generate a new question
                        }
                    } catch (NumberFormatException e) {
                        // Invalid input (not an integer)
                        System.out.println("\n--------------------");
                        System.out.println("Please be sure to only use integers as answers (1, 2, 3, etc.).\nNo decimal points, letters, spaces, or invalid characters are accepted.");
                        System.out.print("\n" + questionNum + ". " + firstNumber + " X " + secondNumber + " = ");
                    }
                } 
                else {
                    // Invalid input (contains spaces)
                    System.out.println("\n--------------------");
                    System.out.println("Please be sure to only use integers as answers (1, 2, 3, etc.).\nNo decimal points, letters, spaces, or invalid characters are accepted.");
                    System.out.print("\n" + questionNum + ". " + firstNumber + " X " + secondNumber + " = ");
                }
            }
            // Increment label for which question we're on.
            questionNum++;
        }
        input.close();
        // Display results to user
        // If the user got everything right, tell them they got 100%
        if (correctCount == 5) {
            System.out.println("You got 5 questions correct out of 5.");
            System.out.println("Congratulations, you got 100%");
        }
        // If the user got some questions wrong, tell them how many they got correct, and which they answered incorrectly.
        else {
            System.out.println("You got " + correctCount + " correct out of 5.");
            System.out.println("You got the following questions incorrect " + wrongList);
        }
    }
}