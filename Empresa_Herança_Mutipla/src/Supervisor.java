package Empresa_Herança_Mutipla;

public class Supervisor extends Funcionario2 {

    String areaAtuacaco;

    public Supervisor(String nome, String cpf, String matricula, double salario, String areaatuacaco) {
        super(nome, cpf, matricula, salario);
        this.areaAtuacaco = areaatuacaco;
    }

    @Override
    public void admit() {
        super.admit();
    }

    @Override
    public void demit() {
        super.demit();
    }

    @Override
    public void calculaSalario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getAreaatuacaco() {
        return areaAtuacaco;
    }

    public void setAreaAtuacaco(String areaAtuacaco) {
        this.areaAtuacaco = areaAtuacaco;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.areaAtuacaco + " ";
    }

}
