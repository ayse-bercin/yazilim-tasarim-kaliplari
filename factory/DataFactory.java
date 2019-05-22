
import java.util.Scanner;


public class DataFactory {
    
    enum DataType {
        Entry,
        Comment,
        Complaint,
        Question,
        Advertisement
    }
    
    public Data newData(DataType dataType){
        
        Data data = null;
        
        Scanner scanner = new Scanner(System.in);
        
        String username = "";
        int id = 0;
        String content = "";
        String entryTitle = "";
        int likes = 0;
        int contentId = 0;
        String QuestionTitle = "";
        String AdTitle = "";
        
        switch (dataType)
        {
            case Entry:
                System.out.print("Kullanici adi : ");
                username = scanner.nextLine();
                System.out.print("İcerik : ");
                content =  scanner.nextLine();
                System.out.print("Entry Baslık : ");
                entryTitle = scanner.nextLine();
                data = new Entry(entryTitle, 0, username, 0, content);
                break;
            case Comment:
                System.out.print("Kullanici adi : ");
                username = scanner.nextLine();
                System.out.print("İcerik : ");
                content =  scanner.nextLine();
                data = new Comment(0, username, 0, content);
                break;
            case Complaint:
                System.out.print("Kullanici adi : ");
                username = scanner.nextLine();
                System.out.print("İcerik : ");
                content =  scanner.nextLine();
                data = new Complaint(0, username, 0, content);
                break;
            case Question:
                System.out.print("Kullanici adi : ");
                username = scanner.nextLine();
                System.out.print("Soru Baslık : ");
                QuestionTitle = scanner.nextLine();
                System.out.print("İcerik : ");
                content =  scanner.nextLine();
                data = new Question(QuestionTitle, username, 0, content);
                break;
            case Advertisement:
                System.out.print("Kullanici adi : ");
                username = scanner.nextLine();
                System.out.print("İlan Baslık : ");
                AdTitle = scanner.nextLine();
                System.out.print("İcerik : ");
                content =  scanner.nextLine();
                data = new Advertisement(AdTitle, username, 0, content);
                break;
            default:
                System.out.println("yanlıs datatype");
                break;
        }
     return data;  
    }
    
    
}
