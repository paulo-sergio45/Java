package Oficina;

import java.util.ArrayList;

public class Mecanico extends MaoDeObra implements ContratadoClt {

    public Mecanico() {
        super();
    }

    public Mecanico(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public Double calculaSalario(ArrayList<ServicoMecanico> servicosMecanicos) {
        // TODO Auto-generated method stub
        return null;
    }

}
