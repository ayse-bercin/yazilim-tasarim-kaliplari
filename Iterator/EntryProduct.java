
public class EntryProduct {
    
   public String author;
   public String title;
   public String date;

    public EntryProduct(String title, String author, String date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
   public String getEntry() 
    { 
        return getTitle()+ " " + getAuthor() + " " + getDate(); 
    }
    
}
