package Empresa_Herança_Mutipla;

public class Contratado2 extends Horista2 {

    Double vigencia;

    public Contratado2(String nome, String cpf, double comissao, Double vigencia) {
        super(nome, cpf, comissao);
        this.vigencia = vigencia;
    }

    @Override
    public void admit() {
        System.out.println("Adimite " + getClass().getSimpleName() + ": " + getNome());
    }

    @Override
    public void demit() {
        System.out.println("Demite " + getClass().getSimpleName() + ": " + getNome());
    }

    @Override
    public void calculaComissao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getVigencia() {
        return vigencia;
    }

    public void setVigencia(double vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.vigencia + " ";
    }

}
