import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    String section;
    String branch;

    Student(String name, int rollNo, String section, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
        this.branch = branch;
    }

    void displayStudentInfo() {
        System.out.println("\n-----Student Information-----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}

class StudentInfoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        Student student = new Student(name, rollNo, section, branch);

        student.displayStudentInfo();

        sc.close();
    }
}