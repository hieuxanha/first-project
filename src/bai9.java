import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a :");
        int a = sc.nextInt();
        System.out.println("nhap b :");
        int b = sc.nextInt();
        System.out.println("nhap c : ");
        int c = sc.nextInt();
        System.out.println("nhap x1 :");
        int x= sc.nextInt();
        System.out.println("nhap y1 : ");
        int y=sc.nextInt();

        double kq = (a*x+b*y+c)/(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("kết quả : "+kq);


    }
}
