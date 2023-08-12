/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjmatriz.prjmatriz;

/**
 *
 * @author sjbla
 */
public class clsMenu {
    public void menuPrincipal(){
        clsHelper clsH = new clsHelper();
        clsEjercicios clsE = new clsEjercicios();
        char opcion = ' ';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion:"
                    + "\nA. Llenar Matriz"
                    + "\nB. Leer Matriz"
                    + "\nC. Calculos de Diagonales"
                    + "\nD. Ordenar Matriz"
                    + "\nS. Salir");
        
        switch (opcion) {
            case 'A':
                clsE.llenarMatriz();
                break;
            case 'B':
                clsE.leerMatriz();
                break;
            case 'C':
                clsE.calculosMatriz();
                break;
            case 'D':
                clsE.ordenarMatriz();
                break;
            case 'S':
                
                break;
            default:
                clsH.imprimeMensaje("Opción incorrecta");
        }
        } while (opcion != 'S');
    }
}
