/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author Hieu
 */
public class Lab1Bai4 {
    public static void main(String[] args){
        double a,b,c, x1, x2;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a=");
        a = nhap.nextInt();
        System.out.print("Nhập hệ số bậc 1, b=");
        b = nhap.nextInt();
        System.out.print("Nhập c:");
        c = nhap.nextInt();
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
