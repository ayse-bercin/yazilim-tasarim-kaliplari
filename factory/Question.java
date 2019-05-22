
public class Question extends Data{
    
    public String QuestionTitle;

    public Question(String QuestionTitle, String username, int id, String content) {
        super(username, id, content);
        this.QuestionTitle = QuestionTitle;
    }

    @Override
    public void delete() {
        System.out.println("Soru kaldırıldı.");
    }

    @Override
    public void add() {
       System.out.println("Soru eklendi.");
    }

   
    
    
}
