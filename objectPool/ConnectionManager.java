
import java.util.LinkedList;
import java.util.List;

//Singleton PoolManager

public class ConnectionManager {
    
    List<DBConnection> free = new LinkedList<>();
    List<DBConnection> used = new LinkedList<>();
    int poolSize = 0;
    
    private static ConnectionManager obj; 
    
    private ConnectionManager(){
        
    }
     
    public DBConnection getConn(){
        
     
         
        if(free.size() < 5 && poolSize < 5){

            
               DBConnection conn = new DBConnection();
               free.add(conn);
               poolSize = poolSize + 1;

               return conn;
         
        }else{
            
            if(used.size() == poolSize && free.size() == 0 ){
                System.out.println("All connections are currently in use! Please try again later..");
                return null;
            }else{
            DBConnection conn  = free.get(0);
            used.add(conn);
            free.remove(conn);
            System.out.println("Currently free connection number : " + free.size());
            
           
            return conn;}
        }
     
       
    }
    
    public void releaseConn(){
        DBConnection conn = new DBConnection();
        used.remove(0);
        free.add(conn);
        System.out.println("Currently free connection number : " + free.size());
       
        
        
    }
    
    public static ConnectionManager getInstance() 
    { 
        if (obj==null) 
            obj = new ConnectionManager(); 
        return obj; 
    } 
    
    
}
