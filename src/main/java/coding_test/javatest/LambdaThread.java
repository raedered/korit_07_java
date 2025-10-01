package coding_test.javatest;

public class LambdaThread {

    public static void main(String[] args) {
        Runnable lambdaRunnable = () -> System.out.println("새로운 스레드에서 실행중...");
        Thread thread = new Thread(lambdaRunnable);
        System.out.println("메인 스레드 종료.");
        thread.start();
    }
}
