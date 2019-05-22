
public class Test {
    
    public static void main(String[] args){
        
       
        
         Ad ad = new Ad();
         ad.setInfo("info");
         ad.setContact("contact");
         
        AdBuilder builder = new SimpleAdBuilder(ad);
        AdManager manager = new AdManager(builder);
        
        String str = manager.Build();
        System.out.println(str);
        
        
        Ad ad1 = new Ad();
        ad1.setInfo("info1");
        ad1.setImagePath("path1");
        ad1.setContact("contact1");
        
        AdBuilder builder1 = new ExtendedAdBuilder(ad1);
        AdManager manager1 = new AdManager(builder1);
        
        String str1 = manager1.Build();
        System.out.println(str1);
        
    }
}
