package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    // 메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다");
        // 접근 지정자 안썻으니까 default 입니다. 그리고 {} 영역 내에 있으니까 지역변수네요.
        String model = "갤럭시26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 썻으니가 어차피 동일한 객체가 계속 대입되겠네요.
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone입니다. 그러니까 SmartPhone 객체 튀어나와야 하는데,
        // 스마트폰 객체 생성할 때 저희 뭐해야 하나면

        // 지역변수
         SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

         return smartPhone;
    }
}
