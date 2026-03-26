interface Motor {
    int capacity = 500;
    void run();
    void consume();
}
class WashingMachinemotor implements Motor {
    public void run() {
        System.out.println("Washing Machine runs");
    }
    public void consume() {
        System.out.println("Washing Machine is consuming power");
    }
}
public class Washingmachine {
    public static void main(String[] args) {
        Motor motor = new WashingMachinemotor();
        motor.run();
        motor.consume();
        System.out.println("Capacity of the motor is " + motor.capacity);
    }
}
