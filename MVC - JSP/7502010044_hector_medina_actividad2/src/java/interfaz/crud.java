package interfaz;

import hectormedina.modelo.Mascotas;
import java.util.List;

public interface crud {

    public List listar();
    public Mascotas list(int id);
    public boolean agregar(Mascotas mascotas);
    public boolean editar(Mascotas mascotas);
    public boolean eliminar(int id);

}
