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
public class Lab2Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
    }
}
