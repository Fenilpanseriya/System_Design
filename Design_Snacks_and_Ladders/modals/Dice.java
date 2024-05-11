package modals;

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
        return (int)(Math.random()*(maxNumber-1)+1);
    }
}
