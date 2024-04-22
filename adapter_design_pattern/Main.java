package adapter_design_pattern;

public class Main {
    public static void main(String[] args) {
        Amazon amazon=new Amazon(new RazorpayPaymentGatewayAdapter());
        amazon.makePayment(123443211234L,414,12,2025);
                
    }
}
