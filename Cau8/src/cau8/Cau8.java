/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau8;

/**
 *
 * @author nam25
 */
import java.util.Scanner;
 
public class Cau8 {
 
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
 
        if (laSoNguyenTo(a)) {
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " khong phai la so nguyen to");
        }
 
        sc.close();
    }
}