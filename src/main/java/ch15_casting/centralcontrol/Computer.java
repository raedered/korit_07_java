package ch15_casting.centralcontrol;

public class Computer implements Power {

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    public void compute() {
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
/*
    프로그램 구현 사항
    interface Power를 implement한 다향한 클래스드을 정의할 계정
    예을 들어 Computer / AirConditioner / Speaker들이 전부 Power를
    implenemt하게 되면 이상의 세 클래스들은 강제정으로
    on() / off() 매서드들을 override해야만 합니다.

    그대서 computer / AirConditioner / Speaker 객체들을
    전부 Power로 업캐스팅 시키게 된다면
    Computer / AirConditioner / Speaker 원래 클래스와 상관없이
    Power 클래스의 조작만으로 on() / off() 메서드를 호출시키는 것이 가능합니다.

    즉 B b = new B();로 에초에 객체를 생성하면 되지 않냐는 ㅓ아까가지의 의문은
    A의 자식 클래스가 B 하나뿐일대만 적용된다고 볼ㄹ 수 있습니다.
    a의 자식 클래스가 B C D E F .. 여랠 개가 있다고 가정한다면
    그것을 업캐스팅했을 대ㅑ A가 가지고 잇는 부모 메서드를 호출함으로써
    다수의 서로 다른 클래스의 객체들을 통제할 수 잇다는 장점 때문에
    업캐스팅을 적용하게 됩니다.
    그리고 다운캐스팅을 해서 각각 클래스의 고유 메서드도 실행시킬 수 있겠네요

    AirConditioner 클래스 생성해서 Power inplement하고
    에어컨의 전원을 켭니다.
    에어컨의 전원을 끕니다. 로 재정의하시오.
    speaker도 동일하게 하시오.
 */