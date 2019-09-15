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
public class Lab1Bai1 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Họ và tên:");
        String hoTen = a.nextLine();
        System.out.printf("Điểm TB:");
        float diemTB = Float.parseFloat(a.nextLine());
        System.out.printf("ho ten:,  điểm : "+ hoTen+" " +diemTB);
    }
}

