import java.util.HashMap;

public class PathTypeRegistery {
    public static  HashMap<PathType,PathCalculationStrategy> registery=new HashMap<>();


    public  void registerPathType(PathType p){
        if(p==PathType.CAR){
            registery.put(p,new CarPathCalculation());
        }
        else if(p==PathType.BIKE){
            registery.put(p,new BikePathCalculation());
        }
        else if(p==PathType.WALK){
            registery.put(p,new WalkingPathCalculation());
        }
    }

    public static PathCalculationStrategy getPathCalculationStrategyObject(PathType p){
        return registery.get(p);
    }
}
