package org.example;

import java.util.Scanner;

public class BmiCalc {
    private String name;
    private double height;
    private double weight;
    Scanner scanner = new Scanner(System.in);

    public void calcBmi() {
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        double result = weight / (height * height);
        String bmi = "";

        if(result < 18.5) {
            bmi = "저체중";
        }else if(result >= 18.5 && result <= 23){
            bmi = "정상";
        }else if(result >= 23 && result <= 25) {
            bmi = "비만 전";
        }else if(result >= 25 && result <= 30) {
            bmi = "1단계 비만";
        }else if(result >= 30 && result <= 35) {
            bmi = "2단계 비만";
        }else if(result >= 35) {
            bmi = "3단계 비만";
        }

        System.out.println(name +" 님의 BMI 지수는 " + result + "으로 " + bmi + "입니다." );
    }

    public void calcBmi(String name, double height, double weight){
        // method 정의 할 때 argument 와 parameter 개념을 혼란스러워하는 경우가 있는데,
        // 정의 -> 호출이라는 순서라고 생각할 때,
        // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 병수명 으로 이루어져
        // 있기 때문에 '선언'이라고 간주해주면 좋겠습니다.
        // call1() 유형에서 height를 scanner로 받았을 때 바로 0.01을 곱해서
        // m로 치환했었습니다.
        // 근데 우리는 double bmi부터 긁어왔을 때 , cm기준일 수도 있기  때문에
        // 추가작업을 해야함
        height = height * 0.01;
        double result = weight / (height * height);
        String bmi = "";

        if(result < 18.5) {
            bmi = "저체중";
        }else if(result >= 18.5 && result <= 23){
            bmi = "정상";
        }else if(result >= 23 && result <= 25) {
            bmi = "비만 전";
        }else if(result >= 25 && result <= 30) {
            bmi = "1단계 비만";
        }else if(result >= 30 && result <= 35) {
            bmi = "2단계 비만";
        }else if(result >= 35) {
            bmi = "3단계 비만";
        }

        System.out.println(name +" 님의 BMI 지수는 " + result + "으로 " + bmi + "입니다." );
    }

    public void calcBmi(Person person){
        // Person class의 각 field들에 private을 적용했기 때문에 값을 불러오기 위해서는
        // Getter를 사용해야만 합니다. 하지만 너무 코드가 길어지기 때문에
        String name = person.getName();                     // 지역변수들을
        double height = person.getHeight();                 // 선언하고
        double weight = person.getWeight();                 // 사용함
        double result = weight / (height * height);
        String bmi = "";

        if(result < 18.5) {
            bmi = "저체중";
        }else if(result >= 18.5 && result <= 23){
            bmi = "정상";
        }else if(result >= 23 && result <= 25) {
            bmi = "비만 전";
        }else if(result >= 25 && result <= 30) {
            bmi = "1단계 비만";
        }else if(result >= 30 && result <= 35) {
            bmi = "2단계 비만";
        }else if(result >= 35) {
            bmi = "3단계 비만";
        }

        System.out.println(name +" 님의 BMI 지수는 " + result + "으로 " + bmi + "입니다." );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//
//        double result = weight / (height * height);
//        String bmi = "";
//
//        if(result < 18.5) {
//            bmi = "저체중";
//        }else if(result >= 18.5 && result <= 23){
//            bmi = "정상";
//        }else if(result >= 23 && result <= 25) {
//            bmi = "비만 전";
//        }else if(result >= 25 && result <= 30) {
//            bmi = "1단계 비만";
//        }else if(result >= 30 && result <= 35) {
//            bmi = "2단계 비만";
//        }else if(result >= 35) {
//            bmi = "3단계 비만";
//        }
//
//        System.out.println(name +" 님의 BMI 지수는 " + result + "으로 " + bmi + "입니다." );

        /*
            실행 예
            이름을 입력하세요 >>> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg)를 입력하세요 >>> 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */

        // 여기에 Person 객체를 생성해야하는데, 일반적인 방식이 아니라
        // Builder 객체


        BmiCalc bmiCalc = new BmiCalc();
        System.out.println("-----coll3()-1- 검증 부분----");
        bmiCalc.calcBmi("김이", 172, 68);

//        System.out.println("----스캐너사용----");
//        System.out.print("이름을 입력하세요 >>> ");
//        String name3 = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height3 = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
//        double weight3 = scanner.nextDouble();
//
//        bmiCalc.calcBmi(name3, height3, weight3);

        System.out.println("----객체 생성 후 call3() 활용 방법----");
        // 1. Person 객체 생성
        // 1-1. 원래 객체 생성 방법
//        Person person4 = new Person("김사", 172, 68);
//        System.out.println(person4);
//        // 1-2. Builder 패턴 사용 객체 생성 방법
//        Person person5 = Person.builder()
//                .name("김오")
//                .height(172)
//                .weight(68)
//                .build();
//
//        bmiCalc.calcBmi(person5);

        System.out.println("---scanner에 객체 사용 예시---");
        System.out.print("이름을 입력하세요 >>> ");
        String name6 = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height6 = scanner.nextDouble();
        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
        double weight6 = scanner.nextDouble();
        Person person6 = Person.builder()
                .name(name6)
                .height(height6)
                .weight(weight6)
                .build();

        bmiCalc.calcBmi(person6);


    }
}
