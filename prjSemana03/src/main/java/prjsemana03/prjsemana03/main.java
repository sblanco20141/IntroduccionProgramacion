/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prjsemana03.prjsemana03;

import javax.swing.JOptionPane;


/**
 *
 * @author sjbla
 */
public class main {
   public static void main(String[] args) {
      /*JAVA VS PYTHON
            1. Python no declara ni inicializa variables  - Java declara e inicializa variables
                byte, short, int,  long, - Enteros
                float, double,-Reales ---- numeros
                char - Caracter
                string - Cadena de Caracteres
       
                tipoDato identificador; ---declarar
                identificador = valor; ---- incializar
                
                tipoDato identificador = valor, identificador2 = valor.....;
                ejemplo:
                    byte mesesAnio = 0;
            2. Python identando vs Java ; y { }
                {} --- bloque de código - clases, métodos, for, while, if, switch
                ; --- finalización de una línea de código
            3. Conversiones
                a. Conversión implícita
                    valor mas pequeño a uno mas grande:
                    EJ:
                        byte --> int
                b. Conversión emplícita
                    I. Conversiones de tipo de dato
                        string --> a cualquier dato
                        de cualquier tipo de dato --> string
                    II. Cast
                        tipos de datos numericos, se pasa de un tipo mas grande a uno mas pequeño
       
                
       */
      /*Declarar variables*/
      byte conversion = 5;
      int num1 = 0, num2 = 0, resultado = 0;
      
      num1 = conversion;//Conversión implícita
      String valor = JOptionPane.showInputDialog("Digite un número entero: ");
      num1 = Integer.parseInt(valor); // Conversión de tipo de dato
      conversion = (byte)num1;//Conversión de tipo cast
      valor = JOptionPane.showInputDialog("Digite el segundo número:");
      num2 = Integer.parseInt(valor);
      /*Proceso*/
      resultado = num1 + num2;
      
      //Resultado
      /*Importar librería de forma manual
        1. Escribir 
            import javax.swing.JOptionPane;
        2. Si ya esta en uso la librería 
            CTRL + SHIFT + I
      */
       JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+resultado+".");
    }

}
