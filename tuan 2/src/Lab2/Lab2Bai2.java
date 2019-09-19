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
public class Lab2Bai2 {
    public static void main(String[] args){
        double a,b,c,x,x1,x2;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a=");
        a = nhap.nextInt();
        System.out.print("Nhập hệ số bậc 1, b=");
        b = nhap.nextInt();
        System.out.print("Nhập c:");
        c = nhap.nextInt();
        if(a==0){
            System.out.println("Phương trình bậc nhất:");
            x = c/-b;
            System.out.print("Nghiệp của phương trình là:"+" "+x);
        }
        else{
            double Delta = Math.pow(b,2) - 4*a*c;
            System.out.println("Delta =" + " " +Delta);
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
    }
}

