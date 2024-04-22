

public class ChocolateScoop implements IcecreamCone {
    IcecreamCone cone;

    public ChocolateScoop(IcecreamCone cone) {
        this.cone = cone;
    }

    public int getCost() {
        return cone.getCost() + 20;
    }

    public String getConstitutens(){
        return cone.getConstitutens() +" chocolate scoop ";
    }


}
