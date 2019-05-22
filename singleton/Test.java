
public class Test {
 
    public static void main(String[] args){
        ConnectionSingleton conn = ConnectionSingleton.getInstance();
        
        conn.Connect();
    }
    
}
