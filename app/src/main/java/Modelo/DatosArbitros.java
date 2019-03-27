package Modelo;

public class DatosArbitros {
    private String nombre;
    private String id;
    private String apellidop;
    private String apellidom;
    private int edad;
    private String localidad;
    private String Calle;

    public DatosArbitros() {
    }

    public DatosArbitros(String nombre, String id, String apellidop, String apellidom, int edad, String localidad, String calle) {
        this.nombre = nombre;
        this.id = id;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.edad = edad;
        this.localidad = localidad;
        Calle = calle;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }
}
