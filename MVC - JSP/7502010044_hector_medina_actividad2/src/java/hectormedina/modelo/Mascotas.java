
package hectormedina.modelo;

public class Mascotas {

    int id;
    String nombre;
    String genero;
    String peso;
    String tamano;
    String color;
    String raza;
    String especie;
    String fechanacimiento;
    String propietario;
    String domesticoosalvaje;
    String tienvacunas;
    String veterinario;

    public Mascotas() {
    }

    public Mascotas(int id, String nombre, String genero, String peso, String tamano, String color, String raza, String especie, String fechanacimiento, String propietario, String domesticoosalvaje, String tienvacunas, String veterinario) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.tamano = tamano;
        this.color = color;
        this.raza = raza;
        this.especie = especie;
        this.fechanacimiento = fechanacimiento;
        this.propietario = propietario;
        this.domesticoosalvaje = domesticoosalvaje;
        this.tienvacunas = tienvacunas;
        this.veterinario = veterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDomesticoosalvaje() {
        return domesticoosalvaje;
    }

    public void setDomesticoosalvaje(String domesticoosalvaje) {
        this.domesticoosalvaje = domesticoosalvaje;
    }

    public String getTienvacunas() {
        return tienvacunas;
    }

    public void setTienvacunas(String tienvacunas) {
        this.tienvacunas = tienvacunas;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

}
