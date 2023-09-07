package Logic;

public class Medicamento {
    private String nombre;
    private String nombreGenerico;
    private int dosisRecomendada;
    private UsoMedicamento uso;
    private ViaMedicamento via;
    private FormatoMedicamento formato;
    private int cantidad;

    //Constructores

    public Medicamento(String nombre, String nombreGenerico, int dosisRecomendada,UsoMedicamento uso, ViaMedicamento via, FormatoMedicamento formato, int cantidad) {
        this.nombre = nombre;
        this.nombreGenerico = nombreGenerico;
        this.dosisRecomendada = dosisRecomendada;
        this.uso = uso;
        this.via = via;
        this.formato = formato;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", nombreGenerico='" + nombreGenerico + '\'' +
                ", dosisRecomendada=" + dosisRecomendada +
                ", uso=" + uso +
                ", via=" + via +
                ", formato=" + formato +
                ", cantidad=" + cantidad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public int getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(int dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }
    public UsoMedicamento getUso() {
        return uso;
    }

    public void setUso(UsoMedicamento uso) {
        this.uso = uso;
    }

    public ViaMedicamento getVia() {
        return via;
    }

    public void setVia(ViaMedicamento via) {
        this.via = via;
    }

    public FormatoMedicamento getFormato() {
        return formato;
    }

    public void setFormato(FormatoMedicamento formato) {
        this.formato = formato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
