package OficinaMecanica;

public class Equipamento {

    private String descricaoEquipamentos;
    private Double custoLocacao;
    private Double duracaoLocacao;

    public Equipamento(String descricaoEquipamentos, Double custoLocacao, Double duracaoLocacao) {
        this.descricaoEquipamentos = descricaoEquipamentos;
        this.custoLocacao = custoLocacao;
        this.duracaoLocacao = duracaoLocacao;
    }

    public String getDescricaoEquipamentos() {
        return descricaoEquipamentos;
    }

    public void setDescricaoEquipamentos(String descricaoEquipamentos) {
        this.descricaoEquipamentos = descricaoEquipamentos;
    }

    public Double getCustoLocacao() {
        return custoLocacao;
    }

    public void setCustoLocacao(Double custoLocacao) {
        this.custoLocacao = custoLocacao;
    }

    public Double getDuracaoLocacao() {
        return duracaoLocacao;
    }

    public void setDuracaoLocacao(Double duracaoLocacao) {
        this.duracaoLocacao = duracaoLocacao;
    }

}
