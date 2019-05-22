
public class Entry extends Data{
  
    public String entryTitle;
    public int likes;

    public Entry(String entryTitle, int likes, String username, int id, String content) {
        super(username, id, content);
        this.entryTitle = entryTitle;
        this.likes = likes;
    }

    @Override
    public void delete() {
        System.out.println("Girdi silindi.");
        
    }

    @Override
    public void add() {
      System.out.println("Girdi kaydedildi.");
    }

    public void like(){
        likes = likes+1;
        System.out.println("likes = " + likes);
    }
    
    
    
    
}
