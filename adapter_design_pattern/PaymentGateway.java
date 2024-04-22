package adapter_design_pattern;

public interface PaymentGateway {
    public String CreditcardPayment(Long cardNumber,int cvv,int expiryMonth,int expiryYear);
    public boolean getPaymentStatus(String id);
}
 