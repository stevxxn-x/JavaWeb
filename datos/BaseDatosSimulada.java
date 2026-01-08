/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;

public class BaseDatosSimulada {
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void guardar(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public static List<Estudiante> obtenerTodos() {
        return listaEstudiantes;
    }
}