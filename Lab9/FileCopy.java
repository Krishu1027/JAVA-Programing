package Lab9;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the source file name: ");
            String source = sc.nextLine();
            System.out.print("Enter the destination file name: ");
            String dest = sc.nextLine();
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(dest);
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied using Character Stream!");
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest, true);
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            fis.close();
            fos.close();
            System.out.println("File Copied using Byte Stream!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}