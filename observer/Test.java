
public class Test {
    
    public static void main(String[] args) {
        
        AdManager manager = new AdManager();
        
        Subscriber subs1 = new Subscriber(manager);
        manager.addAdvertisement();
        
        Subscriber subs2 = new Subscriber(manager);
        manager.addAdvertisement();
        
        Subscriber subs3 = new Subscriber(manager);
        
        manager.deleteAdvertisement();
        manager.unregister(subs2);
        
        manager.addAdvertisement();
        
    }
    
}
