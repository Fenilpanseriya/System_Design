public class GoogleMap {
    public void calculatingPath(PathType mode,String from,String to){
        PathCalculationStrategy pc=PathTypeRegistery.getPathCalculationStrategyObject(mode) ;
        pc.pathCalculate(from,to);
    }
}
