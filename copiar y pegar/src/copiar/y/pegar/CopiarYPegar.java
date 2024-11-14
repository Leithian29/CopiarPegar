/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiar.y.pegar;

import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CopiarYPegar extends JFrame {
          private JLabel labelpegar = new JLabel("texto copiado");
          private JLabel labelTitulo = new JLabel("Titulo");
          private JTextField labelCopiar = new JTextField(8);
          private JButton BtnCopiar = new JButton("Copiar");
          private JButton BtnPegar = new JButton("Pegar");
   
          
          public CopiarYPegar(){
        setTitle("Copiar Pegar");
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);     
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        
        
        
        
        
          }
          
          public void addComponentes(CopiarYPegar ventana){
          
          ventana.add(labelTitulo);
          ventana.add(labelCopiar);
          ventana.add(BtnCopiar);
          ventana.add(labelpegar);
          ventana.add(BtnPegar);
          
          
          
          }
          
          
public static void main(String[] args) {
     
        CopiarYPegar ventana = new CopiarYPegar();
        
        ventana.addComponentes(ventana);
        
        ventana.setVisible(true);
        
        
        
        
    }
}