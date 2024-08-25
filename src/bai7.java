import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhập biến a :");
        a = sc.nextInt();
        System.out.println("nhập biến b :");
         b= sc.nextInt();
//a biến k trung gian
        System.out.println("biến a :"+a+" biến b :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("biến a :"+a+" biến b :"+b);
// b biến trung gian
//        int temp=a;
//        a=b;
//        b=temp;

    }
}
