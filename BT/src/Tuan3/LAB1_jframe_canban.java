/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Hieu
 */
public class LAB1_jframe_canban extends JFrame {
    public LAB1_jframe_canban(){
        setVisible(true);
        setTitle("Hello java");
        JPanel x=new JPanel();
        x.setBackground(Color.blue);
        x.setForeground(Color.black);
        setSize(300,300);
        add(x);
    }
    public static void main(String[] args) {
        new LAB1_jframe_canban();
    }
}
