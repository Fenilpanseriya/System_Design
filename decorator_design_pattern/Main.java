public class Main {
    public static void main(String[] args) {
        IcecreamCone cone=new ChocolateScoop(new VanillaScoop(new Orangecone()));
        System.out.println(cone.getConstitutens());
        System.out.println(cone.getCost());
    }
}
