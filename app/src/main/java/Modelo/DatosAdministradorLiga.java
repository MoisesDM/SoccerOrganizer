package Modelo;

public class DatosAdministradorLiga {
private String Codigo;
private String NombreLiga;
private String Categoria;
private String Zona;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombreLiga() {
        return NombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        NombreLiga = nombreLiga;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        Zona = zona;
    }

    public DatosAdministradorLiga() {
    }

    public DatosAdministradorLiga(String codigo, String nombreLiga, String categoria, String zona) {
        Codigo = codigo;
        NombreLiga = nombreLiga;
        Categoria = categoria;
        Zona = zona;
    }
}
