
public class Client {
    
    public static void main(String[] args){
        
        UserFactory userfact =  new UserFactory();
        
        User user1 = new User();
        user1.username="user1";
        user1.email="email1";
        user1.socialMedia.Facebook = "face1";
        user1.socialMedia.Twitter="twit1";
        
        User user2 = (User)userfact.getClone(user1);
        user2.username = "user2";
        user2.socialMedia.Facebook= "face2";
        user2.socialMedia.Twitter= "twit2";
     
        System.out.println("user1 username : " + user1.username);
        System.out.println("user1 facebook account : " + user1.socialMedia.Facebook);
        
        System.out.println("user2 username : " + user2.username);
        System.out.println("user2 facebook account : " + user2.socialMedia.Facebook);
        
        
        
        
    }
    
}
