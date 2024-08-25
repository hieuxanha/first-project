import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập x :");
        int x=sc.nextInt();
        System.out.println("nhập y :");
        int y=sc.nextInt();

        double kq=(x+y)/(2+(double)x/y);
        System.out.println("kq = "+kq);
    }

}
