package com.elvilla.materialpersonas2;

/**
 * Created by android on 30/04/2018.
 */

public class Persona {
   private String nombre,cedula,apellido;
   private int sexo;

    public Persona(String nombre, String cedula, String apellido, int sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }


    public void guardar(){
        Datos.guardar(this);
    }
}
