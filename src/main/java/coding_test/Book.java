package coding_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String title;
    private String author;

    public void displayInfo() {
        System.out.print("제목: " + getTitle() + ", 저자: " + getAuthor());
    }
}
