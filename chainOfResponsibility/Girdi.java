
//girdi classımız

public class Girdi {
    
    private String baslik;
    private String icerik;
    private String tur; // girdi türü soru,yorum vs..

    public Girdi(String baslik, String icerik, String tur) {
        this.baslik = baslik;
        this.icerik = icerik;
        this.tur = tur;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public String getTur() {
        return tur;
    }

   
    
    
   
    
}
