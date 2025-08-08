package ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");

        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은" + item1.getCategory() + "입니다.");

        System.out.println();

        Product product1 = new Product("전자제품", "가전제품", 100000, 10);
        //변경전
        product1.showInfo();
        System.out.println();
        //변경후
        product1.setCategory("백색 가전제품");
        product1.showInfo();

        System.out.println("해당제품은 " + product1.getCategory() + "입니다.");

    }
}
