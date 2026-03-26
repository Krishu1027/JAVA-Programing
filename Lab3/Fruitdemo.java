package Lab3;

// Base class
class Fruit {
    void show() {
        System.out.println("This is Fruit");
    }
}

class Banana extends Fruit {
    void show() {
        System.out.println("This is Banana");
    }
}

class Cherry extends Fruit {
    void show() {
        System.out.println("This is Cherry");
    }
}
public class Fruitdemo {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();
        f.show();
        b.show();
        c.show();
    }
}
