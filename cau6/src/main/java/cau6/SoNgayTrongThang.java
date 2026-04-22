
package cau6;
import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();

        int soNgay = 0;

        if (thang < 1 || thang > 12) {
            System.out.println("Thang khong hop le!");
            return;
        }

        if (thang == 2) {
            System.out.print("Nhap nam: ");
            int nam = sc.nextInt();

            if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                soNgay = 29;
            } else {
                soNgay = 28;
            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            soNgay = 30;
        } else {
            soNgay = 31;
        }

        System.out.println("Thang " + thang + " co " + soNgay + " ngay");
    }
}