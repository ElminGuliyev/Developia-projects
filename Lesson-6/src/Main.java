public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Alone", "John Smith", 158, 1950);
        book1.displayDetails();
        System.out.println(Book.getTotalBooks());

        Book book2 = new Book("Desperate","Donald Trump",256,2011);
        book2.displayDetails();
        System.out.println(Book.getTotalBooks());
    }
}