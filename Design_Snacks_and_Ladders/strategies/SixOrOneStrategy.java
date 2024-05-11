package strategies;

public class SixOrOneStrategy implements StartGameStrategies{
    @Override
    public boolean canStart(int value) {
        
        return value==1 || value==6;
    }
}
