
public class SimpleAdFactory extends AdFactory{


    @Override
    public AdRemoveAndAdd createAdRemoveAndAdd() {
        return new AddRemoveSA();
        
    }
    
    
    
}
