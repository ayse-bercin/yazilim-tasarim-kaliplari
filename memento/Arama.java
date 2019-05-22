
// Originator Class'ı aramasını yaptığımız kelimeyi tutacak.
// Memento ya kaydedeceğimiz anahtar kelimenin sınıfı.
public class Arama {
    
   private String anahtarKelime;

   public void setAnahtarKelime(String anahtarKelime){
      this.anahtarKelime = anahtarKelime;
   }

   public String getAnahtarKelime(){
      return anahtarKelime;
   }

   public AnahtarKelime anahtarKelimeKaydet(){
      return new AnahtarKelime(anahtarKelime);
   }

   public void anahtarKelimeAl(Gecmis gecmis){      
      //anahtarKelime = AnahtarKelime.getAnahtarKelime();
      gecmis.al();

   }
}
