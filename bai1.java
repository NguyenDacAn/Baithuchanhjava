package chuong2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = 0;
        double chiaDu = 0;
        if (b != 0) {
            thuong = a / b;
            chiaDu = a % b;
        } else {
            System.out.println("Lỗi:Khi b không được là 0 khi thực hiện phép chia!");
        }
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        if (b != 0) {
            System.out.println("Thương: " + thuong);
            System.out.println("Chia lấy dư: " + chiaDu);
        }
        if (a > b) {
            System.out.println(a + " lớn hơn " + b);
        } else if (a < b) {
            System.out.println(a + " nhỏ hơn " + b);
        } else {
            System.out.println("Hai số bằng nhau.");
        }
        scanner.close();
    }
}
