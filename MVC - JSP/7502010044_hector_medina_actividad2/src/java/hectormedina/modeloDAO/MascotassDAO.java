package hectormedina.modeloDAO;

import configuracionbd.conexionn;
import hectormedina.modelo.Mascotas;
import interfaz.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MascotassDAO implements crud {

    conexionn cn = new conexionn();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        ArrayList<Mascotas> list = new ArrayList<>();
        String sql = "select *from mascotas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mascotas m = new Mascotas();
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setGenero(rs.getString("genero"));
                m.setPeso(rs.getString("peso"));
                m.setTamano(rs.getString("tamano"));
                m.setColor(rs.getString("color"));
                m.setRaza(rs.getString("raza"));
                m.setEspecie(rs.getString("especie"));
                m.setFechanacimiento(rs.getString("fechanacimiento"));
                m.setPropietario(rs.getString("propietario"));
                m.setDomesticoosalvaje(rs.getString("domesticoosalvaje"));
                m.setTienvacunas(rs.getString("tienvacunas"));
                m.setVeterinario(rs.getString("veterinario"));
                list.add(m);

            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Mascotas list(int id) {
        String sql = "select *from mascotas where Id=" + id;
        Mascotas m = new Mascotas();

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setGenero(rs.getString("genero"));
                m.setPeso(rs.getString("peso"));
                m.setTamano(rs.getString("tamano"));
                m.setColor(rs.getString("color"));
                m.setRaza(rs.getString("raza"));
                m.setEspecie(rs.getString("especie"));
                m.setFechanacimiento(rs.getString("fechanacimiento"));
                m.setPropietario(rs.getString("propietario"));
                m.setDomesticoosalvaje(rs.getString("domesticoosalvaje"));
                m.setTienvacunas(rs.getString("tienvacunas"));
                m.setVeterinario(rs.getString("veterinario"));

            }

        } catch (SQLException e) {
        }
        return m;

    }

    //METODO AGREGAR
    @Override
    public boolean agregar(Mascotas m) {
        String sql = "insert into mascotas(nombre, genero, peso, tamano, color, raza, especie, fechanacimiento, propietario, domesticoosalvaje, tienvacunas, veterinario) values('" + m.getNombre() + "','" + m.getGenero() + "','" + m.getPeso() + "','" + m.getTamano() + "','" + m.getColor() + "','" + m.getRaza() + "','" + m.getEspecie() + "','" + m.getFechanacimiento() + "','" + m.getPropietario() + "','" + m.getDomesticoosalvaje() + "','" + m.getTienvacunas() + "','" + m.getVeterinario() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean editar(Mascotas m) {
        String sql = "insert into mascotas(nombre, genero, peso, tamano, color, raza, especie, fechanacimiento, propietario, domesticoosalvaje, tienvacunas, veterinario) values('" + m.getNombre() + "','" + m.getGenero() + "','" + m.getPeso() + "','" + m.getTamano() + "','" + m.getColor() + "','" + m.getRaza() + "','" + m.getEspecie() + "','" + m.getFechanacimiento() + "','" + m.getPropietario() + "','" + m.getDomesticoosalvaje() + "','" + m.getTienvacunas() + "','" + m.getVeterinario() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from mascotas where Id" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

}
