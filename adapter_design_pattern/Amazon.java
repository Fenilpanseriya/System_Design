package adapter_design_pattern;

public class Amazon {
    public PaymentGateway pg;
    public Amazon(PaymentGateway pg){
        this.pg = pg;
    }

    public void makePayment(Long cardNum,int cvv,int expiryMonth,int expiryYear){
        String transacttionId=pg.CreditcardPayment(cardNum, cvv, expiryMonth, expiryYear);
        boolean isPaymentSuccessful = pg.getPaymentStatus(transacttionId);
        if(isPaymentSuccessful){
            System.out.println("payment successfull");
        }
        else{
            System.out.println("payment failed");
        }
    }
}
