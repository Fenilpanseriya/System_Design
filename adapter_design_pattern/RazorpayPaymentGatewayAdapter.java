package adapter_design_pattern;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway{
    
    Razorpay rp=new Razorpay();
    public String CreditcardPayment(Long cardNumber,int cvvNum,int expiryMonth,int expiryYear){
        
        String cardNum=String.valueOf(cardNumber);
        String cvv=String.valueOf(cvvNum);
        
        String payId=rp.PayViaCC(cardNum,cvv,String.valueOf(expiryMonth)+"/"+String.valueOf(expiryYear));
        return payId;
    } 
    public boolean getPaymentStatus(String id){
        return rp.checkPaymentStatus(id);
    }
}
