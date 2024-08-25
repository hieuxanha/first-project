import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập v : ");
        double v = sc.nextDouble();
        System.out.println("nhập t :");
         double t =sc.nextDouble();

         double G = 9.8;

         double s =t*v;
         double h =(G*Math.pow(t,2))/2;

        System.out.println("kết quả độ cao h : "+s);
        System.out.println("kết quả tầm xa s : "+h);



    }
}
