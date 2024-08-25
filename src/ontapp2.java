import java.util.Scanner;

public class ontapp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập bán kinh đường tròn : ");
        double r =sc.nextDouble();


        double dt= Math.PI*Math.pow(r,2);
        double chuvi = 2* Math.PI*r;


        System.out.println("Kết quả của chu vi : "+chuvi);
        System.out.println("Kết quả của điẹn tích "+dt);
    }
}
