public class EmailService implements Subscriber {

    EmailService(){
        Flipkart.registerSubscriber(Events.PLACE_ORDER, this);
        Flipkart.registerSubscriber(Events.SHIP_ORDER, this);
        Flipkart.registerSubscriber(Events.PLACE_ORDER, this);
    }

    public void listen(Order order){
        sendMail(order);
    }
    public void sendMail(Order order){
        System.out.println("mail is just sent");
    }
}
