package ch11_access_modifier;

import java.util.Scanner;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
/*
    setter / getter는 dafault로 access modifier가 public이므로
    클래스 외부에서 사용 가능합니다.

    저희는 현재 객체 생성까지 완료한 상황인데,
    setter / getter를 활용하여
    처음 이름을 "김일"로 입력하고,
    그 이름을 콘솔에 출력
    다시 이름을 "이일"로 수정하고,
    바귄이름을 콘솔에 출력하시요.
 */
public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
//        person1.name = "김일";              이제는 불가능 합니다.
//        System.out.println(person1.name); 마찬가지로 불가능
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        person1.setName(name);
        System.out.println(person1.getName());
    }

}
