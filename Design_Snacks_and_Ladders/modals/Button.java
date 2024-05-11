package modals;

public class Button {
    ButtonStatus status=ButtonStatus.LOCKED;
    int position=0;

    public int getPosition() {
        return position;
    }

    public ButtonStatus getStatus() {
        return status;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public void setStatus(ButtonStatus status) {
        this.status = status;
    }
}
