package Library;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.takeBook(3);
        reader1.takeBook("Adventures", "Dictionary", "Encyclopedia");
        Book adventures = new Book("Adventures", "AuthorA");
        Book dictionary = new Book("Dictionary", "AuthorB");
        Book encyclopedia = new Book("Encyclopedia", "AuthorC");
        reader1.takeBook(adventures, dictionary, encyclopedia);
        reader1.returnBook();


    }
}