package models;

public class Vehical extends BaseModal{
    private VehicalType vehical;
    private String vehicalNumber;

    public VehicalType getVehical() {
        return vehical;
    }
    public String getVehicalNumber() {
        return vehicalNumber;
    }
    public void setVehical(VehicalType vehical) {
        this.vehical = vehical;
    }
    public void setVehicalNumber(String vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }
}
