package Lab7;

class ArithmeticExceptionDemo{
    public static void main(String[] args){
        int n1=10;
        int n2=0;
        System.out.println("Operand values: divident="+n1+", divisor="+n2);
        try{
            int r=n1/n2;
            System.out.println("Result: "+r);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException caught");
        }finally {
            System.out.print("Finally block executed");
        }
    }
}