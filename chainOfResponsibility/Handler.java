
// eklenecek girdiyi türüne göre ekleyecek handler
public interface Handler {
    
    public void setNextHandler(Handler sonraki);
    public void ekle(Girdi girdi);
    
}
