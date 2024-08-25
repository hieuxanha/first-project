import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("nhập x :");
//        float x =sc.nextFloat();
//        System.out.println("nhập y :");
//        float y = sc.nextFloat();
//
//        double s =Math.pow(x,y);
//
//        System.out.printf("Giá trị của %f^%f=%f",x,y,s);
//        System.out.println(" ");

      Scanner sc=new Scanner(System.in);
        System.out.println("nhập x : ");
        float x = sc.nextFloat();
        System.out.println("nhập y : ");
        float y = sc.nextFloat();
        double s = Math.pow(x,y);

        System.out.printf("giá trị của %f^%f=%f ",x,y,s);
    }
}
