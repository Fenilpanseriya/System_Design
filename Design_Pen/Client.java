public class Client {
    public static void main(String[] args) {
        GelPen g=PenFactory.createGelPen()
                            .setChangeRefil(true)
                            .setRefil(new Refil(InkColor.RED))
                            .build();
        
        g.setCompany("cello");
        g.setName("butterflow");
        g.setPrice(10);

        g.changeRefil();
        g.write();
        g.getColor();

        
    }
}
