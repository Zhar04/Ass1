package Library;

public class Reader {
    String full_name;
    int card_number;
    String faculty;
    String date_of_birth;
    int phone;
    String title;
    void takeBook(){};
    public static void takeBook(String... bookTitles) {
        StringBuilder message = new StringBuilder("Petrov VV took books: ");

        for (int i = 0; i < bookTitles.length; i++) {
            message.append(bookTitles[i]);

            if (i < bookTitles.length - 1) {
                message.append(", ");
            }
        }

        System.out.println(message.toString());
    };

    void takeBook(int number){
        System.out.println("Petrov VV took "+number+" books");
    };

    public static void takeBook(Book... books) {
        StringBuilder message = new StringBuilder("Petrov VV took books: ");

        for (int i = 0; i < books.length; i++) {
            message.append(books[i].getName());

            if (i < books.length - 1) {
                message.append(", ");
            }
        }

        System.out.println(message.toString());
    }

    void returnBook(){
        System.out.println("Petrov VV returned the books: Adventures, Dictionary, Encyclopedia");
    };

}