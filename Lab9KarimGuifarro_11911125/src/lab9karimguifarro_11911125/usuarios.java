/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9karimguifarro_11911125;

/**
 *
 * @author karim
 */
public class usuarios {
    String usuario,nombre,contraseña,tipo;
    int edad;

    public usuarios() {
    }

    public usuarios(String usuario,String contraseña, String nombre, int edad,String tipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "usuarios{" + "usuario=" + usuario + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", tipo=" + tipo + ", edad=" + edad + '}';
    }
    
    
}
