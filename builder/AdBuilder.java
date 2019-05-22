
public abstract class AdBuilder {
    
    private Ad ad;

    public AdBuilder(Ad ad) {
        this.ad = ad;
    }
    
    public String BuildOutput(){
        String output = BuildInfo();
        output += BuildImagePath();
        output += BuildContact();
        return output;
        
    }
    
    public abstract String BuildInfo();
    public abstract String BuildImagePath();
    public abstract String BuildContact();
    
}
