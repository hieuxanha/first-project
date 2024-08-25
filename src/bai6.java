import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double x;
      double n;


        do{
            System.out.println("nhâp x : ");
             x =sc.nextDouble();
        }while(x<0);

        System.out.println("nhâp n : ");
        n=sc.nextDouble();
        double kq =Math.pow(x,1/n);

        System.out.println("in ra màn hình : "+kq);
    }
}
