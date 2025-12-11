import java.util.Scanner;

class CountEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evencount=0;
        int oddcount=0;

        System.out.print("Enter 10 numbers:");

        for(int i=1;i<=10;i++){
            System.out.print("Number"+i+":");
            int num=sc.nextInt();
            if(num % 2 == 0){
                evencount++;
            } else{
                oddcount++;
            }
        }
        System.out.println("\nTotal Even numbers: " + evencount);
        System.out.println("Total Odd numbers: " + oddcount);

        sc.close();
    }
}