<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro de Estudiantes</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <div class="container">
        <h2>Inscripción al Curso Virtual</h2>
        <form action="RegistroServlet" method="POST">
            <input type="text" name="nombre" placeholder="Nombre completo" required>
            <input type="email" name="correo" placeholder="Correo electrónico" required>
            <select name="curso">
                <option value="Java Web">Java Web</option>
                <option value="Python Data Science">Python Data Science</option>
                <option value="Ciberseguridad">Ciberseguridad</option>
            </select>
            <br>
            <input type="submit" name="accion" value="Guardar">
            <input type="submit" name="accion" value="Mostrar registros" class="btn-secondary" formnovalidate>       
        </form>
    </div>
</body>
</html>