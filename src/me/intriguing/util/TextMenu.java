package me.intriguing.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextMenu {

    public static Scanner s = new Scanner(System.in);
    private String title;
    private List<String> questions;

    public TextMenu(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    /**
     * Runs the questionnaire witch asks them questions
     * @return The response of which question they selected
     */
    public int run() {
        // Initiate the response variable
        int response = 0;

        // Run loop until valid value is retrieved
        while (true) {

            // Print the title
            System.out.println(title);

            // If the questions are empty, then don't run the loop. It will return 0 if there are no questions.
            if (questions.isEmpty()) {
                System.out.printf("Title %s: Questions is empty.%n", title);
                break;
            }

            // Print each question
            for(int i = 1; i <= questions.size(); i++) {
                System.out.printf("%s - %s%n",  i, questions.get(i-1));
            }

            // Try to parse the response as an integer, otherwise continue.
            try {
                response = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR! You did not provide a valid number!");
                continue;
            }


            // Check if response is within range, otherwise continue.
            if (!(response > 0 && response < questions.size())) {
                System.out.printf("You did not enter a number between 1 and %s%n", questions.size());
                continue;
            }
            break;
        }
        return response;
    }


    /**
     * Add a question to the List of questions.
     * @param question that will be added
     * @return TextMenu Class
     */
    public TextMenu add(String question) {
        questions.add(question);
        return this;
    }

}
