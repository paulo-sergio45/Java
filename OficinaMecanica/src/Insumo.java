package OficinaMecanica;

public class Insumo {

    private String descricaoInsumo;
    private double custoUnitario;
    private double quantidadeInsumo;

    public Insumo(String descricaoInsumo, double custoUnitario, double quantidadeInsumo) {
        this.descricaoInsumo = descricaoInsumo;
        this.custoUnitario = custoUnitario;
        this.quantidadeInsumo = quantidadeInsumo;
    }

    public String getDescricaoInsumo() {
        return descricaoInsumo;
    }

    public void setDescricaoInsumo(String descricaoInsumo) {
        this.descricaoInsumo = descricaoInsumo;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public double getQuantidadeInsumo() {
        return quantidadeInsumo;
    }

    public void setQuantidadeInsumo(double quantidadeInsumo) {
        this.quantidadeInsumo = quantidadeInsumo;
    }

}
