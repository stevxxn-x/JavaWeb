/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import datos.BaseDatosSimulada;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Estudiante;

@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");

        if ("Guardar".equals(accion)) {
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String curso = request.getParameter("curso");

            Estudiante nuevo = new Estudiante(nombre, correo, curso);
            BaseDatosSimulada.guardar(nuevo);
            
            // Redirigir de nuevo al formulario para limpiar campos
            response.sendRedirect("index.jsp");

        } else if ("Mostrar registros".equals(accion)) {
            request.setAttribute("lista", BaseDatosSimulada.obtenerTodos());
            request.getRequestDispatcher("listar.jsp").forward(request, response);
        }
    }
}