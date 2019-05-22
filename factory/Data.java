public abstract class Data {
    
    public String username;
    private int id;
    public String content;

    public Data(String username, int id, String content) {
        this.username = username;
        this.id = id;
        this.content = content;
    }
    

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public int getId() { return id;}

    public void setId(int id) { this.id = id; }

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}
    
    public  void add(){
        System.out.println("İçerik kaydedildi.");
    }
     
    public  void delete(){
        System.out.println("İçerik silindi.");
        
    }
    
    
}

