package Lab5;

import java.util.Scanner;

interface Employee{
    double earning();
    double deduction();
    double bonus();
}
abstract class Manager implements Employee{
    double basic;
    Manager(double basic){
        this.basic=basic;
    }
    public double earning(){
        double da = 0.80*basic;
        double hra = 0.15*basic;
        return basic+da+hra;
    }
    public double deduction(){
        return 0.12*basic;
    }
}
class Substaff extends Manager{
    Substaff(double basic){
        super(basic);
    }
    public double bonus(){
        return 0.50*basic;
    }
}

class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        Substaff staff = new Substaff(basicSalary);
        System.out.println("Earnings - " + staff.earning());
        System.out.println("Deduction - " + staff.deduction());
        System.out.println("Bonus - " + staff.bonus());
        sc.close();
    }
}
