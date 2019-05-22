
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Obje Classı

public class DBConnection {
    
     private String kullanici_adi = "root";
     private String parola = "";
     private String db_isim = "Veri";
     private String host = "localhost";
     private int port = 3306;
     private Connection conn = null;
     
    public DBConnection() {
        
    }
    
    
    public void Connect(){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_isim;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı..");
        }
        
        try {
            conn = (Connection) DriverManager.getConnection(url,kullanici_adi,parola);
             System.out.println("Baglanti basarili...");
             
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz...");
            //e.printStackTrace();
        }
        
    }
    
    
    
}
