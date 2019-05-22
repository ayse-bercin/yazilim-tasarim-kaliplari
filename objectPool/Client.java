
//İstemci || Kullanıcı
public class Client {
    
    public static void main(String[] args) {
        
        //Obje kullanımı için pool manager kullanırız.
        ConnectionManager manager = ConnectionManager.getInstance();
       
        //Objectpool boyutu 5'e eşit olana kadar sadece biriktirme yapıyoruz.
        //Boyuta kendimiz karar veriyoruz.Fakat bunu poolmanager içinde yapabiliriz.
        manager.getConn();
        manager.getConn();
        manager.getConn();
        manager.getConn();
        manager.getConn();
        
        //Objectpoolda 5 tane kullanıma hazır objemiz var.Boştaki obje sayısı 0 olana kadar kullanabiliriz.
        //Her pop'dan sonra boştaki obje sayısı console'a yazdırılıyor.
        manager.getConn();
        manager.getConn();
        manager.getConn();
        manager.getConn();
        manager.getConn();
        
        //Artık kullanıma hazır objemiz yok fakat yeni obje de üretemeyiz.
        //Kullanımda olan objeler geri bırakıldığında poolsize aşılmamalı.
        //Bunun için uyarı verilip kullanıcı bekletilir.
        manager.getConn();
        
        //Her realease'den sonra boşta olan obje sayısı yazdırılıyor.
        manager.releaseConn();
        manager.releaseConn();
        
        manager.getConn();
       
       //manager.getConn() sadece managerın oluşturduğu hazır bağlantı objesi.
       //objeleri kullanarak bağlantı açmak için "manager.getConn().Connect()" kullanırız.
        
        
    }
    
}
