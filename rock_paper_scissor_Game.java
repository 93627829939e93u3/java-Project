import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Press 1 For Rock");
        System.out.println("Press 2 For Paper");
        System.out.println("Press 3 For Scissors");

        int i = 1;
        int totalUser = 0, totalComputer = 0;
        String[] game = { "Rock", "Paper", "Scissors" };

        while (i <= 5) {
            System.out.println();
            System.out.println("Chance " + i + " :- Enter Your Choice (1-3): ");
            num = sc.nextInt();

            if (num < 1 || num > 3) {
                System.out.println("Invalid Input. Please enter 1, 2, or 3.");
                continue; // retry same round
            }

            Random rand = new Random();
            int computer = rand.nextInt(3) + 1;

            System.out.println("User     :- " + game[num - 1]);
            System.out.println("Computer :- " + game[computer - 1]);

            if ((num == 1 && computer == 3) || (num == 2 && computer == 1) || (num == 3 && computer == 2)) {
                System.out.println("User wins this round!");
                totalUser += 10;
            } else if ((num == 1 && computer == 2) || (num == 2 && computer == 3) || (num == 3 && computer == 1)) {
                System.out.println("Computer wins this round!");
                totalComputer += 10;
            } else {
                System.out.println("It's a Tie!");
            }

            i++;
        }

        System.out.println("\nUser Total Score     : " + totalUser);
        System.out.println("Computer Total Score : " + totalComputer);
        System.out.println();

        if (totalUser > totalComputer) {
            System.out.println("🎉 The Winner is User!");
        } else if (totalComputer > totalUser) {
            System.out.println("🤖 The Winner is Computer!");
        } else {
            System.out.println("⚖️ The Match is a Tie!");
        }


    }
}
