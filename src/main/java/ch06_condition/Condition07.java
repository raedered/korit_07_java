package ch06_condition;

import java.util.Scanner;

/*
     중첩 if문(Nested - if)
        if문 내에 if문이 중첩적으로 사용될 수 있습니다.
     형식 :
     if(조건식1){
        실행문1
        if(조건식1a) {
            실행문
        } else if (조건식1b) {
            실행문
        } else if (조건식1c) {
            실행문
        } else {
            실행문
        }
     }
     else if문 안에도 중첩 if문을 사용할수있음
 */
public class Condition07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String grade = "";

        // 중펍 if문을 활용한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다."); // 실행문 1
        } else {                            //위가 실행이 안됐다면 score는 0이상 100이하라는 의미
            if(score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }

        System.out.println("당신의 점수는" + score + "점이고, 학점은 " + grade + "입니다.");

    }
}
