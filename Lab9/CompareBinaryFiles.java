package Lab9;

import java.io.FileInputStream;

public class CompareBinaryFiles {
    public static void main(String[] args) {
        String file1 = "file1.bin";
        String file2 = "file2.bin";
        try {
            FileInputStream f1 = new FileInputStream(file1);
            FileInputStream f2 = new FileInputStream(file2);
            int b1, b2;
            int position = 1;
            boolean equal = true;
            while (true) {
                b1 = f1.read();
                b2 = f2.read();
                if (b1 != b2) {
                    equal = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }
                if (b1 == -1 && b2 == -1) {
                    break;
                }
                position++;
            }
            if (equal) {
                System.out.println("Two files are equal");
            }
            f1.close();
            f2.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}