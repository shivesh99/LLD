package lowLevelDesign.SnakeAndLadder;


import java.util.Random;

public class Dice {
    private int noOfDice;

    public Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }
    int rollDice(){
        Random random= new Random();
        return random.nextInt(6*noOfDice)+1;
    }
}
