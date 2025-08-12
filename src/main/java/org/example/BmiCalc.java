package org.example;

import java.util.Scanner;

public class BmiCalc {
    private String name;
    private double height;
    private double weight;

    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

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
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();

        person = Person.builder()
                .name(name)
                .height(height)
                .weight(weight)
                .build();

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

        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(Kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        Person person = Person.builder()
                .name(name)
                .weight(weight)
                .height(height)
                .build();
        System.out.println(person.calcBmi());
    }
}
