package src;

public class Teacher extends Bootcamp {

    // yapıcı fonksiyon
    public Teacher(String name, String surname, String email) {
        super(name, surname, email);
    }

    public void answerQuestion(String question) {
        System.out.println("Answering to question..." + question);
    }

    public void askQuestion() {
        System.out.println("Asking question...");
    }

    // abstract metodumuz override edildi
    @Override
    public void homework(String homeworkInfo) {
        System.out.println("teacher is giving homework to students... " + homeworkInfo);
    }
}
