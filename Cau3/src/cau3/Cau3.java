package cau3;

import java.util.Scanner;

public class Cau3 {

    public static double tinh(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Chia cho 0");
                return a / b;
            default:
                throw new IllegalArgumentException("Phep tinh khong hop le");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, result;
        char op;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        System.out.print("Chon phep tinh (+, -, *, /): ");
        op = sc.next().charAt(0);

        try {
            result = tinh(a, b, op);
            System.out.println("Ket qua: " + a + " " + op + " " + b + " = " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}