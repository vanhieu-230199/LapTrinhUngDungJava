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
public class Lab1Bai2 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        float chieuDai,chieuRong;
        System.out.println("nhap chieu dai:");
        chieuDai= a.nextFloat();
        System.out.println("Nhập chiều rộng:");
        chieuRong= b.nextFloat();
        float chuVi = (chieuDai+chieuRong)*2;
        System.out.println("Chu vi:" +chuVi);
        float dienTich = chieuDai*chieuRong;
        System.out.println("Diện tích:" +dienTich);
        float canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.println("Cạnh nhỏ nhất:" +canhNhoNhat);
    }
}
