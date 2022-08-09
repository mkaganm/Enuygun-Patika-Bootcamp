package src;

public class Student extends Bootcamp {

    int[] points;

    // yapıcı fonksiyon
    public Student(String name, String surname, String email) {
        super(name, surname, email);
    }

    public void askQuestion(String question) {
        System.out.println("Asking ?" + question);
    }

    public void silence() {
        System.out.println("........");
    }

    // abstract classtan gelen metodu override ettik
    @Override
    public void homework(String homeworkInfo) {
        System.out.println("Student is doing homework..." + homeworkInfo);
    }
}
