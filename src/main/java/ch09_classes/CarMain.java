package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.color = "빨강";
        mycar.speed = 160;

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        mycar.drive();
        yourCar.brake();

        mycar.displayInfo();
        yourCar.displayInfo();
    }
}
