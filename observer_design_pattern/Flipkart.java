import java.util.*;

public class Flipkart {
    public static HashMap<Events,List<Subscriber>> subscribers = new HashMap<>();

    public static void registerSubscriber(Events e,Subscriber s){
        if(!subscribers.containsKey(e)){
            subscribers.put(e, new ArrayList<>());
        }
        subscribers.get(e).add(s);
    }

    

    public void notifySubscriber(Events e,Order order){
        
        for(Subscriber subscriber:subscribers.get(e)){
            subscriber.listen(order);
        }
    }

    public void placeOrder(Order order){
        this.notifySubscriber(Events.PLACE_ORDER,order);
    }

    public void cancelOrder(Order order){
        this.notifySubscriber(Events.CANCLE_ORDER,order);
    }
    
}
