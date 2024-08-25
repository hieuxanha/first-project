import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập r :");
        double r = sc.nextDouble();
        //ct chu vi : 2*3,14*r
        //dt : r*r*3,14
        double cv=2*Math.PI*r;
        double dt=Math.pow(r,2)*Math.PI;

        System.out.println("Kết quả cv : "+cv);
        System.out.println("kết quả dt :"+dt);
    }
}
