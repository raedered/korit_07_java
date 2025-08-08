package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법 클래스명 객체명 = new 생성자;
        // 기본 생성자를 통합 생성
        Product product = new Product();
        product.productNum = 123456;
        product.productName = "LG엘패드";

        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)2번
        Product product1 = new Product(9876564);
        product1.productName = "다이소충전기";
        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)3번
        Product product2 = new Product("USB-C 케이블");
        product2.productNum = 159357;
        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)4번
        Product product3 = new Product(951753, "GFlip6");

        // 출력명령어
        product.showInfo();
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
    }

}
