/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjprogra.prjarregloobjetos;

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

    public char getVacunado() {
        return vacunado;
    }

    public void setVacunado(char vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return  nombre + "\t" + raza + "\t" + peso + "\t" + edad + "\t" + vacunado;
    }
    
    
    
    
    
    
    
           
}
