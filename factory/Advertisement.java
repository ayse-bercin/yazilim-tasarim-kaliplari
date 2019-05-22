
public class Advertisement extends Data{
    
    public String AdTitle;

    public Advertisement(String AdTitle, String username, int id, String content) {
        super(username, id, content);
        this.AdTitle = AdTitle;
    }

    @Override
    public void delete() {
       System.out.println("İlan isteği kaldırıldı.");
    }

    @Override
    public void add() {
        System.out.println("İlan isteği yollandı.");
    }
   
 
}
