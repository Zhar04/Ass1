package PhoneClass;

import java.util.Scanner;
public class Phone {
    String phone;
    int number;
    String model;
    String name;
    int weight;
    int lenght;
    public Phone(){

    }
    public Phone(int number,String model){
        this.number=number;
        this.model=model;
    }
    public Phone(int number, String model, int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
        Phone u10 = new Phone(10,"adadsa");
    }

    void set_name(String phone, int number, String model){
        this.phone =phone;
        this.number=number;
        this.model=model;
    }
    String get_name(){
        return phone + number + model;
    }
    void send_message(int lenght){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);

    }
    void call(String name){
        System.out.println("ringing::::"+name);
    }

    void call(String name, int number){
        this.name = name;
        this.number = number;
    }


    void get_number(){
        System.out.println(number);
    }



}