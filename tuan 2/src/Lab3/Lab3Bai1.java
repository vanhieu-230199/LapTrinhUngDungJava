/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;
import java.util.Scanner;
/**
 *
 * @author Hieu
 */
public class Lab3Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số N:");
        int N = sc.nextInt();
        boolean ok = true;
        for(int i = 2;i < N-1;i++){
            if(N%i==0){
                ok = false;
                break;   
            }
            i++;
        }
        System.out.println(ok);
    }
}
