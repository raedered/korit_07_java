package coding_test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EBook extends Book{
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public void displayInfo() {
        System.out.println();
        super.displayInfo();
        System.out.print(", 파일 크기: " + getFileSize());
    }

}
