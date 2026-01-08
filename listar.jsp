<%@page import="modelo.Estudiante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Registrados</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <div class="container">
        <h2>Estudiantes Inscritos</h2>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Correo</th>
                <th>Curso</th>
            </tr>
            <%
                List<Estudiante> lista = (List<Estudiante>) request.getAttribute("lista");
                if (lista != null) {
                    for (Estudiante e : lista) {
            %>
            <tr>
                <td><%= e.getNombre() %></td>
                <td><%= e.getCorreo() %></td>
                <td><%= e.getCurso() %></td>
            </tr>
            <% 
                    }
                }
            %>
        </table>
        <br>
        <a href="index.jsp">Volver al registro</a>
    </div>
</body>
</html>