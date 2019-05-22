
public class Comment extends Data{
    
    public int likes = 0;

    public Comment(int likes, String username, int id, String content) {
        super(username, id, content);
        this.likes = likes;
    }

    @Override
    public void delete() {
        System.out.println("Yorum silindi.");
    }

    @Override
    public void add() {
        System.out.println("Yorum kaydedildi.");
    }
    
    
    public void like(){
        likes = likes+1;
        System.out.println("likes = " + likes);
    }
}
