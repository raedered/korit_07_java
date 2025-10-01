package coding_test.javatest;

class Student {
    int studentId;
    String name;

    public Student() {
        this.studentId = -1;
        this.name = "미정";
    }

    public Student(int studentId) {
        this.studentId = studentId;
        this.name = "미정";
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("학번: " + studentId + ", 이름: " + name);
    }

}

public class StudentFactory {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student(2025001);
        Student student3 = new Student(2025002, "홍길동");

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
