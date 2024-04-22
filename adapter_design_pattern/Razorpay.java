package adapter_design_pattern;

public class Razorpay {
    public Razorpay(){}
    public String PayViaCC(String card,String cvv,String expiry){
        System.out.println("payment done");
        return "123";
    }
    public boolean checkPaymentStatus(String transactionId){
        return true;
    }

}






