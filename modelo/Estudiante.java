/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Estudiante {
    private String nombre;
    private String correo;
    private String curso;

    public Estudiante(String nombre, String correo, String curso) {
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getCurso() { return curso; }
}