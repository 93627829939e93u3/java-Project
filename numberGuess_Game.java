// step 1 : create a cunructor.
// step 2 : create a userinput method. 
// step 3 : create a method for correct ifNumberDitect()
// step 4 : win the user total number of guesses.

import java.util.Random;
import java.util.Scanner;

class game {
    int num, input;
    int i = 1;

    public game(int n) {
        num = n;
        // System.out.println(num);
    }

    public int userInput() {
        // input=inputNum;
        Scanner input1 = new Scanner(System.in);
        System.out.println();
        System.out.println(i + ". Guess The number: ");
        int input = input1.nextInt();
        return input;
    }

    public void ifNumberDitect() {
        while (i <= 100) {
            int input = userInput();
            if (num == input) {
                System.out.println("User are win");
                break;
            } else {

                if (num <= input) {
                    System.out.println("Guess the small number");

                } else if (num >= input) {
                    System.out.println("Guess the big number");
                }
            }
            i++;
        }
        System.out.println("you are win in " + i + " Guesses");

    }

}

public class numberGuess_Game {

    public static void main(String[] args) {

        int computer = new Random().nextInt(100) + 1;
        Random rand = new Random();
        game g = new game(computer);
        // g.userInput();
        g.ifNumberDitect();
    }
}