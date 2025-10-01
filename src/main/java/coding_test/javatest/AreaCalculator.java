package coding_test.javatest;

class Circle extends Shape{
    int radius = 0;

    @Override
    public void calculateArea() {
        double result = radius * radius * 3.14;
        System.out.println("원의넓이: " + result);
    }
}

class Rectangle extends Shape {

    int width = 0;
    int height = 0;

    @Override
    public void calculateArea() {
        double result = width * height;
        System.out.println("사각형의 넓이: " + result);
    }
}

public class AreaCalculator {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 10;
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.height = 5;
        rectangle.width = 8;
        rectangle.calculateArea();
    }
}