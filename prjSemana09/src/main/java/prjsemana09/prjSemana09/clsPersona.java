/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana09.prjSemana09;

/**
 *
 * @author sjbla
 */
public class clsPersona {
    //Atributos
    /*nombre, apellido1, apellido2, identificacion, sexo*/
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int identificacion;
    private char sexo; //H: Hombre, M: Mujer, I: Intersex
    
    
    //Constructor
    
    public clsPersona(){}
    
    public clsPersona(String nombre){
        this.nombre = nombre;
    }
    
    public clsPersona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public clsPersona(String nombre, String apellido1, String apellido2, int identificacion, char sexo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificacion = identificacion;
        this.sexo = sexo;
    }
    
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'H') {
            this.sexo = sexo;
        }
        else if (sexo == 'M') {
            this.sexo = sexo;
        }
        else if (sexo == 'I') {
            this.sexo = sexo;
        }
        else{
            this.sexo = ' ';
        }
        
    }

   
    //Metodos  
    
    public void insertarPersona(){
        clsHelper clsH = new clsHelper();
        this.nombre = clsH.recibeString("Digite el nombre");
    
    }
    
}
