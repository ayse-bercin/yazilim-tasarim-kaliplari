
public class Complaint extends Data {
    
  public int contentId;

    public Complaint(int contentId, String username, int id, String content) {
        super(username, id, content);
        this.contentId = contentId;
    }

    @Override
    public void delete() {
      System.out.println("Şikayet kaldırıldı.");
        
    }

    @Override
    public void add() {
       System.out.println("Şikayet eklendi.");
       
    }
    
    
    
    
}
