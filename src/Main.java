public class Main {
    public static void main(String[] args) {
        // create a dice
        Dice myDice1 = new Dice();
        // create a second dice
        Dice myDice2 = new Dice();
        // create a d20
        Dice myD20 = new Dice(20);

        System.out.println("intitial value for first dice " + myDice1.sideShowing);
        System.out.println("intitial value for sdecond dice " + myDice2.sideShowing);
        System.out.println("intitial value for d20 " + myD20.sideShowing);

        //rol the dice
        myDice1.rollDice();
        myDice2.rollDice();
        myD20.rollDice();
        myD20.sides = 15;

        System.out.println("new value for first dice " + myDice1.sideShowing);
        System.out.println("new value for second dice " + myDice2.sideShowing);
        System.out.println("new value for d20  " + myD20.sideShowing);
    }
}