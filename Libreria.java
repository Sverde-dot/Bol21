/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class Libreria {
    private String Libro;
    private String Autor;
    private float precio;
    private int Unidades;
    Scanner sc;
    
    
    public Libreria() {
    }
    public Libreria(String Libro, String Autor, float precio, int Unidades) {
        this.Libro = Libro;
        this.Autor = Autor;
        this.precio = precio;
        this.Unidades = Unidades;
    }

    public void setLibro(String Libro) {
        this.Libro = Libro;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public void darNombre(String Libro){
        sc = new Scanner(System.in);
        System.out.println("El libro "+sc);
    }
    public void darAutor(String Autor){
        sc = new Scanner(System.in);
        System.out.println("El autor "+sc);
    }
    public void darPrecio(float precio){
        sc = new Scanner(System.in);
        System.out.println("El precio "+sc);
    }
    public void darUnidades(float unidades){
        sc = new Scanner(System.in);
        System.out.println("Tenemos  "+sc+" Unidades");
    }
    
    public void amosar(){

    }
    
    @Override
    public String toString() {
        return "Libreria{" + "Libro=" + Libro + ", Autor=" + Autor + ", precio=" + precio + ", Unidades=" + Unidades + '}';
    }
    
    
    
    
}
