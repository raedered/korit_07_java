package coding_test.javatest;

class Box <T>{
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}

public class GenericBoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello World");
        System.out.println("문자열 상자 내용: " + box1.getContent());

        Box<Integer> box2 = new Box<>(123);
        System.out.println("정수 상자 내용: " + box2.getContent());
    }
}
