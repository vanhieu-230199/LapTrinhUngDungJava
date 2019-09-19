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
public class Lab1Bai3 {
    public static void main(String[] args){
        float canh;
        Scanner c = new Scanner(System.in);
        System.out.println("Nhập số đo của cạnh:");
        canh = c.nextFloat();
        float theTichLapPhuong = canh*canh*canh;
        System.out.println("Thể tích lập phương:" +theTichLapPhuong);
    }
}
