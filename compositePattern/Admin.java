
//Composit sınıfı.

import java.util.ArrayList;
import java.util.List;
public class Admin implements Kullanici{
    
  private List<Kullanici> uyeList = new ArrayList<Kullanici>();

  @Override
  public void bilgiGöster() {
    for (Kullanici uye : uyeList) {
      uye.bilgiGöster();
    }
  }

  public void UyeEkle(Kullanici kullanici) {
    uyeList.add(kullanici);
  }

  public void UyeCikar(Kullanici kullanici) {
    uyeList.remove(kullanici);
  }
    
}
