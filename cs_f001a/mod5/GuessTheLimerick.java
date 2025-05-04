package mod5;

import java.util.Scanner;

public class GuessTheLimerick {
    //Declaring Limerick with answer as it is used across methods
    public static String limerickWithAnswer = "\n" +
                         "A coder once pressed “build” with flair,\n" + 
                         "But forgot all his null checks were bare.\n" + 
                         "The app gave a wheeze,\n" + 
                         "Then crashed with a tease—\n" + 
                         "“Exception? I barely was there!”" +
                         "\n";    
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        //Declare variables
        String menu = new String();
        menu = "\n" +
               "Please select an option below by entering the number associated with each menu option...\n\n" +
               "1. Play\n" +
               "2. Cheat\n" +
               "3. Exit\n\n";
        Scanner input = new Scanner(System.in);
        int userInput = -1;

        //Print menu
        System.out.println(menu);

        //While loop to control menu selections

        while(userInput != 3) {
            userInput = input.nextInt();
            if(userInput == 1) {
                guessLimerick(input);
            } else if (userInput == 2) {
                System.out.println(limerickWithAnswer);
            } else if (userInput == 3) {
                System.out.println("\nExiting...");
            } else {
                System.out.println("Please enter a valid menu selection.");
            }
        }
        input.close();
    }
    public static void guessLimerick(Scanner inputVar) {
        //Declaring variables

        String limerickWithoutAnswer = new String();
        limerickWithoutAnswer =  "\n" +
                                 "A coder once pressed “build” with flair,\n" + 
                                 "But forgot all his null checks were bare.\n" + 
                                 "The app gave a wheeze,\n" + 
                                 "Then crashed with a tease—\n" + 
                                 "“Exception? I barely was [INSERT MISSING WORD]!”" +
                                 "\n";       
        String correctAnswer = new String("there");
        String playerAnswer = new String();
        String instructions = new String("Take a look at the limerick above and guess the missing word by typing it in (in all lower case letters)!\n");
        int gamesPlayed = 0;
        boolean isCorrectlyAnswered = false;
        
        //Print Instructions
        System.out.println(limerickWithoutAnswer);
        System.out.println(instructions);

        // While loop to control gameplay

        while(gamesPlayed < 5 && !isCorrectlyAnswered) {
            //Ask for answer
            System.out.println();
            playerAnswer = inputVar.next();

            //Evaluate if correct
            if(playerAnswer.equals(correctAnswer)) {
                isCorrectlyAnswered = true;
                System.out.println();
                System.out.println("Congratulations! Correct Answer!");
                System.out.println(limerickWithAnswer);
            } else {
                gamesPlayed++;
                System.out.println();

                //Evaluate if game over to determine response
                if(gamesPlayed < 5) {
                    System.out.println("Wrong answer! Please try again.\n");
                } else {
                    System.out.println("Game over. Press 3 to Exit.\n");
                }
            }
        }
    }
}

/* EXAMPLE OUTPUT BELOW

NOTE: Exit behavior demonstrated in all scenarios.
 
SCENARIO A: Successful Playthrough
 
Please select an option below by entering the number associated with each menu option...

1. Play
2. Cheat
3. Exit


1

A coder once pressed “build” with flair,
But forgot all his null checks were bare.
The app gave a wheeze,
Then crashed with a tease—
“Exception? I barely was [INSERT MISSING WORD]!”

Take a look at the limerick above and guess the missing word by typing it in (in all lower case letters)!


there

Congratulations! Correct Answer!

A coder once pressed “build” with flair,
But forgot all his null checks were bare.
The app gave a wheeze,
Then crashed with a tease—
“Exception? I barely was there!”

3

Exiting...

SCENARIO B: Cheating

Please select an option below by entering the number associated with each menu option...

1. Play
2. Cheat
3. Exit


2

A coder once pressed “build” with flair,
But forgot all his null checks were bare.
The app gave a wheeze,
Then crashed with a tease—
“Exception? I barely was there!”

3

Exiting...

SCENARIO C: Unsuccesful Playthrough

Please select an option below by entering the number associated with each menu option...

1. Play
2. Cheat
3. Exit


1

A coder once pressed “build” with flair,
But forgot all his null checks were bare.
The app gave a wheeze,
Then crashed with a tease—
“Exception? I barely was [INSERT MISSING WORD]!”

Take a look at the limerick above and guess the missing word by typing it in (in all lower case letters)!


First

Wrong answer! Please try again.


Second

Wrong answer! Please try again.


Third

Wrong answer! Please try again.


Fourth

Wrong answer! Please try again.


Fifth

Game over. Press 3 to Exit.

3

Exiting...

 */