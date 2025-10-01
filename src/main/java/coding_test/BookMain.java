package coding_test;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성");
        EBook eBook = new EBook("스프링부트 3 백과사전", "김영환", 20.5);

        book.displayInfo();
        eBook.displayInfo();
    }
}
