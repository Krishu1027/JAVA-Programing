package Lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Studentdetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Roll no.: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name of existing file to which student details will be written: ");
            String fn = sc.nextLine();
            File file = new File(fn);
            System.out.println("File will be saved at: " + file.getAbsolutePath());
            FileWriter fw = new FileWriter(fn,true);
            fw.write("Roll no.: "+roll+"\n");
            fw.write("Name: "+name+"\n");
            fw.write("Subject: "+sub+"\n");
            fw.write("Marks: "+marks+"\n");
            fw.close();
            System.out.println("Data written into file successfully!");
            System.out.println("File content:");
            FileReader fr = new FileReader(fn);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
        sc.close();
    }
}