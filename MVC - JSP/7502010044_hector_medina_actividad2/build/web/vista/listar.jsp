
<%@page import="hectormedina.modelo.Mascotas"%>
<%@page import="hectormedina.modeloDAO.MascotassDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>MASCOTAS</h1>
            <a href="Controlador?accion=agregar">Agregar Nueva Mascota</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>nombre</th>
                        <th>genero</th>
                        <th>peso</th>
                        <th>tamano</th>
                        <th>color</th>
                        <th>raza</th>
                        <th>especie</th>
                        <th>fechanacimiento</th>
                        <th>propietario</th>
                        <th>domesticoosalvaje</th>
                        <th>tienvacuanas</th>
                        <th>veterinario</th>

                    </tr>
                </thead>

                <%
                    MascotassDAO dao = new MascotassDAO();
                    List<Mascotas> list = dao.listar();
                    Iterator<Mascotas> iter = list.iterator();
                    Mascotas m = null;
                    while (iter.hasNext()) {
                        m = iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%=m.getId()%></td>
                        <td><%=m.getNombre()%></td>
                        <td><%=m.getGenero()%></td>
                        <td><%=m.getPeso()%></td>
                        <td><%=m.getTamano()%></td>
                        <td><%=m.getColor()%></td>
                        <td><%=m.getRaza()%></td>
                        <td><%=m.getEspecie()%></td>
                        <td><%=m.getFechanacimiento()%></td>
                        <td><%=m.getPropietario()%></td>
                        <td><%=m.getDomesticoosalvaje()%></td>
                        <td><%=m.getTienvacunas()%></td>
                        <td><%=m.getVeterinario()%></td>
                        <td>
                            <a href="controlador?accion=editar&id=<%=m.getId()%>">Editar</a>
                            <a href="controlador?accion=eliminar&id=<%=m.getId()%>>ELIMINAR</a>
                        </td>

                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
