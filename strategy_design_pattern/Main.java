public class Main {
    public static void main(String[] args) {
        PathTypeRegistery ptr=new PathTypeRegistery();
        ptr.registerPathType(PathType.CAR);
        ptr.registerPathType(PathType.WALK);
        ptr.registerPathType(PathType.BIKE);

        GoogleMap gm=new GoogleMap();
        gm.calculatingPath(PathType.CAR, "Gandhinagar", "keshod");
    }
}
