/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana09.prjSemana09;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author sjbla
 */
public class clsHelper {
    //Atributos
    
    //Construtor
    public clsHelper(){}
    //Getter and Setter --Encapsulamiento de Atributos --Opcional
    
    //Metodos
    public int recibeInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public char recibeChar(String mensaje){
        return JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);
    }
    public String recibeString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public void imprimeMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void imprimeMensaje(TextArea mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
