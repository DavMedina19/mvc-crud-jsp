
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String rutaRaiz = request.getServletContext().getContextPath();
    String msj = request.getParameter("msj");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div>
            <h1>Agregar Mascota</h1> 
            <form action="<%= rutaRaiz%>/hectormedina.actividad2" method="post">
                id:<br>
                Nombres: <br>
                <input type="text" name="txtNombre"><br>
                <input type="text" name="txtGenero"><br>
                <input type="text" name="txtPeso"><br>
                <input type="text" name="txtTamano"><br>
                <input type="text" name="txtColor"><br>
                <input type="text" name="txtRaza"><br>
                <input type="text" name="txtEspecie"><br>
                <input type="text" name="txtFechanacimiento"><br>
                <input type="text" name="txtPropietario"><br>
                <input type="text" name="txtDomesticoosalvaje"><br>
                <input type="text" name="txtTienvacunas"><br>
                <input type="text" name="txtVeterinario"><br>
                <input type="submit" name="accion" value="Agregar"><br>

            </form>
            <span style="color: red"><%= msj%></span>
        </div>
    </body>
</html>
