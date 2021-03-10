package Empresa_Herança_Mutipla;

public class Consultor extends Horista2 {

    String especialidade;
    int horasTrabalhadas;

    public Consultor(String nome, String cpf, String especialidade, int horasTrabalhadas, Double comissao) {
        super(nome, cpf, comissao);
        this.especialidade = especialidade;
        this.horasTrabalhadas = horasTrabalhadas;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.especialidade + " " + this.horasTrabalhadas;
    }

}
