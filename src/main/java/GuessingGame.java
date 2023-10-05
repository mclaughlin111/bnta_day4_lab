//Import scanner
import java.util.Scanner;

// Game Glass
public class GuessingGame {

    public static void main(String[] args){
        int numberToGuess = 42;
        // int guessNumber = 1; //can you declare ints without assigning a value?

        // Prompt user for input
        System.out.println("😈 Guess my secret number:");

        // Collect User Input
        Scanner guess = new Scanner(System.in); // creates a scanner object called guess
        int guessNumber = guess.nextInt();

        //If statement
        // If equal
        if(guessNumber == numberToGuess)
        {System.out.println("👿 You Guessed My number");}
        // if higher
        else if (guessNumber > numberToGuess){System.out.println("That's higher than my number");}
        // if lower
        else if (guessNumber < numberToGuess){System.out.println("That's lower than my number");}
        // else user entry is not a valid int *!= not equal to operator
        else {System.out.println("Sorry, That's not a valid guess");}

    }
}
