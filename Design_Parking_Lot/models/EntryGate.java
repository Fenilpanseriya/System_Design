package models;
import java.util.Date;

public class EntryGate extends Gate {
    private Date enterTime;

    public Date getEnterTime() {
        return enterTime;
    }
    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }
    public Ticket generateTicket(){
        return null;
    }
}
