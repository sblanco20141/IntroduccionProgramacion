/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjprogra.prjarregloobjetos;

import java.awt.TextArea;

/**
 *
 * @author sjbla
 */
public class clsMascota {

    private String nombre;
    private String raza;
    private int peso;
    private int edad;
    private char vacunado;/*S-SI N-NO*/

    public clsMascota(String nombre, String raza, int peso, int edad, char vacunado) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    public clsMascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVacunado() {
        if (vacunado == 'S') {
            return "Si";
        }else{
            return "No";
        }
    }

    public void setVacunado(char vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return nombre + "\t" + raza + "\t" + peso + "\t" + edad + "\t" + this.getVacunado();
    }

    public clsMascota[] generarListaMascota() {
        clsHelper clsH = new clsHelper();
        int tamano = clsH.recibeInt("Digite la cantidad de mascotas que quiere almacenar:");
        clsMascota mascotas[] = new clsMascota[tamano];
        //clsCliente []clientes = new clsCliente[tamano];

        return mascotas;

    }

    public int agregarMascota(clsMascota mascotas[], int poscMascota) {
        clsHelper clsH = new clsHelper();
        String nombre = clsH.recibeString("Digite el nombre completo de la mascota:");
        String raza = clsH.recibeString("Digite la raza de la mascota:");
        int peso = clsH.recibeInt("Digite el peso de la mascota:");
        int edad = clsH.recibeInt("Digite la edad de la mascota:");
        char vacunado = ' ';
        do {
            vacunado = clsH.recibeChar("Seleccione si la mascota esta vacunda: \nSi\nNo");
        } while (vacunado != 'S' && vacunado != 'N');

        mascotas[poscMascota] = new clsMascota(nombre, raza, peso, edad, vacunado);
        poscMascota++;
        return poscMascota;
    }

    public int obtenerPoscMascota(clsMascota mascotas[], int poscMascota, String accion) {
        clsHelper clsH = new clsHelper();
        String nombreBuscar = clsH.recibeString("Digite el nombre de la mascota que desea " + accion + ":");
        int poscMascotaBuscado = -1;
        for (int i = 0; i < poscMascota; i++) {
            if (nombreBuscar.equalsIgnoreCase(mascotas[i].getNombre())) {
                poscMascotaBuscado = i;
                break;
            }
        }
        return poscMascotaBuscado;
    }

    public void modificarMascota(clsMascota mascotas[], int poscMascota) {
        clsHelper clsH = new clsHelper();
        int posc = this.obtenerPoscMascota(mascotas, poscMascota, "modificar");
        if (posc == -1) {
            clsH.imprimeMensaje("No se encontraron coincidencias con el nombre indicado.");
        } else {
            char opcion = 'S';
            do {
                opcion = clsH.recibeChar("Seleccione el dato que desea modificar:"
                        + "\n A. Nombre "
                        + "\n B. Raza"
                        + "\n C. Peso"
                        + "\n D. Edad"
                        + "\n E. Vacunado"
                        + "\n S. Salir");
                switch (opcion) {
                    case 'A':
                        mascotas[posc].setNombre(clsH.recibeString("Digite el nuevo nombre de la mascota:"));
                        break;
                    case 'B':
                        mascotas[posc].setRaza(clsH.recibeString("Digite la nueva raza de la mascota:"));
                        break;
                    case 'C':
                        mascotas[posc].setPeso(clsH.recibeInt("Digite el nuevo peso de la mascota:"));
                        break;
                    case 'D':
                        mascotas[posc].setEdad(clsH.recibeInt("Digite la nueva edad de la mascota:"));
                        break;
                    case 'E':
                        char vacunado = ' ';
                        do {
                            vacunado = clsH.recibeChar("Seleccione si la mascota esta vacunda: \nSi\nNo");
                        } while (vacunado != 'S' && vacunado != 'N');
                        mascotas[posc].setVacunado(vacunado);
                        break;
                    case 'S':
                        clsH.imprimeMensaje("Datos modificados correctamente");
                        break;
                    default:
                        clsH.imprimeMensaje("Opción seleccionada incorrecta");
                        break;
                }

            } while (opcion != 'S');
        }
    }

    public int eliminarMascota(clsMascota mascotas[], int poscMascota) {
        clsHelper clsH = new clsHelper();
        int posc = this.obtenerPoscMascota(mascotas, poscMascota, "eliminar");
        if (posc == -1) {
            clsH.imprimeMensaje("No se encontraron coincidencias con el nombre digitado");
        } else {
            for (int i = posc; i < poscMascota - 1; i++) {
                mascotas[i] = mascotas[i + 1];
            }
            poscMascota--;
            mascotas[poscMascota] = null;
            clsH.imprimeMensaje("La mascota se eliminó de forma correcta");
        }
        return poscMascota;
    }

    public void buscarMascota(clsMascota mascotas[], int poscMascota) {
        clsHelper clsH = new clsHelper();
        int posc = this.obtenerPoscMascota(mascotas, poscMascota, "buscar");
        if (posc == -1) {
            clsH.imprimeMensaje("No se encontraron coincidencia con el nombre digitado");
        } else {
            
            clsH.imprimeMensaje("Los datos de la mascota son:\n"
                    + " Nombre: " + mascotas[posc].getNombre()
                    + " \nRaza: " + mascotas[posc].getRaza()
                    + " \nPeso: " + mascotas[posc].getPeso()
                    + " \nEdad: " + mascotas[posc].getEdad()
                    + " \nVacunado: " + mascotas[posc].getVacunado()
            );
        }
    }

    public void listarMascotas(clsMascota mascotas[], int poscMascota) {
        clsHelper clsH = new clsHelper();
        String impresion = "Nombre\tRaza\tPeso\tEdad\tVacunado\n";
        for (int i = 0; i < poscMascota; i++) {
            impresion += mascotas[i].toString() + "\n";
        }
        clsH.imprimeMensaje(new TextArea(impresion));
    }

}
