
public class Client {
    
    public static void main(String[] args) {
        
        EntryAggregate container = new EntryAggregate();
        
        container.addEntry("title1", "author1", "date1");
        container.addEntry("title2", "author2", "date2");
       
        IEntryIterator iter = container.getIterator();
        
        System.out.println(iter.Next().getEntry());
        System.out.println(iter.Next().getEntry());
        System.out.println(iter.hasNext());
        System.out.println(iter.First().getEntry());
        System.out.println(iter.hasNext());
        
      
        
    }
    
}
