package PersonClass;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person user= new Person();
        user.fullname="Alisher Alisherovich";
        user.age = 15;
        Person user2 = new Person("Marat Maratovich",18);
        System.out.println(user2.fullname);
        Person user4 = new Person();
        user4.fullname = "Daniel Gayovich";
        user4.age = 20;
        Person.move("Kakim Kakimovich");
        Person.talk("Sabit Sabitovich");


    }
}