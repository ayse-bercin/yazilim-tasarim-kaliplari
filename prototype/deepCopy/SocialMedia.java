
public class SocialMedia implements Cloneable{
    
    public String Facebook;
    public String Instagram;
    public String Twitter;

    public SocialMedia() {
      
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String Twitter) {
        this.Twitter = Twitter;
    }
    
    public SocialMedia makeCopy(){
         SocialMedia socialMedia = null;
        
        try {
            socialMedia = (SocialMedia)super.clone();
           
            
        } catch (CloneNotSupportedException ex) {
        
        }
        
        return socialMedia;
    }
    
}
