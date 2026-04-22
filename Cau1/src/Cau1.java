
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chieuDai, chieuRong;
        while (true) {
            System.out.print("Nhap chieu dai: ");
            chieuDai = sc.nextDouble();
            if (chieuDai > 0) {
                break;
            } else {
                System.out.println("Nhap sai.");
            }
        }
        while (true) {
            System.out.print("Nhap chieu rong: ");
            chieuRong = sc.nextDouble();
            if (chieuRong > 0) {
                break;
            } else {
                System.out.println("Nhap sai.");
            }
        }

        double dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);

        sc.close();
    }
}
