
//client sınıfı
public class WebSitesi {
    public static void main(String[] args) {
        
    Uye uye1 = new Uye( "uye1", "uye1@gmail.com","1234567");
    Uye uye2 = new Uye( "uye2", "uye2@gmail.com","1234568");
    Uye uye3 = new Uye( "uye3", "uye3@gmail.com","1234569");
    Uye uye4 = new Uye( "uye4", "uye4@gmail.com","1234565");
        
    Admin admin = new Admin();
    admin.UyeEkle(uye1);
    admin.UyeEkle(uye2);
    admin.UyeEkle(uye3);
    admin.UyeEkle(uye4);
 
    admin.bilgiGöster();
    
    }
    
}
