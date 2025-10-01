package coding_test.javatest;

class OutOfStockException extends Exception {
    public OutOfStockException(String massage){super(massage);}
}

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void decreaseStock(int quantity) throws OutOfStockException {

        if(quantity > getStock()) {
            throw new OutOfStockException("재고 부족: " + quantity + "개 주문 불가. 현재 재고: " + getStock() +"개.");
        }
        System.out.println("성공 재고수량 " +(getStock() - quantity) + "개 남았습니다.");
    }

    public int getStock() {
        return stock;
    }
}

public class InventoryManager {
    public static void main(String[] args){
        Product laptop = new Product("노트북", 10);
        int orderQuantity = 15;

        try {
            laptop.decreaseStock(orderQuantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("정상종료");
        }
    }
}