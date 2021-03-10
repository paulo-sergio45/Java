package OficinaMecanica;

import java.util.ArrayList;

public abstract class Servico extends Equipamento {

    private String descricao;
    private Double cusoTotal;
    private Double duracao;

    public Servico(String descricaoEquipamentos, Double custoLocacao, Double duracaoLocacao) {
        super(descricaoEquipamentos, custoLocacao, duracaoLocacao);
    }

    public Double calculaOrcamentoMaoDeObra() {
        return null;
    }

    public void alocaEquipamentos(ArrayList<Equipamento> equipamentos) {
    }
}
