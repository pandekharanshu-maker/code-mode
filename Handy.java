interface Mobile {
    public void processor();

    public void os();

    public void model();
}

class Apple implements Mobile {
    public void processor() {
        System.out.println("A19 Pro Bionic Chip");
    }

    public void os() {
        System.out.println("iOS 27");
    }

    public void model() {
        System.out.println("iPhone 17 Pro");
    }
}

public class Handy {
    public static void main(String[] args) {
        Mobile i = new Apple();
        i.processor();
        i.os();
        i.model();
    }
}