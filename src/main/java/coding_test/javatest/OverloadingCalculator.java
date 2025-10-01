package coding_test.javatest;

class Calculator {

    public void add (int a, int b) {
        int result = a + b;
        System.out.println("정수 덧셈 결과: " + result);
    }

    public void add (double a, double b) {
        double result =  a + b;
        System.out.println("실수 덧셈 결과: " + result);
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 10);

        calc.add(3.5, 2.5);
    }
}