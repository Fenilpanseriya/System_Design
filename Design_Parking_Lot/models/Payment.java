package models;

public class Payment {
    private PaymentModes paymentModes;
    private PaymentStatus paymentStatus;
    private Long referenceId;

    public Long getReferenceId() {
        return referenceId;
    }
    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }
    public PaymentModes getPaymentModes() {
        return paymentModes;
    }
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentModes(PaymentModes paymentModes) {
        this.paymentModes = paymentModes;
    }
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


}
