package Empresa_Herança_Mutipla;

import java.util.ArrayList;
import java.util.List;

public class Equipe2 {

    List<RecursoHumano2> equip;

    public Equipe2() {
        equip = new ArrayList<RecursoHumano2>();
    }

    public Equipe2(List<RecursoHumano2> trabalhadores) {
        this.equip = trabalhadores;
    }
//lista de trabalhadoes XD

    public void exibeEquipe() {
        for (RecursoHumano2 rH : this.equip) {
            System.out.println(rH);
        }
    }
//lista imprimi demite trabalhaores

    public void dmiteEquipe2() {
        for (RecursoHumano2 recursoHumano2 : equip) {
            recursoHumano2.demit();
        }
    }
//lista impimi admit trabalhadores    

    public void admiteEquipe2() {
        for (RecursoHumano2 recursoHumano2 : equip) {
            recursoHumano2.admit();
        }
    }
}
