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
public class clsCliente {
    private String nombreCompleto;
    private String correo;
    private String numTelefono;
    private String direccion;
    private int edad;
    
    private clsMascota listaMascotas[];
    private int cantMascotas;

    public clsCliente(String nombreCompleto, String correo, String numTelefono, String direccion, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public clsCliente() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public clsMascota[] getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(clsMascota[] listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public int getCantMascotas() {
        return cantMascotas;
    }

    public void setCantMascotas(int cantMascotas) {
        this.cantMascotas = cantMascotas;
    }

    @Override
    public String toString() {
        return nombreCompleto + "\t" + correo + "\t" + numTelefono + "\t" + direccion + "\t" + edad ;
    }
    
    public clsCliente[] generarListaCliente(){
        clsHelper clsH = new clsHelper();
        int tamano = clsH.recibeInt("Digite la cantidad de clientes que quiere almacenar");
        clsCliente clientes[] = new clsCliente[tamano];        
        //clsCliente []clientes = new clsCliente[tamano];
        
        return clientes;

    }
    
    public int agregarCliente(clsCliente clientes[], int poscCliente ){
        clsHelper clsH = new clsHelper();
        String nombreCompleto = clsH.recibeString("Digite el nombre completo del cliente:");
        String correo = clsH.recibeString("Digite el correo del cliente:");
        String numTelefono = clsH.recibeString("Digite el teléfono del cliente:");
        String direccion = clsH.recibeString("Digite la dirección del cliente:");
        int edad = clsH.recibeInt("Digite la edad del cliente");
        clientes[poscCliente] = new clsCliente(nombreCompleto, correo, numTelefono, direccion, edad);
        poscCliente++;
        return poscCliente;
    }
    
    public void listarClientes(clsCliente clientes[], int poscCliente){
        clsHelper clsH = new clsHelper();
        String impresion = "Nombre\tCorreo\tTelefono\tDireccion\tEdad\n";
        for (int i = 0; i < poscCliente; i++) {
            impresion += clientes[i].toString()+"\n";
        }
        clsH.imprimeMensaje(new TextArea(impresion));
    }
    
    
}
