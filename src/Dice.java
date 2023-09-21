


import java.util.Random;

public class Dice {
    // Attributes
    int sides = 6;
    int sideShowing = sides;
    String colour = "red";
    boolean weighted = false;


    public Dice() {
    } // tom kontsruktor

    public Dice(int newSides) {
        sides = newSides;
    }

    // Methods
    public void rollDice() {
        Random random = new Random();
        sideShowing = random.nextInt(sides) + 1;
        System.out.println("dice had been rolled");
    }

    //change the number of sides
    public void changesSides() {
        sides = 15;
    }
}


