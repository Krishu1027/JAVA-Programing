import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;

    public Box(double l,double w,double h){
        length=l;
        width=w;
        height=h;
    }
    public double volume(){
        return length*width*height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Box myBox = new Box(l, w, h);

        double vol = myBox.volume();
        System.out.println("Volume: " + vol);

        sc.close();
    }
}