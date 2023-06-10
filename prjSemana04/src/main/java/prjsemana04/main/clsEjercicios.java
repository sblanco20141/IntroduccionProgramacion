/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana04.main;

import javax.swing.JOptionPane;

/**
 *
 * @author sjbla
 */
public class clsEjercicios {

    public void menu() {
        char opcion = ' ';
        /*
          Estructuras de Repetición
            Do ... WHILE
            WHILE
         */
        do {

            opcion = JOptionPane.showInputDialog("Seleccione una opción:"
                    + "\nA. Ejemplo del IF"
                    + "\nB. Ejemplo del Case"
                    + "\nC. Ejemplo del While"
                    + "\nD. Ejemplo del For"
                    + "\nS. Salir").toUpperCase().charAt(0);

            /*implementar mi estructura de selección - switch - case*/
            switch (opcion) {
                case 'A':
                    JOptionPane.showMessageDialog(null, "Bienvenido al ejemplo de IF");
                    this.ejemploIf();
                    break;
                case 'B':
                    JOptionPane.showMessageDialog(null, "Bienvenido al ejemplo de CASE");
                    this.ejemploCase();
                    break;
                case 'C':
                    JOptionPane.showMessageDialog(null, "Bienvenido al ejemplo de WHILE");
                    break;
                case 'D':
                    JOptionPane.showMessageDialog(null, "Bienvenido al ejemplo de FOR");
                    break;
                case 'S':
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema."
                            + "\nSaliendo..............");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
            }

        } while (opcion != 'S');

    }

    public void ejemploCase() {
        /*Desarrolle una calculadora de operadores básicos que permita generar el cálculo con dos números*/
        float num1 = 0.0f, num2 = 0.0f, resultado = 0.0f;
        char operacion = 'S';

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer valor"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo valor"));

        operacion = JOptionPane.showInputDialog("Seleccione la operación:"
                + "\n+. Suma"
                + "\n-. Resta"
                + "\n*. Multiplicación"
                + "\n/. División").charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "El valor del divisor es 0, por tanto no es válida la operación");
                } else {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "La operación seleccionada no es válida");
                break;
        }

    }
    
    public void ejemploIf(){
        /*Genere un programa que me valide 3 numeros enteros, determine si estos son todos iguales, 
        todos diferentes o bien si hay dos iguales y uno diferente, en caso de que todos sean diferentes
        determine cual es el mayor, y el menor*/
        int num1=0, num2=0, num3=0;
        
        num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        num3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número"));
        /*and ---> &&*/
        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Todos los números son iguales");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3)
        {
            JOptionPane.showMessageDialog(null, "Todos los número son diferentes");
            /*Se determina cual es el número mayor*/
            if (num1> num2 && num1>num3) {
                JOptionPane.showMessageDialog(null, "El número mayor es num1: "+num1);
            }
            else if (num2> num1 && num2>num3) {
                JOptionPane.showMessageDialog(null, "El número mayor es num2: "+num2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El número mayor es num3: "+num3);
            }
            /*Se determina cual es el número menor*/
            if (num1< num2 && num1<num3) {
                JOptionPane.showMessageDialog(null, "El número menor es num1: "+num1);
            }
            else if (num2< num1 && num2<num3) {
                JOptionPane.showMessageDialog(null, "El número menor es num2: "+num2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El número menor es num3: "+num3);
            }
        }
        else{
            if (num1 != num2) {
                if (num1 == num3) {
                    JOptionPane.showMessageDialog(null, "Los valores de num1 y num3("+num1+") son iguales y el num2 es diferente("+num2+").");
                }
                else if (num2 == num3) {
                    JOptionPane.showMessageDialog(null, "Los valores de num2 y num3("+num2+") son iguales y el num1 es diferente("+num1+").");
                }
            }
            else if (num1 != num3) {
                if (num1 == num2) {
                    JOptionPane.showMessageDialog(null, "Los valores de num1 y num2("+num1+") son iguales y el num3 es diferente("+num3+").");
                }
                else if (num2 == num3) {
                    JOptionPane.showMessageDialog(null, "Los valores de num2 y num3("+num2+") son iguales y el num1 es diferente("+num1+").");
                }
            }
        }
    }
}
/*def*/
