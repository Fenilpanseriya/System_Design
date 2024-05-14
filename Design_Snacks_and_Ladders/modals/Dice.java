package modals;

import java.util.Random;

public class Dice {
    private int maxNumber;

    public Dice(int maxNum){
        this.maxNumber=maxNum;
    }
    public int getMaxNumber() {
        return maxNumber;
    }
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int roll(){
        Random random = new Random();

        // Generate a random number between 1 and x (inclusive)
        int randomNumber = random.nextInt(maxNumber) + 1;
        return randomNumber;
    }
}
