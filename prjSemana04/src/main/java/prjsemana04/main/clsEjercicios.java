/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana04.main;

import java.awt.TextArea;
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
                    this.ejemploWhile();
                    break;
                case 'D':
                    JOptionPane.showMessageDialog(null, "Bienvenido al ejemplo de FOR");
                    this.ejemploFor();
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
    
    public void ejemploWhile(){
        /*Genere un programa que reciba del usuario numeros hasta que este ya no 
          desee realizar más iteraciones, al final con los numeros recibidos imprima:
            1. Cantidad de números pares
            2. Cantidad de números impares
            3. Numero Mayor
            4. Numero Menor
        */
        char continuar = 'S';
        int cantPar = 0, cantImpar = 0, numeroMay = 0, numeroMen = 0;
        boolean primeraVez = true;
        while(continuar == 'S'){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            if (primeraVez) {
                numeroMay = numero;
                numeroMen = numero;
                primeraVez = false;
            }else{
                if (numeroMay<numero) {
                    numeroMay = numero;
                }
                if (numeroMen>numero) {
                    numeroMen = numero;
                }
            }
            if (numero%2 == 0) {
                cantPar++;
                //cantPar+=1;
                //cantPar=cantPar+1;
            }else{
                cantImpar++;
            }
            do {
                continuar = JOptionPane.showInputDialog("Desea continuar?\nSi\nNo").toUpperCase().charAt(0);
            } while (continuar != 'S'&& continuar != 'N');
        }
        JOptionPane.showMessageDialog(null, "Los resultados obtenidos son:"
                + "\nCantidad de Pares: "+cantPar
                + "\nCantidad de Impares: "+cantImpar
                + "\nNumero Mayor: "+numeroMay
                + "\nNumero Menor: "+numeroMen
        );
    }
    
    public void ejemploFor(){
        /*
            Utilizando ciclos genere una pirámide con *, debe imprimir caracter a caracter
            y debe consultar al usuario la cantidad de pisos de la pirámide.
        */
        int tam = 0;
        do {
            tam =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero mayor o igual a 3:"));
        } while (tam<3);
        String piramide = "";
        int espacios = tam;
        for (int p = 0; p < tam; p++) { //Imprime a la siguiente linea
            for (int b = espacios; b > 0; b--) { //Espacio en blanco
                piramide+=" ";
            }
            for (int a = 0; a <= p ; a++) { //Lado Izquierdo
                piramide+="*";
            }
            for (int a = 0; a <= p ; a++) { //Lado Derecho
                piramide+="*";
            }
            espacios--;
            piramide+="\n";
        }
        JOptionPane.showMessageDialog(null, new TextArea(piramide));
        System.out.println(piramide);
    }
}
/*def*/
