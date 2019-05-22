public class User implements UserPrototype {
    
    public String username ;
    private String password;
    public String email;
    public boolean state = true;
    SocialMedia socialMedia = new SocialMedia() ;

    public User() {
       
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    
    
    

    @Override
    public UserPrototype makeCopy() {
        
        User user = null;
        
        try {
            user = (User)super.clone();
           
            
        } catch (CloneNotSupportedException ex) {
        
        }
        
        return user;
    }
    
    
    
}
