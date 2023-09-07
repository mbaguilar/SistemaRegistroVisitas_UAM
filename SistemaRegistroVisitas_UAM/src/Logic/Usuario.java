package Logic;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    protected String id;
    protected String primerNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String numeroTelefono;

    protected List<String> usuarios = new ArrayList<>();
    public Usuario(String id, String primerNombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
    /*  public void addUsuario(String nombreUsuario) {
        usuarios.add(nombreUsuario);*/

}
