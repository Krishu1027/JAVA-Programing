import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String empName);
}

interface Manager extends Employee {
    void getDeptDetails(String deptId, String deptName);
}

class Head implements Manager {
    int empId;
    String empName;
    String deptId;
    String deptName;

    public void getDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getDeptDetails(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void printAllDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Head h = new Head();

        System.out.print("Enter employee id: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String empName = sc.nextLine();

        System.out.print("Enter department id: ");
        String deptId = sc.nextLine();

        System.out.print("Enter department name: ");
        String deptName = sc.nextLine();

        h.getDetails(empId, empName);
        h.getDeptDetails(deptId, deptName);
        h.printAllDetails();

        sc.close();
    }
}
