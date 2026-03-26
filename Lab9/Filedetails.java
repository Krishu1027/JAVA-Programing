package Lab9;

import java.io.*;
import java.util.Scanner;

public class Filedetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the name of the file: ");
            String filename = sc.nextLine();
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int characters = 0;
            int words = 0;
            int lines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordList = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    words += wordList.length;
            }
            br.close();
            fr.close();
            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}