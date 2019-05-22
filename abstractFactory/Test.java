
public class Test {
    public static void main(String[] args) {
        
      AdFactory factory = new SimpleAdFactory();
      Client client = new Client(factory);
      client.save();
        
      AdFactory factory1 = new ExtendedAdFactory();
      Client client1 = new Client(factory1);
      client1.del();
        
    }
    
}
