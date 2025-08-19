package org.example;

class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory() {
        int counter = 1;
        System.out.println( counter + " 객체가 생성되었습니다.");
        factoryName = "공장";
        System.out.println(factoryName);
    }

    public static Factory getInstance() {
        if(instance == null ) {
            instance = new Factory();
        }
        return instance;
    }
}

public class FactoryMain {
    public static void main(String[] args) {
        Factory.getInstance();
    }
}
