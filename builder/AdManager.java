
public class AdManager {
    private AdBuilder builder;

    public AdManager(AdBuilder builder) {
        this.builder = builder;
    }
    
    public String Build(){
        String product = builder.BuildOutput();
        return product;
    }
}
