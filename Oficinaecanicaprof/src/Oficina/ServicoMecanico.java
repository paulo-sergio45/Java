package Oficina;

import java.util.ArrayList;

public class ServicoMecanico extends Servico {

    // construtores
    public ServicoMecanico() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ServicoMecanico(String descricao, Double custo, Double duracao) {
        super(descricao, custo, duracao);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Double calculaOrcamentoMaoDeObra() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void alocaEquipamentos(ArrayList<Equipamento> equipamentos) {
        // TODO Auto-generated method stub

    }

    public Double calculaCustoTotalServicoMecanico() {
        return null;
    }
}
