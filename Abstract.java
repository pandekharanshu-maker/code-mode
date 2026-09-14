abstract class Phone {
    abstract void sound();

    void eat() {
        System.out.println("Phone eats battery");
    }
}
class IPhone extends Phone {
    void sound() {
        System.out.println("Phone has Haptic Engine to produce sound");
    }
}
public class Abstract{
 

   public static void  main(String[] args) {
        Phone p = new IPhone();
        p.sound();
        p.eat();
    }
}