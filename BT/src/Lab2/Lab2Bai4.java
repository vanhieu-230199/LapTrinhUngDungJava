/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.Scanner;
/**
 *
 * @author Hieu
 */
public class Lab2Bai4 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("1. Giải phương trình bậc nhất");
       System.out.println("2. Giải phương trình bậc 2");
       System.out.println("3. Tính tiền điện");
       System.out.println("4. Kết thúc");
       System.out.print("Chọn chức năng:"+ " ");
       int chon = sc.nextInt();
       switch(chon){
           case 1:
            System.out.print("Nhập số a:"+" ");
            float a = sc.nextFloat();
            System.out.print("Nhập số b:"+" ");
            float b = sc.nextFloat();
            if(a==0){
                if(b==0){
                    System.out.print("Phương trình vô số nghiệm");
                }
                else{
                    System.out.print("Phương trình vô nghiệm");
                }
            }
            else{
                float x = -b/a;
                System.out.print("Ngiệm của phương trình là: x="+" "+x);
            }
           case 2:
               
               System.out.print("Nhập hệ số bậc 2, a=");
        a = sc.nextInt();
        System.out.print("Nhập hệ số bậc 1, b=");
        b = sc.nextInt();
        System.out.print("Nhập c:");
        double c = sc.nextInt();
        if(a==0){
            System.out.println("Phương trình bậc nhất:");
            double x = c/-b;
            System.out.print("Nghiệp của phương trình là:"+" "+x);
        }
        else{
            double Delta = Math.pow(b,2) - 4*a*c;
            System.out.println("Delta =" + " " +Delta);
            double x1,x2;
            if(Delta ==0){
                 x1= x2 = -b/(2*a);
                System.out.println("Nghiệp x1, x2" + " " +x1);
            }
            else if(Delta >0){
                x1 = (-b + Math.sqrt(Delta)) /  (2*a);
                x2 = (-b - Math.sqrt(Delta)) / (2*a);
                System.out.println("Nghiệp x1=" + " " +x1);
                System.out.println("Nghiệp x2=" + " " +x2);
            }
                else{
                    System.out.print("Phương trình vô nghiệp");
            }
        }
           case 3:
               System.out.println("Nhập số điện tháng này:");
        int soDien = sc.nextInt();
        if(soDien ==0 && soDien <=50){
                System.out.println("Số giá của mỗi số điện là: 1000");
                int Tien = soDien*1000;
                System.out.println("Số tiền điện tháng này là:"+" "+Tien);
            }
            else{
                System.out.println("Số giá của mỗi số điện vượt hạn mức là: 1200");
                int Tien = soDien*1200;
                System.out.println("Số tiền điện tháng này là:"+" "+Tien);
        }
           case 4:
            default:
                System.out.println("Kết thúc");
    }
} 
}
