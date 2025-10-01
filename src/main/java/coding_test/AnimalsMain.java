package coding_test;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("공을 가지고 옵니다.");
    }
}

public class AnimalsMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (int i =  0; i < animals.length; i++) {
            animals[i].makeSound();
            if(animals[i] instanceof Dog) {
                Dog dog = (Dog) animals[i];
                dog.fetch();
            }
        }
    }
}
