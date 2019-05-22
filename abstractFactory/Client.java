
public class Client {
    
    private AdRemoveAndAdd removeAndAdd ;
    
    public Client(AdFactory factory){
    
    removeAndAdd = factory.createAdRemoveAndAdd();
    
    }
   
    public void save(){
        
        removeAndAdd.Add();
    }
    
    public void del(){
        removeAndAdd.Remove();
    }
}
