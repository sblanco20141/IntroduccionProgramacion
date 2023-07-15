/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prjsemana09.prjSemana09;

/**
 *
 * @author sjbla
 */
public class main {

    public static void main(String[] args) {
        clsHelper clsH = new clsHelper();
        
        clsPersona clsP1 = new clsPersona();
        //clsP1.nombre=clsH.recibeString("Digite un nombre");        
//        clsP1.setNombre(clsH.recibeString("Digite un nombre"));
//
//        
        
//        
        clsP1.insertarPersona();
        clsH.imprimeMensaje("El nombre es: "+clsP1.getNombre());
    }
}
