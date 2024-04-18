package prototype_design_pettern;


public class Main {
    public static void main(String[] args) {

        Registery br=new Registery();
        Bird b1=br.cloneBird("crow");
        Bird b2=br.cloneBird("crow");
        Bird b3=br.cloneBird("sparrow");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());

    }
}
