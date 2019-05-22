
//soru türündeki girdileri handler yardımı ile ekleyecek yada diğer handler a devredecek.

public class SoruEkle implements Handler{
    
    private Handler sonraki;

    @Override
    public void setNextHandler(Handler sonraki) {
        this.sonraki = sonraki;
    }

    @Override
    public void ekle(Girdi girdi) {

        if (girdi.getTur() == "soru"){
            
            System.out.println("Soru eklendi!");
            
        }else{
            
            sonraki.ekle(girdi);
        }
    }
    
    
    
}
