/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejerciciosjava;

public class Pelicula {
    private int Codigo;
    private String Titulo;
    private String Genero;
    private int Valoracion;
    private int Restricciones; // Si la pelicula es para mayores de 18 años o no (Rango de edad)

    //Getters
    public int getCodigo() {
        return Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public int getRestricciones() {
        return Restricciones;
    }
    
    //Setters
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setValoracion(int Valoracion) {
        this.Valoracion = Valoracion;
    }

    public void setRestricciones(int Restricciones) {
        this.Restricciones = Restricciones;
    }
    
    //Constructor 
     public Pelicula(int Codigo, String Titulo, String Genero, int Valoracion, int Restricciones) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Valoracion = Valoracion;
        this.Restricciones = Restricciones;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Codigo=" + Codigo + ", Titulo=" + Titulo + ", Genero=" + Genero + ", Valoracion=" + Valoracion + ", Restricciones=" + Restricciones + '}';
    }
     
     
}
