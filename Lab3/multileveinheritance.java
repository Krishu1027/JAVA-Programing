package Lab3;

import java.util.Scanner;

class Plate{
    double length;
    double width;

    Plate(double l, double w){
        length = l;
        width = w;
        System.out.println("Dimensions of Plate:-");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Dimension of Box:-");
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
    }
}

class Woodbox extends Box{
    double thick;

    Woodbox(double l, double w, double h, double t){
        super(l,w,h);
        thick = t;
        System.out.println("Dimension of Woodbox:-");
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height + ", Thickness: " + thick);
    }
}

public class multileveinheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimension for Woodbox:-");
        System.out.print("Enter Length: ");
        double l=sc.nextDouble();

        System.out.print("Enter Width: ");
        double w=sc.nextDouble();

        System.out.print("Enter Height: ");
        double h=sc.nextDouble();

        System.out.print("Enter Thickness: ");
        double t=sc.nextDouble();

        Woodbox wb = new Woodbox(l, w, h, t);

        sc.close();
    }
}
