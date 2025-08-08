package ch10_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
//        UnivStudent univStudent1 = new UnivStudent();
//        univStudent1.name = "김일";
//        univStudent1.grade = 1;
//        univStudent1.score = 3.3;
//
//        UnivStudent univStudent2 = new UnivStudent("김이");
//        univStudent2.grade = 3;
//        univStudent2.setScore(-30);
//        univStudent2.score = 4.0;
//
//        UnivStudent univStudent3 = new UnivStudent(2);
//        univStudent3.setGrade(5);
//        univStudent3.name = "김삼";
//        univStudent3.score = 2.7;
//
//        UnivStudent univStudent4 = new UnivStudent("김사", 4);
//        univStudent4.score = 3.8;
//
//        UnivStudent univStudent5 = new UnivStudent("김오", 2, 1.0);
//
//        univStudent1.showInfo();
//        univStudent2.showInfo();
//        univStudent3.showInfo();
//        univStudent4.showInfo();
//        univStudent5.showInfo();

        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent();
        UnivStudent univStudent3 = new UnivStudent();
        UnivStudent univStudent4 = new UnivStudent();
        UnivStudent univStudent5 = new UnivStudent();

        univStudent1.setName("김일");
        univStudent2.setName("김이");
        univStudent3.setName("김삼");
        univStudent4.setName("김사");
        univStudent5.setName("김오");

        univStudent1.setGrade(1);
        univStudent2.setGrade(3);
        univStudent3.setGrade(5);
        univStudent3.setGrade(2);
        univStudent4.setGrade(4);
        univStudent5.setGrade(2);

        univStudent1.setScore(3.3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4);
        univStudent3.setScore(3.3);
        univStudent4.setScore(3.3);
        univStudent5.setScore(3.3);


    }
}
