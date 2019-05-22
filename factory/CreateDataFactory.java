
public class CreateDataFactory {
    
    public static void main(String[] args){
        
        // Yorum örneği 
        DataFactory dataFactory =  new DataFactory();
        Data data = dataFactory.newData(DataFactory.DataType.Comment);
        data.add();
        
        
    }
    
}
        
