
public class ExtendedAdFactory extends AdFactory{


    @Override
    public AdRemoveAndAdd createAdRemoveAndAdd() {
        return new AddRemoveEA();
    }
    
    
    
}
