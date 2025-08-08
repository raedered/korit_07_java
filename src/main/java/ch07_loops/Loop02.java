package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 .. 20
    ...
    91 .. 100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            i++;
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("-----------------------------------------------");

        int j = 1;
        while (j < 100) {
            System.out.print(j + " " + (j + 1));
            j+= 10;
        }

    }
}
