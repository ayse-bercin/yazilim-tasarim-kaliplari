
public class Test {
    
    public static void main(String[] args) {
         
         Handler handler = new SoruEkle();
         Handler handler1 = new YorumEkle();
         Handler handler2 = new YaziEkle();
         
         handler.setNextHandler(handler2);
         handler2.setNextHandler(handler1);
         
         //handlerları istediğimiz sırada sıralarsak yukarıdaki gibi programın doğru çalışması için
         //tür olarak sadece yorum, soru ve yazi girebiliriz.
         //diğer türlü hata vermemesi için (farklı bir tür için) handlerlar belli 
         //bir sırada bağlanıp en sondakini en baştakine bağlamamalıyız.(else'in içerisinde)
         
         Girdi girdi = new Girdi("baslik", "içerik", "yorum");
         
         handler.ekle(girdi);
    }
    
}
