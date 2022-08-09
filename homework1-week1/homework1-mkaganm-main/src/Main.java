package src;

import src.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("M.K.M");

        Teacher hhal = new Teacher("Hasan Hüseyin Ali", "Gül", "hhaligul@patika.com");
        Assistant assistant = new Assistant("Patika", "Dev", "patika@patika.com");
        Student mkm = new Student("Mustafa Kağan", "MERİÇ", "mustafakaganmeric@gmail.com");

        hhal.connectMeeting();
        assistant.connectMeeting();
        mkm.connectMeeting();

        assistant.attendance();

        hhal.askQuestion();
        mkm.silence();

        String question = "???";
        mkm.askQuestion(question);
        hhal.answerQuestion(question);

        String homeworkInfo = "homework1";
        hhal.homework(homeworkInfo);

        hhal.exitMeeting();
        mkm.exitMeeting();
        assistant.exitMeeting();

        mkm.homework(homeworkInfo);
        assistant.homework(homeworkInfo);

    }
}

