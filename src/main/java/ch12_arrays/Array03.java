package ch12_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    1 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다.
    1 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 총합은 21.5점입니다.

    김일 김이 김삼 김사 김오
    4.5 4.4 4.3 4.2 4.1
 */
public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int human = scanner.nextInt();

        scanner.nextLine();

        String[] names = new String[human];
        double[] scores = new double[human];

        double sum = 0;

        for(int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + " 번 학생의 이름을 등록하세요. >>> ");
            names[i] = scanner.nextLine();
            System.out.print(names[i] + " 학생의 점수를 입력하세요");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // 바로 위에 nextDouble() 다음에 i++이후 nextLine()이 배치될 예정이라 배리어 위치가 여기
            sum += scores[i];
        }

//        각 배열의 element를 출력하는 반복문 작성할 필요 -> names 출력 후에 개행이 이루어지고 그 다음 scores가 출력
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + " ");
        }

        for ( int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " / ");
        }
        System.out.println();
        System.out.println("학생들의 총합은 " + sum + "점 입니다.");


    }
}
