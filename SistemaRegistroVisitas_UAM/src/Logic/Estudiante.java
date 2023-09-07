package Logic;

//Abstracción
public class Estudiante extends Usuario {

    public Estudiante(String id, String primerNombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        super(id, primerNombre, primerApellido, segundoApellido, numeroTelefono);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}


