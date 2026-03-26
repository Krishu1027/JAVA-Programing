package Lab8;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        changeCase(str);
        System.out.println("String after reversing(without function): "+reverseString(str));
        System.out.println("String after reversing(with function): "+revString(str));

        System.out.print("Enter the 2nd string for comparision: ");
        String str2 = sc.nextLine();
        compareString(str, str2);

        System.out.print("Enter the string to be inserted into 1st string: ");
        String i = sc.nextLine();
        insertString(str, i);

        System.out.print("Enter a String:");
        String str3= sc.nextLine();
        upperLower(str3);

        System.out.print("Enter a String:");
        String s = sc.nextLine();
        System.out.print(" Enter a character: ");
        char c = sc.next().charAt(0);
        findCharacter(s,c);
        sc.nextLine();

        System.out.print("Enter a string: ");
        String p = sc.nextLine();
        palindrome(p);

        System.out.print("Enter a String: ");
        String l = sc.nextLine();
        countAll(l);
    }

    static String changeCase(String str) {
        String r = str.toUpperCase();
        System.out.println("String after changing the case is: " + r);
        return r;
    }

    static String reverseString(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r = r + str.charAt(i);
        }
        return r;
    }

    static String revString(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    static void compareString(String s1, String s2){
        int diff = s1.compareTo(s2);
        System.out.println("Difference between ASCII values is : "+diff);
    }

    static void insertString(String s1, String s2){
        String result = s1 + " " + s2;
        System.out.println("After insertion: "+result);
    }

    static void upperLower(String str){
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Lowercase: "+str.toLowerCase());
    }

    static void findCharacter(String str, char c){
        int pos = str.indexOf(c);
        if(pos!=-1)
            System.out.println("Character position: "+(pos+1));
        else
            System.out.println("Character not present");
    }

    static void palindrome(String str){
        String rev = new StringBuffer(str).reverse().toString();
        if(str.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }

    static void countAll(String str){
        int word= str.split(" ").length, vow=0, cons=0;
        for(int i=0;i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(c)){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vow++;
                }else {
                    cons++;
                }
            }
        }
        System.out.println("No. of words: "+word);
        System.out.println("No. of vowels: "+vow);
        System.out.println("No. of consonants:"+cons);
    }
}