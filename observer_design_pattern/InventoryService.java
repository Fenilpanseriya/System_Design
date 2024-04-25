public class InventoryService implements Subscriber {

    InventoryService(){
        Flipkart.registerSubscriber(Events.PLACE_ORDER, this);
        Flipkart.registerSubscriber(Events.CANCLE_ORDER, this);
    }

    public void listen(Order order){
        placeOrder(order);
    }
    public void placeOrder(Order order){
        System.out.println("order is done");
    }
}
