package Library;

public class Book {
    private String name;
    private String author;

    // Constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}