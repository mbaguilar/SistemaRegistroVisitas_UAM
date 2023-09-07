package Logic;

public class PersonalClinica extends Usuario{


    protected String puesto;
    //Qué pasaría si el personal de la clínica tiene más de un número de teléfono?
    private String claveAcceso;

    public PersonalClinica(String puesto, String claveAcceso, String id, String primerNombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        super(id, primerNombre, primerApellido, segundoApellido, numeroTelefono);
        this.puesto = puesto;
        this.claveAcceso = claveAcceso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "PersonalClinica{" +
                "puesto='" + puesto + '\'' +
                ", claveAcceso='" + claveAcceso + '\'' +
                ", id='" + id + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
