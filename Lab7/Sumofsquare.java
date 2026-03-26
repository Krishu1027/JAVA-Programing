package Lab7;

import java.util.Scanner;

class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class Sumofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numbers:");
            String no = sc.nextLine();
            String[] num = no.split(" ");
            if (num.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            }
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int n = Integer.parseInt(num[i]);
                sum = sum + (n * n);
            }
            System.out.println(sum);
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}