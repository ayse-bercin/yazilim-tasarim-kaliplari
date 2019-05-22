
import java.util.ArrayList;


public class AdManager implements Subject{
    
    private ArrayList<Observer> subscribers;
    private static int adCount = 0;

    public AdManager(){
        
        subscribers = new ArrayList<Observer>();
        
    }
    @Override
    public void register(Observer newSubscriber) {
        
        subscribers.add(newSubscriber);
    }

    @Override
    public void unregister(Observer tobeRemoved) {
        
        int subscriberIndex = subscribers.indexOf(tobeRemoved);
        System.out.println("Subscriber " + (subscriberIndex+1) + " deleted!");
        subscribers.remove(subscriberIndex);
        
    }

    @Override
    public void doNotify() {
        
        for(Observer subscriber : subscribers){
            subscriber.update(adCount);
        }
        
    }
    
    public void addAdvertisement(){
        adCount = ++adCount;
        System.out.println("\nNew Advertisement Notifier!!");
        doNotify();
    }
    
    public void deleteAdvertisement(){
        adCount = --adCount;
        doNotify();
    }
    
    
}
