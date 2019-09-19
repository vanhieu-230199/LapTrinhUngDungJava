/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Hieu
 */
public class Lab3Bai3 {
    public static void main(String[] args){
        int min=1;
        int[] arrInt = {7, 8, -1, 0, 12, 13, 9, 20, 2, -5};
        Arrays.sort(arrInt);
        for(int i=1;i<arrInt.length;i++){
            System.out.print(" " +arrInt[i]);
            int Min = Math.min(min,arrInt[i]);
        } 
    }
}
