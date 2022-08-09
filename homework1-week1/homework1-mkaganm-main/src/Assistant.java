package src;

public class Assistant extends Bootcamp {

    // yapıcı fonksiyon
    public Assistant(String name, String surname, String email) {
        super(name, surname, email);
    }

    public void attendance() {
        System.out.println("students are counted...");
    }

    // abstract class ımızdan gelen body si boş metodu override ettik
    @Override
    public void homework(String homeworkInfo) {
        System.out.println("Assistant is checking homeworks..." + homeworkInfo);
    }
}
