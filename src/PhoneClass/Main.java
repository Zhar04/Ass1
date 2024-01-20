package PhoneClass;

public class Main {

            public static void main(String[] args){
                Phone u = new Phone();
                u.phone="Iphone";
                u.number=404445;
                u.model="XR";
                Phone u2=new Phone();
                u2.phone="Samsung";
                u2.number=303445;
                u2.model="S-20";
                Phone u3=new Phone();
                u3.phone="Xiaomi";
                u3.number=403544;
                u3.model="UltraPro Max";
                Phone u4=new Phone();
                u4.set_name("Samsung",10,"A 10");
                System.out.println(u4.get_name());
                System.out.println(u3.get_name());
                System.out.println(u2.get_name());
                System.out.println(u.get_name());
                u.call("Marat");
                u.get_number();
                u.call("Saken", 454545);
                u.send_message(10);



            }

        }