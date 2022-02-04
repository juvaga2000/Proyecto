/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasentornos;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author vaqgalju
 */
public class HolaMundo extends JFrame{
    
    public HolaMundo(){
        
        JLabel jl = new JLabel("Mi primer JFrame");
        add(jl);
        this.setSize(1620,300);
        this.setTitle("Prueba");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        HolaMundo hola = new HolaMundo();
    }
}
