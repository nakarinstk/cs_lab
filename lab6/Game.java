import java.util.Random;
import java.util.Scanner;

/**
 * Game
 */
public class Game {
    private int usrScore;
    private int comScore;
    private int usrNumber;

    public String Choice(int n) {
        switch (n) {
        case 0:
            return "ROCK";
        case 1:
            return "PAPER";
        case 2:
            return "SCISSORS";
        default:
            return "NULL";
        }
    }

    public void play() {
        Scanner inObj = new Scanner(System.in);
        Random rand = new Random();
        while (Math.abs(usrScore - comScore) != 2) {
            int comRand = rand.nextInt(3);
            System.out.println("\nEnter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
            if (inObj.hasNextInt()) {
                usrNumber = inObj.nextInt();
                if (usrNumber > 0 && usrNumber < 3) {
                    System.out.println("You enter:" + Choice(usrNumber));
                    System.out.println("Computer:" + Choice(comRand));
                    if ((usrNumber == 0 && comRand == 2) || (usrNumber == 1 && comRand == 0)
                            || (usrNumber == 2 && comRand == 1)) {
                        System.out.println("You win!");
                        usrScore += 1;
                        continue;
                    } else if (usrNumber == comRand) {
                        System.out.println("It's a tie.");
                        continue;
                    } else { // usrer Lose
                        System.out.println("You lose!");
                        comScore += 1;
                        continue;
                    }
                } else { // Input is not Valid
                    continue;
                }
            } else { // Input is not Valid
                continue;
            }
        }
        System.out.println("-".repeat(50));
        if (usrScore < comScore) {
            System.out.println("Too bad! You lose.");
        } else {
            System.out.println("Congrats! You win.");
        }
        System.out.println("User Score: " + usrScore);
        System.out.println("Computer Score: " + comScore);
        inObj.close();
    }
}