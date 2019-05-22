
//Client.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
      Arama arama = new Arama();
      Gecmis gecmis = new Gecmis();
      
      Scanner scanner = new Scanner(System.in);
     
      System.out.print("Arama yapmak için 1'e basınız : ");
      int baslat = scanner.nextInt();
      
      while(baslat != 0){
      
      System.out.print("Arama yapmak istediğiniz kelimeyi girin : ");
      String anahtarKelime = scanner.next();
      
      arama.setAnahtarKelime(anahtarKelime);
      gecmis.ekle(arama.anahtarKelimeKaydet());

      System.out.println("Önceki Aranmış Kelimeler :");
      arama.anahtarKelimeAl(gecmis);
      
      System.out.println("");
      System.out.print("Arama yapmak için 1'e basınız : ");
      baslat = scanner.nextInt();
      }
     
      
    }
}
