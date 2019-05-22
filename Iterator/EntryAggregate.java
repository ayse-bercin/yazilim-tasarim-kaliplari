
import java.util.ArrayList;
import java.util.List;


public class EntryAggregate implements IEntryAggregate{
    
     
     EntryProduct[] entryList; 
     static final int MAX_ITEMS = 6; 
     int numberOfItems = 0; 
    
    
    public EntryAggregate() {

        entryList = new EntryProduct[MAX_ITEMS]; 
 
       
    }


    public void addEntry(String title, String author, String date){
        
        EntryProduct entryProduct = new EntryProduct(title,author,date); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("Full"); 
        else
        { 
            entryList[numberOfItems] = entryProduct; 
            numberOfItems = numberOfItems + 1; 
        } 

    }

    @Override
    public IEntryIterator getIterator() {
        return new EntryIterator(entryList);
    }
    

    

   

   

 

    
}
