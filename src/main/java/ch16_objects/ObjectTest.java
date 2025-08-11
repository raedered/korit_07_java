package ch16_objects;

public class ObjectTest {
    // 필드선언
    private String name;
    private String address;

    // 기본 생성자 / AllargsConstructor를 정의하시오

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter / setter를 정의하시오

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // showInfo()를 call1() 형식으로 정의하시오
    public void showInfo() {
        System.out.println("이름 : " + getName());
        System.out.println("주소 : " + getAddress());
    }
    /*
        실행 예
        이름 : 안근수
        주소 : 부산광역시 연제구

        Main으로 가서 objectTest1에
        이름 안근수 주소 부산광역시 연제구를 set하고
        showInfo()를 호출하시오.
     */

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }   // 메서드 재정의가능
}
