package Oficina;

import java.util.ArrayList;

public abstract class Servico {

    private String descricao;
    private Double custo;
    private Double duracao;

    public Servico() {
    }

    public Servico(String descricao, Double custo, Double duracao) {
        super();
        this.descricao = descricao;
        this.custo = custo;
        this.duracao = duracao;
    }

    // m�todos abstratos
    public abstract Double calculaOrcamentoMaoDeObra();

    public abstract void alocaEquipamentos(ArrayList<Equipamento> equipamentos);

    // getter & setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

}
