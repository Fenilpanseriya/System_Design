package models;

public class Bill extends BaseModal {
    private Operator operator;
    private Payment payment;
    private int amount;

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void generateBill(){
        
    }
}
