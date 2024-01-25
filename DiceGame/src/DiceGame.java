import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * The managing class of the system
 */

public class DiceGame {
    private ArrayList<Die> allDice = new ArrayList<Die>();
    private Scanner scan = new Scanner(System.in);
    private int noOfDice;
    private Random rand = new Random();

    /**
     * COrtructor for the game
     */
    public DiceGame() {
        startGame();
    }

    /**
     * starts the game
     */
    private void startGame() {

        while (true) {
            try {
                do {
                    System.out.println("How many Dice?");

                    noOfDice = scan.nextInt();
                    scan.nextLine();

                } while (noOfDice < 1);
                break;
            } catch (Exception error) {
                scan.nextLine();
                System.out.println("you have to writ an integer!!!!");
            }
        }


        // Creats teh Dice
        for (int i = 0; i < noOfDice; i++) {
            int sides = rand.nextInt(1, 21);
            Die myDice = new Die(sides);
            allDice.add(myDice);

        }

        calcualteSum();
    }

    /**
     * Calculates the sum of all rolled dice
     */
    private void calcualteSum() {
        int sum = 0;
        for (Die currentDice : allDice) {
            sum += currentDice.getCurrentSide();


        }
        System.out.println(sum);
    }
}
