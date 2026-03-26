package Lab3;

import java.util.Scanner;

class TwoDSheets{
    double length, width;
    TwoDSheets(double l, double w){
        length=l;
        width=w;
    }

    void displaycost1(){
        System.out.println("Cost: Rs. " +(length*width*40));
    }
}

class ThreeDBox extends TwoDSheets {
    double height;
    ThreeDBox(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    void displayCost2() {
        System.out.println("Cost: Rs " + (length * width * height * 60));
    }
}

public class Plasticbox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose (1->2D Sheet, 2->3D Box): ");
        int choice = sc.nextInt();

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        if (choice==1){
            new TwoDSheets(l,w).displaycost1();
        } else{
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            new ThreeDBox(l,w,h).displayCost2();
        }
        sc.close();
    }
}