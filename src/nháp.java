import java.util.Scanner;

public class nháp {
    public static void main(String[] args) {
        // bai 8 b
      Scanner sc =new Scanner(System.in);
//        System.out.println("nhập a :");
//
//        int a= sc.nextInt();
//        System.out.println("nhâp b :");
//         int b = sc.nextInt();
//        System.out.println("nhập c: ");
//        int c = sc.nextInt();
//        System.out.println("nhập r :");
//        int r = sc.nextInt();
//        System.out.println("nhập h ");
//        int h=sc.nextInt();
//
//        double kq = ((double)(a+4)*(b-2*c+3))/(((double)r/(2*h)) - 9*(a-1));
//
//        System.out.println("kết quả biểu thức : "+kq);

        // c
      //Math.abs(10) hàm giá trị tuyêt đối ;
        System.out.println(" nhập a :");
        int a =sc.nextInt();
        System.out.println("nhập x :");
        int x = sc.nextInt();
         //ko ép kiẻu
       // double kq = Math.sqrt(Math.abs(a + Math.pow(Math.sin(x), 2) - x));
        // su dung ep kieu
        double kq=Math.sqrt(Math.abs((double)a+Math.pow(Math.sin(x),2)-x));
        System.out.println("kết quả biểu thức : "+kq);

    }
}

