package Lab7;

import java.util.Scanner;

class Arrayindex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=4;
        int[] arr = new int[n];
        System.out.print("Enter "+n+" no.: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("5th element:" + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: " + e);
        }
        sc.close();
    }
}