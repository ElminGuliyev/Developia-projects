public class Book {
    String bookName;
    String bookAuthor;
    int bookPages;
    int bookDate;

    public Book(String name, String author, int pages, int date) {

        this.bookName = name;
        this.bookAuthor = author;
        this.bookPages = pages;
        this.bookDate = date;
        totalBookCount++;


    }


    public void displayDetails() {
        System.out.println("Book's details: " + "\nBook name: " + bookName + "\nBook author: " + bookAuthor + "\nPages: " + bookPages + "\nDate:" + bookDate);
    }

    static int totalBookCount;

    public static int getTotalBooks() {
        return totalBookCount;

    }


}
