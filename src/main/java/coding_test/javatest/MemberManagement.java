package coding_test.javatest;

class Member {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        int num = name.length();
        if(num <= 2){
            System.out.println("유효하지 않은 이름입니다.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("유효하지 않은 나이입니다.");
        }
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class MemberManagement {
    public static void main(String[] args) {
        Member member = new Member();

        member.setName("이순신");
        member.setAge(150);
        member.printInfo();

        member.setName("김");
        member.setAge(30);
        member.printInfo();

        member.setName("강감찬");
        member.setAge(45);
        member.printInfo();
    }
}