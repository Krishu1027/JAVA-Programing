package Lab6;
import Lab6.Marketing.Sales;
import java.util.Scanner;

public class Mainemployee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmployeeID: ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Sales s = new Sales(empid, ename);

        double totalearning = s.Earning(basic);
        double travellingallowance = s.tallowance(totalearning);

        System.out.println("The empid of Employee is: " + empid);
        System.out.print("The total earning is: " + totalearning);

        sc.close();
    }
}