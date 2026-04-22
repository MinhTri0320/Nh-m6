
import java.util.*;

public class Cau4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh 0x + 0 = 0 vo so nghiem");
            } else {
                System.out.println("Phuong trinh 0x " + (b < 0 ? "- " + (-b) : "+ " + b) + " = 0 vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh " + a + "x " + (b < 0 ? "- " + (-b) : "+ " + b) + " = 0 co nghiem la: x = " + x);
        }
    }
}
