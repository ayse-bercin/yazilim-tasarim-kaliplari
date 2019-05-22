
//yorum türündeki girdileri handler yardımı ile ekleyecek yada diğer handler a devredecek.

public class YorumEkle implements Handler{
    
    private Handler sonraki;

    @Override
    public void setNextHandler(Handler sonraki) {
        this.sonraki = sonraki;
        
    }

    @Override
    public void ekle(Girdi girdi) {
          if (girdi.getTur() == "yorum"){
            
            System.out.println("Yorum eklendi!");
            
        }else{
            
            sonraki.ekle(girdi);
        }
    }
    
    
    
    
}
