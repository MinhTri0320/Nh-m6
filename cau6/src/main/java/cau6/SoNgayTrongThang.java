
package cau6;
import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();

        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        int soNgay = 0;

        if (thang < 1 || thang > 12) {
            System.out.println("Thang khong hop le!");
            return;
        }

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
        }

        System.out.println("Thang " + thang + " nam " + nam + " co " + soNgay + " ngay");
    }
}
