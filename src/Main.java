//bai 1;
import java.util.Scanner;

//  Tinh dien tich chu nhat
//ct
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        double chieudai = sc.nextDouble();
        System.out.println("nhập chiều rộng :");
        double chieurong = sc.nextDouble();


        double a = chieudai*chieurong;
        double b = (chieudai + chieurong)*2;

        double c = Math.sqrt(Math.pow(chieudai,2)+Math.pow(chieurong,2));
        System.out.printf("tính chu vi hcn : %f",a);
        System.out.println(" ");

        System.out.printf("tính dt hcn : %f ",b);
        System.out.println(" ");
        System.out.printf("dg chéo : %f",c);
        System.out.print(" ");

        }
    }
