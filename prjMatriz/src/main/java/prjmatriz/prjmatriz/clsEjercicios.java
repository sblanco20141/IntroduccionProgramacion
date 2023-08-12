/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjmatriz.prjmatriz;

import java.awt.TextArea;

/**
 *
 * @author sjbla
 */
public class clsEjercicios {

    private int mat[][] = new int[0][0];

    public void llenarMatriz() {
        clsHelper clsH = new clsHelper();
        int filas = clsH.recibeInt("Digite la cantidad de filas de la matriz:");
        int columnas = clsH.recibeInt("Digite la cantidad de columnas de la matriz:");

        mat = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                //mat[f][c] = clsH.recibeInt("Digite un numero para la posición ("+f+","+c+")");

                mat[f][c] = (int) (Math.random() * (100)) + 1;
                clsH.imprimeMensaje("Se ha generado mediante random el numero " + mat[f][c]
                        + " para la posición (" + f + "," + c + ")");
            }
        }
    }

    public void leerMatriz() {
        clsHelper clsH = new clsHelper();
        String imprime = "";
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                imprime += mat[f][c] + "\t";
            }
            imprime += "\n";
        }
        clsH.imprimeMensaje(new TextArea(imprime));
    }

    public void calculosMatriz() {
        clsHelper clsH = new clsHelper();
        clsH.imprimeMensaje("Calculo con las esquinas");
        int esquina1 = mat[0][0];
        int esquina2 = mat[0][mat[0].length - 1];
        int esquina3 = mat[mat.length - 1][0];
        int esquina4 = mat[mat.length - 1][mat[0].length - 1];

        int sumaEsquinas = esquina1 + esquina2 + esquina3 + esquina4;
        clsH.imprimeMensaje("La suma de las esquinas es: " + sumaEsquinas);

        clsH.imprimeMensaje("Calculo de la diagonal");
        int promedioDiag = 0;
        if (mat.length == mat[0].length) {
            for (int f = 0; f < mat.length; f++) {
                promedioDiag += mat[f][f];
            }
            promedioDiag = 0;
            for (int f = 0; f < mat.length; f++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (f == c) {
                        promedioDiag += mat[f][f];
                    }
                }
            }
            promedioDiag = promedioDiag / mat.length;
            clsH.imprimeMensaje("El promedio de la diagonal es: " + promedioDiag);

            clsH.imprimeMensaje("Calculo de la diagonal");
            int sumaDiagInv = 0;
            int c = mat.length - 1;
            for (int f = 0; f < mat.length; f++) {
                sumaDiagInv += mat[f][c];
                c--;
            }
            sumaDiagInv = 0;
            for (int f = 0; f < mat.length; f++) {
                for (int co = 0; co < mat[0].length; co++) {
                    if (f + co == mat.length - 1) {
                        sumaDiagInv += mat[f][co];
                    }
                }
            }
            clsH.imprimeMensaje("La suma de la diagonal inversa es: " + sumaDiagInv);
            
        } else {
            clsH.imprimeMensaje("La matriz no es cuadrada por tanto no se puede calcular la diagonal");
        }

    }
    
    public void ordenarMatriz(){
        clsHelper clsH = new clsHelper();
        char opcion = ' ';
        do {
            opcion = clsH.recibeChar("Elija como ordenar \nAscendente\nDescendente");
        } while (opcion != 'A' && opcion != 'D');
        if (opcion == 'A') {
            for (int f = 0; f < mat.length; f++) {
                for (int c = 0; c < mat[0].length; c++) {
                    for (int x = 0; x < mat.length; x++) {
                        for (int y = 0; y < mat[0].length; y++) {
                            if (mat[f][c]< mat[x][y]) {
                                int temp = mat[f][c];
                                mat[f][c] = mat[x][y];
                                mat[x][y] = temp;
                            }
                        }
                    }
                }
            }
        
        }else{
            for (int f = 0; f < mat.length; f++) {
                for (int c = 0; c < mat[0].length; c++) {
                    for (int x = 0; x < mat.length; x++) {
                        for (int y = 0; y < mat[0].length; y++) {
                            if (mat[f][c]> mat[x][y]) {
                                int temp = mat[f][c];
                                mat[f][c] = mat[x][y];
                                mat[x][y] = temp;
                            }
                        }
                    }
                }
            }
        
        }
            
    
    }
}
