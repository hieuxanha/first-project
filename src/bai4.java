import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập a :");
//        double a = sc.nextFloat();
//        System.out.println("nhập x :");
//        double x= sc.nextFloat();
//        // e math.exp
//        double z=Math.exp(a+Math.pow(Math.sin(x),2)-x);
//        System.out.printf("biểu thức %f %f = %f ",a,x,z);

        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a : ");
        double a= sc.nextDouble();
        System.out.println("nhap b : ");
        double b =sc.nextInt();

        double x = sc.nextFloat();

        double z=Math.exp(a+Math.pow(Math.sin(x),2)-x);

        System.out.printf("biểu thức %f^%f %f",a,x,z);
    }
}
