package coding_test.javatest;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();

        cart.add("사과");
        cart.add("우유");
        cart.add("빵");

        cart.remove("우유");

        System.out.println("첫 번째 상품: " + cart.get(0));

        System.out.println("최종 목록: " + cart.toString());
    }
}
