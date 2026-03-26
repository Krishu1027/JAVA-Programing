package Lab6.General;

public class Employee{
    protected int empid;
    private String ename;

    public Employee(int empid, String ename){
        this.empid=empid;
        this.ename=ename;
    }
    public double Earning(double basic){
        double da=0.80*basic;
        double hra=0.15*basic;
        return basic+da+hra;
    }

    public String getEname() {
        return ename;
    }
}