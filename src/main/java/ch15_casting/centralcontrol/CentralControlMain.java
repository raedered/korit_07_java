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
                new Power[5]
        );

        centralControl.addDevice(computer1);                // 여기서 (암시적) 업케스팅이 이루어졋습니다.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);


    }
}
