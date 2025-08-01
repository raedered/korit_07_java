package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        Student student1 = new Student(2025001);
        student1.name = "김일";
        student1.score = 4.5;

        Student student2 = new Student("김이");
        student2.studentCode = 2025002;
        student2.score = 100;

        Student student3 = new Student(2025003, "김삼");
        student3.score = 95.8;

        Student student4 = new Student(2025003, "김사", 4.0);

        Student student5 = new Student();
        student5.studentCode = 2025003;
        student5.name = "김오";
        student5.score = 80.7;

        student.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();


    }
}
