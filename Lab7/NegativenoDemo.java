import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class ProcessNumber {

    public void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            int result = num * 2;
            System.out.println("Double value: " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessNumber obj = new ProcessNumber();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            obj.ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
