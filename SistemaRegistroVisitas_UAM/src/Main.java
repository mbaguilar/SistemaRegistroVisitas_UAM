import Logic.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //AtributosPersonal
        PersonalClinica pc1  = new PersonalClinica("Administrativo", "UAM2023#","0012009701234E"
        ,"Julia", "Cortez","Alemán","76567422");

        //Atributos estudiante
        Estudiante est1 = new Estudiante("22098711","Maria"
        ,"Aguilar","Acosta","77654578");

        //Atributos Medicamento
        Medicamento med1 = new Medicamento("Aspirina", "ácido acetilsalicílico", 500,
                UsoMedicamento.ANALGESICO, ViaMedicamento.ORAL, FormatoMedicamento.SOLIDO, 1);

        Visita visita = new Visita("1",est1,pc1,med1,new Date(),"Dolor de cabeza");
        System.out.println(visita);
    }
}


