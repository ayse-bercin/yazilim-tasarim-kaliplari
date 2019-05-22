
public class EntryIterator implements IEntryIterator{

     EntryProduct[] entryList; 
  
    int pos = 0; 
  
    public  EntryIterator (EntryProduct[] entryList) 
    { 
        this.entryList = entryList; 
    } 
    
    @Override
    public EntryProduct First() {
        
        pos = 0;
        return entryList[0];
        
    }

    @Override
    public EntryProduct Next() {
        EntryProduct product =  entryList[pos]; 
        pos += 1; 
        return product; 
    } 
    

    @Override
    public boolean hasNext() {
         if (pos >= entryList.length || entryList[pos] == null) 
            return false; 
        else
            return true; 
           
    }

      
}
