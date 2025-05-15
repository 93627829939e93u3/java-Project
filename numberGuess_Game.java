// step 1 : create a cunructor.
// step 2 : create a userinput method. 
// step 3 : create a method for correct ifNumberDitect()
// step 4 : win the user total number of guesses.

import java.util.Random;
import java.util.Scanner;

class game {
    int num, input;
    int i = 0;

    public game(int n) {
        num = n;
        // System.out.println(num);
    }

    public int userInput() {
        // input=inputNum;
        System.out.printf("%d. Enter the number: ", i + 1);
        Scanner input = new Scanner(System.in);
        // System.out.println();
        // System.out.println(i + ". Guess The number: ");
        // int input = input1.nextInt();
        i++;
        return input.nextInt();

    }

    public boolean ifNumberDitect(int input1) {

        // input1 = userInput();
        if (num == input1) {
            System.out.println("You win");
            return true;

        }

        else if (num < input1) {
            System.out.println("Guess the small number");

        } else if (num > input1) {
            System.out.println("Guess the big number");
        }

        return false;

        // System.out.println("you are win in " + i + " Guesses");

    }

    int totalGuess() {
        return i;
    }

}

public class numberGuess_Game {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        int computer = new Random().nextInt(100) + 1;
        Random rand = new Random();
        game g = new game(computer);
        // System.out.println(computer);
        // int i = 1;

        // while (i <= 100) {
        // System.out.println(i + ". Enter the Number : ");
        // int input = g.userInput();
        // int ditect=g.ifNumberDitect(input);

        // if (computer == input) {
        // break;
        // }
        // i++;
        // }

        boolean ditect = false;

        while (!ditect) {
            int input = g.userInput();
            ditect = g.ifNumberDitect(input);
        }

        System.out.println("you are win in " + g.totalGuess() + " Guesses");

    }
}
