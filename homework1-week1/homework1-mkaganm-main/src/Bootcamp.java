package src;

public abstract class Bootcamp {

    private String name;
    private String surname;
    private String email;

    //yapıcı fonksiyon
    public Bootcamp(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    // subclassların kullanacağı ortak metodlar
    public void connectMeeting() {
        System.out.println(this.name + " " + this.surname + " is connected to lesson.");
    }

    public void exitMeeting() {
        System.out.println(this.name + " " + this.surname + "is out of lesson.");
    }

    // ABSTRACT metodu oluşturuldu
    public abstract void homework(String homeworkInfo);
}
