
package cau2;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so km: ");
        double km = sc.nextDouble();

        if (km < 0) {
            System.out.println("Nhap du lieu sai!");
        } else {
            double tien = km * 10000;
            System.out.println("Tien taxi phai tra: " + tien + " VND");
        }
    }
}