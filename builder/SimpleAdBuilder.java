
public class SimpleAdBuilder extends AdBuilder{

    public SimpleAdBuilder(Ad ad) {
        super(ad);
    }
    
    

    @Override
    public String BuildInfo() {
        return "Simple Ad information created! ";
    }

    @Override
    public String BuildImagePath() {
        return " ";
    }

    @Override
    public String BuildContact() {
        return "Simple Ad contact created!";
    }
    
   
    
    
    
}
