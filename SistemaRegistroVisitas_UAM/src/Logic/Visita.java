package Logic;

import java.util.Date;

public class Visita {
    private String id;
    private Estudiante estudiante;
    private PersonalClinica personalClinica;
    private Medicamento medicamento;
    private Date date;
    private String malestar;

    public Visita(String id, Estudiante estudiante, PersonalClinica personalClinica, Medicamento medicamento,
                  Date date, String malestar) {
        this.id = id;
        this.estudiante = estudiante;
        this.personalClinica = personalClinica;
        this.medicamento = medicamento;
        this.date = date;
        this.malestar = malestar;
    }
   public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public PersonalClinica getPersonalClinica() {
        return personalClinica;
    }

    public void setPersonalClinica(PersonalClinica personalClinica) {
        this.personalClinica = personalClinica;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMalestar() {
        return malestar;
    }

    public void setMalestar(String malestar) {
        this.malestar = malestar;
    }

    public Visita() { //Constructor vacío
    }

    @Override
    public String toString() {
        return "Visita{" +
                "id='" + id + '\'' +
                ", estudiante=" + estudiante +
                ", personalClinica=" + personalClinica +
                ", medicamento=" + medicamento +
                ", date=" + date +
                ", malestar='" + malestar + '\'' +
                '}';
    }
}
