

public class VanillaScoop implements IcecreamCone {
    IcecreamCone cone;

    public VanillaScoop(IcecreamCone cone) {
        this.cone = cone;
    }

    public int getCost() {
        return cone.getCost() + 20;
    }

    public String getConstitutens(){
        return cone.getConstitutens() +" vanilla scoop ";
    }

}
