package Oficina;

import java.util.ArrayList;

public class ServicoAcabamento extends Servico {

    // construtores
    public ServicoAcabamento() {
        super();
    }

    public ServicoAcabamento(String descricao, Double custo, Double duracao) {
        super(descricao, custo, duracao);
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

    public Double calculaCustoTotalServicoAcabamento() {
        return null;
    }

}
