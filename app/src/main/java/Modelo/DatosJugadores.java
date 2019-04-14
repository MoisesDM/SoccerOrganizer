package Modelo;

public class DatosJugadores {
    private String codigoL;
    private String Equipo;
    private String nombrej;
    private String apellidoPaternoj;
    private String AperllidoMaternoj;
    private String posicion;
    private String numero_playera;
    private String localidad;
    private String Calle;

    public String getCodigoL() {
        return codigoL;
    }

    public void setCodigoL(String codigoL) {
        this.codigoL = codigoL;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public String getNombrej() {
        return nombrej;
    }

    public void setNombrej(String nombrej) {
        this.nombrej = nombrej;
    }

    public String getApellidoPaternoj() {
        return apellidoPaternoj;
    }

    public void setApellidoPaternoj(String apellidoPaternoj) {
        this.apellidoPaternoj = apellidoPaternoj;
    }

    public String getAperllidoMaternoj() {
        return AperllidoMaternoj;
    }

    public void setAperllidoMaternoj(String aperllidoMaternoj) {
        AperllidoMaternoj = aperllidoMaternoj;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNumero_playera() {
        return numero_playera;
    }

    public void setNumero_playera(String numero_playera) {
        this.numero_playera = numero_playera;
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



    public DatosJugadores(String codigoL, String equipo, String nombrej, String apellidoPaternoj, String aperllidoMaternoj, String posicion, String numero_playera, String localidad, String calle) {
        this.codigoL = codigoL;
        Equipo = equipo;
        this.nombrej = nombrej;
        this.apellidoPaternoj = apellidoPaternoj;
        AperllidoMaternoj = aperllidoMaternoj;
        this.posicion = posicion;
        this.numero_playera = numero_playera;
        this.localidad = localidad;
        Calle = calle;
    }

    public DatosJugadores() {
    }
}
