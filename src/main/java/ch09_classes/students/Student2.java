package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;
    // 좌상단 햄버거 (메뉴바) -> 코드(code) -> 생성(Generate)
    // art + ins


    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    // 자동완성으로 알아서 생성자만드시고,
    // 거기에 sout 문구 전부 다 집어넣으시오.
}
