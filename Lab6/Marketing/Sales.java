package Lab6.Marketing;
import Lab6.General.Employee;

public class Sales extends Lab6.General.Employee {
    public Sales(int empid, String ename){
        super(empid, ename);
    }
    public double tallowance(double totalearning){
        return 0.05*totalearning;
    }
}