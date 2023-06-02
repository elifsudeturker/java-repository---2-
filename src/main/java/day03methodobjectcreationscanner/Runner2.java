package day03methodobjectcreationscanner;

public class Runner2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.age = " + teacher.age);
        System.out.println("teacher.height = " + teacher.height);
        teacher.teach();
        teacher.teach2();
    }
}
