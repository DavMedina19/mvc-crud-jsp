package hectormedina.controlador;

import hectormedina.modelo.Mascotas;
import hectormedina.modeloDAO.MascotassDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controlador extends HttpServlet {

    String listar = "vista/listar.jsp";
    String agregar = "vista/agregar.jsp";
    String editar = "vista/editar.jsp";
    Mascotas m = new Mascotas();
    MascotassDAO dao = new MascotassDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("agregar")) {
            acceso = agregar;

        } else if (action.equalsIgnoreCase("Agregar")) {
            String nombre = request.getParameter("txtNombre");
            String genero = request.getParameter("txtGenero");
            String peso = request.getParameter("txtPeso");
            String tamano = request.getParameter("txtTamano");
            String color = request.getParameter("txtColor");
            String raza = request.getParameter("txtRaza");
            String especie = request.getParameter("txtEspecie");
            String fechanacimiento = request.getParameter("txtFechanacimiento");
            String propietario = request.getParameter("txtPropietario");
            String domesticoosalvaje = request.getParameter("txtDomesticoosalvaje");
            String tienvacunas = request.getParameter("txtTienvacunas");
            String veterinario = request.getParameter("txtVeterinario");
            m.setNombre(nombre);
            m.setGenero(genero);
            m.setPeso(peso);
            m.setTamano(tamano);
            m.setColor(color);
            m.setRaza(raza);
            m.setEspecie(especie);
            m.setFechanacimiento(fechanacimiento);
            m.setPropietario(propietario);
            m.setDomesticoosalvaje(domesticoosalvaje);
            m.setTienvacunas(tienvacunas);
            m.setVeterinario(veterinario);
            dao.agregar(m);
            acceso = listar;

        } else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("idmas", request.getParameter("id"));
            acceso = editar;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            int id = Integer.parseInt(request.getParameter("txtid"));
            String nombre = request.getParameter("txtNombre");
            String genero = request.getParameter("txtGenero");
            String peso = request.getParameter("txtPeso");
            String tamano = request.getParameter("txtTamano");
            String color = request.getParameter("txtColor");
            String raza = request.getParameter("txtRaza");
            String especie = request.getParameter("txtEspecie");
            String fechanacimiento = request.getParameter("txtFechanacimiento");
            String propietario = request.getParameter("txtPropietario");
            String domesticoosalvaje = request.getParameter("txtDomesticoosalvaje");
            String tienvacunas = request.getParameter("txtTienvacunas");
            String veterinario = request.getParameter("txtVeterinario");
            m.setId(id);
            m.setNombre(nombre);
            m.setGenero(genero);
            m.setPeso(peso);
            m.setTamano(tamano);
            m.setColor(color);
            m.setRaza(raza);
            m.setEspecie(especie);
            m.setFechanacimiento(fechanacimiento);
            m.setPropietario(propietario);
            m.setDomesticoosalvaje(domesticoosalvaje);
            m.setTienvacunas(tienvacunas);
            m.setVeterinario(veterinario);
            dao.editar(m);
            acceso = listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            m.setId(id);
            dao.eliminar(id);
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
