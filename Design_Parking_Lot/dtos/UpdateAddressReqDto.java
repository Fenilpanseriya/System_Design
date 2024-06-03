package dtos;

public class UpdateAddressReqDto {
    private String address;
    private int id;

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }
}
