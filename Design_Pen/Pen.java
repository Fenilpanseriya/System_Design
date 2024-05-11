public class Pen {
    private String name;
    private String company;
    private int price;
    private PenType type;
    private WritingBehaviour writingBehaviour;

    public Pen(PenType p,WritingBehaviour writingBehaviour){
        this.type=p;
        this.writingBehaviour=writingBehaviour;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public int getPrice() {
        return price;
    }
    public PenType getType() {
        return type;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void write(){
        writingBehaviour.write();
    }
    
}
