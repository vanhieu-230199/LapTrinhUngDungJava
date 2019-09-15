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
public class Lab3Bai2 {
    public static void main(String[] args){
        for(int i=2;i<=9;i++){
            System.out.println("");
            for(int j=1;j<=10;j++){
            System.out.printf("%d x %d = %d",i,j,i*j);
            System.out.println("");
            }
        }
    }
}
