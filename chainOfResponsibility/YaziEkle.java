
//yazı türündeki girdileri handler yardımı ile ekleyecek yada diğer handler a devredecek.

public class YaziEkle implements Handler{
    
    private Handler sonraki;

    @Override
    public void setNextHandler(Handler sonraki) {
        
        this.sonraki = sonraki;
    }

    @Override
    public void ekle(Girdi girdi) {
          if (girdi.getTur() == "yazi"){
            
            System.out.println("Yazi eklendi!");
            
        }else{
            
                sonraki.ekle(girdi);
              
              //eğer son olarak bu handlerı atarsak, tekrar başa dönmek yerine programı burda bitiririz.
              //yanlış türler için çözüm.
              
              //System.out.println("geçerli bir tür giriniz..");
        }
        
    }
    
    
    
}
