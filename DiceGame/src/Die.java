import java.util.Random;

/**
 * manages the Dice info
 */
public class Die {
    private int noOfSides;
    private int currentSide = 1;
    Random random = new Random();

    /**
     * constructor for Dice
     */
    public Die(int noOfSides) {
        this.noOfSides = noOfSides;
        rollDice();

    }

    /**
     * Rollse the dice, creats a new random face up number
     */
    private void rollDice() {
        currentSide = random.nextInt(noOfSides + 1);

    }

    /**
     * returns the current side
     */
    public int getCurrentSide() {
        return currentSide;
    }
}
