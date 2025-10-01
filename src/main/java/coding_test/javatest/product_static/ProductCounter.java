package coding_test.javatest.product_static;

class Product {
    private String name;

    private static int count = 0;

    public Product(String name) {
        this.name = name;

        count++;
    }

    public static int getTotalProducts() {
        return count;
    }
}

public class ProductCounter {
    public static void main(String[] args) {
        System.out.println("초기 상품 수: " + Product.getTotalProducts());

        new Product("사과");
        new Product("바나나");
        new Product("오렌지");

        System.out.println("총 상품수: " + Product.getTotalProducts());
    }
}
