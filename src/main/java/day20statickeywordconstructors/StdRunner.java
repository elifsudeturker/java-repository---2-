package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdNames);
        Student std1 = new Student();
        System.out.println(std1.age);

        Student.staticMethod();
        std1.nonStaticMethod();
    }
}
