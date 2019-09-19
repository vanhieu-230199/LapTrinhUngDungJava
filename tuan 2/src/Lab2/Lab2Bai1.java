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
public class Lab2Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
    }
}
