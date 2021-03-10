package Empresa_Herança_Mutipla;

import java.util.ArrayList;
import java.util.List;

public class Sistema2 {

    public static void main(String[] args) {

        RecursoHumano2 rh0 = new Gerente2("paulo", "111.112.102-08", "102100", 100000D, 205698D);
        RecursoHumano2 rh1 = new Gerente2("Oochi", "168.752.609-07", "102152", 102100D, 204560D);
        RecursoHumano2 rh2 = new Gerente2("paulo", "649.252.014-06", "108526", 100650D, 205000D);
        RecursoHumano2 rh3 = new Gerente2("paulo", "451.698.852-05", "102657", 104856D, 200745D);
        RecursoHumano2 rh4 = new Gerente2("paulo", "001.960.548-04", "102874", 100354D, 200100D);
        RecursoHumano2 rh5 = new Gerente2("paulo", "954.165.001-03", "102325", 100456D, 298745D);
        RecursoHumano2 rh6 = new Gerente2("paulo", "256.658.512-02", "102965", 100954D, 212365D);
        RecursoHumano2 rh7 = new Gerente2();
        List<RecursoHumano2> recursosHumanos = new ArrayList<RecursoHumano2>();

        recursosHumanos.add(rh0);
        recursosHumanos.add(rh1);
        recursosHumanos.add(rh2);
        recursosHumanos.add(rh3);
        recursosHumanos.add(rh4);
        recursosHumanos.add(rh5);
        recursosHumanos.add(rh6);

        Equipe2 q = new Equipe2(recursosHumanos);

        q.exibeEquipe();
        q.admiteEquipe2();
        System.out.println();
        q.dmiteEquipe2();

    }
}
