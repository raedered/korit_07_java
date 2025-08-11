package ch15_casting.centralcontrol;

import ch06_condition.Condition01;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer  computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();

        // 참조자료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에 예시만 보여주고 안쓸겁니다.
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

        CentralControl centralControl = new CentralControl(
                new Power[10]
        );

        centralControl.addDevice(computer1);                // 여기서 (암시적) 업케스팅이 이루어졋습니다.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);


        /*
            Mouse / LED 클래스를 정의하고 on() / off() 메서드를
            implement하시고
            CentralControl으로 와서
            각 객체를 생성한 다음에
            CentralControl 객체에 집어넣으시오.
         */
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Printer printer1 = new Printer();

        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(printer1);
        System.out.println();
        centralControl.powerOn();
        System.out.println();
        centralControl.powerOff();

        System.out.println("------------continue------------");
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i+1);
//        }

//        for(int i = 0; i < 10; i++) {
//            if((i+1) % 2 != 1) {
//                System.out.println(i);
//            }
//        }
//
//        for(int i = 0; i < 10; i++) {
//            if((i+1) % 2 == 1) {
//                continue;                 // continue : 해당 반복을 종료하고 다음 반복을 실행
//            }
//            System.out.println(i);
//        }
        System.out.println();
        centralControl.showInfo();

        speaker1.changeEqual();

        centralControl.performSecificMethod();
        centralControl.performSecificMethod();




    }
}
