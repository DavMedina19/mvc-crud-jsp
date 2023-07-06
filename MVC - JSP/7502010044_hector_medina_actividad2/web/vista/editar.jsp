
<%@page import="hectormedina.modelo.Mascotas"%>
<%@page import="hectormedina.modeloDAO.MascotassDAO"%>
<%@page import="java.lang.String"%>
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
            <%
                MascotassDAO dao = new MascotassDAO();
                int id = Integer.parseInt((String) request.getAttribute("idmas"));
                Mascotas m = (Mascotas) dao.list(id);
            %>
            <h1>Modificar Mascota</h1> 
            <form action="<%= rutaRaiz%>/hectormedina.actividad2" method="post">
                id:<br>
                Nombres: <br>
                <input type="text" name="txtNombre" value="<%= m.getNombre()%>"><br>
                <input type="text" name="txtGenero" value="<%= m.getGenero()%>"><br>
                <input type="text" name="txtPeso" value="<%= m.getPeso()%>"><br>
                <input type="text" name="txtTamano" value="<%= m.getTamano()%>"><br>
                <input type="text" name="txtColor" value="<%= m.getColor()%>"><br>
                <input type="text" name="txtRaza" value="<%= m.getRaza()%>"><br>
                <input type="text" name="txtEspecie" value="<%= m.getEspecie()%>"><br>
                <input type="text" name="txtFechanacimiento" value="<%= m.getFechanacimiento()%>"><br>
                <input type="text" name="txtPropietario" value="<%= m.getPropietario()%>"><br>
                <input type="text" name="txtDomesticoosalvaje" value="<%= m.getDomesticoosalvaje()%>"><br>
                <input type="text" name="txtTienvacunas" value="<%= m.getTienvacunas()%>"><br>
                <input type="text" name="txtVeterinario" value="<%= m.getVeterinario()%>"><br>

                <input type="hidden" name="txtid" value="<%= m.getId()%>">
                <input type="submit" name="accion" value="actualizar"><br>
                <span style="color: red"><%= msj%></span>
            </form>
        </div>
    </body>
</html>
