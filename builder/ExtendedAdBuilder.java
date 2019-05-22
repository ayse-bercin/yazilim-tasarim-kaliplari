
public class ExtendedAdBuilder extends AdBuilder{

    public ExtendedAdBuilder(Ad ad) {
        super(ad);
    }

    @Override
    public String BuildInfo() {
        return "Extended Ad information created! ";
    }

    @Override
    public String BuildImagePath() {
        return "Extended Ad image created! ";
    }

    @Override
    public String BuildContact() {
        return "Extended Ad contact created!";
    }
    
    
}
