
public class Subscriber implements Observer{
    
    private static int SubscriberIDTracker = 0;
    private int subscriberID ;
    
    private Subject adManager;

    public Subscriber(Subject adManager){
        
        this.adManager = adManager;
        this.subscriberID = ++SubscriberIDTracker;
        System.out.println("New Subscriber " + this.subscriberID + " joined!\n");
        adManager.register(this);
    }
    
    @Override
    public void update(int adCount) {
        
        System.out.println("Subscriber ID : " + subscriberID +"\nUpdated count of the advertisements : " + adCount + "\n");
        
    }
    
}
