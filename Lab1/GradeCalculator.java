package Lab1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark (0-100):");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: O");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: E");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid! Enter mark b/t 0-100.");
        }
        sc.close();
    }
}

