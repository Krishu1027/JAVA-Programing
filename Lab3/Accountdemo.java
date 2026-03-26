package Lab3;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
        super.input();
    }
    void disp() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class Accountdemo {
    public static void main(String[] args) {
        Person p[] = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input();
        }
        System.out.println("Displaying details of three persons:");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}
