
//Caretaker Classımız.
//Geçmiş kaydetme ve gösterme işlemleri yapıcak.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Gecmis {
    private List<AnahtarKelime> kelimeList = new ArrayList<AnahtarKelime>();


   public void ekle(AnahtarKelime anahtarKelime){
      kelimeList.add(anahtarKelime);
   }

   public void al(){
       
       for (Iterator<AnahtarKelime> iterator = kelimeList.iterator(); iterator.hasNext();) {
           AnahtarKelime next = iterator.next();
            System.out.println(next.getAnahtarKelime());
       }
   }
}
