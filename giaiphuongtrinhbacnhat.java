package baithuchanh;

import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        double hesoa,hesob,nghiemX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap a");
        hesoa= scanner.nextDouble();
        System.out.println("Moi nhap b");
        hesob= scanner.nextDouble();
        if(hesoa==0){
            if(hesob==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else
                {System.out.println("Phuong trinh vo nghiem");}
        }else
             {
                nghiemX= -hesob/hesoa;
                System.out.println("Phuong trinh co nghiem x ="+ nghiemX);

             }
    }
}
