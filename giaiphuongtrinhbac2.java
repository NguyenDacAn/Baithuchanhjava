package baithuchanh;

import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        
    
     Scanner sn = new Scanner(System.in);

        System.out.println("Nhap vao cac he so a, b, c cua phuong trinh ax^2 + bx + c = 0:");

        System.out.print("Nhap a: ");
        double a = sn.nextDouble();

        System.out.print("Nhap b: ");
        double b = sn.nextDouble();

        System.out.print("Nhap c: ");
        double c = sn.nextDouble();

        
        double delta = b * b - 4 * a * c;

        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo ngiem");
        }

        sn.close();
    }
}
