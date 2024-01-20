package PersonClass;

public class Person {
    String fullname;
    int age;
    static void move(String fullname){
        System.out.println("Such and Such a "+ fullname +" is moving");
    }
    static void talk(String fullname){
        System.out.println("Such and Such a "+ fullname +" is talking");
    }
    public Person(){

    }
    public Person(String fullname, int age){
        this.fullname = fullname;
        this.age = age;

    }
}