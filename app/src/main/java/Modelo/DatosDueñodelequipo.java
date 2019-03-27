package Modelo;

public class DatosDueñodelequipo {

    private String nombreEquipo;
    private String nombreDT;
    private String apellido_paterno;
    private String Apellido_materno;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreDT() {
        return nombreDT;
    }

    public void setNombreDT(String nombreDT) {
        this.nombreDT = nombreDT;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return Apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        Apellido_materno = apellido_materno;
    }


    public DatosDueñodelequipo(String nombreEquipo, String nombreDT, String apellido_paterno, String apellido_materno) {
        this.nombreEquipo = nombreEquipo;
        this.nombreDT = nombreDT;
        this.apellido_paterno = apellido_paterno;
        Apellido_materno = apellido_materno;
    }


    public DatosDueñodelequipo() {
    }


}
