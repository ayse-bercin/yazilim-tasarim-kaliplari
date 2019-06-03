//Leaf Sınıfı.

public class Uye implements Kullanici{
    
    private String isim;
    private String email;
    private String telefon;

    public Uye(String isim, String email, String telefon) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public void bilgiGöster() {
        
        System.out.println("isim : " +isim);
        System.out.println("email : " + email);
        System.out.println("telefon : " + telefon);
        System.out.println("\n");
        
    }
    
    
    
}
