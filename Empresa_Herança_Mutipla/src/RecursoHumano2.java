package Empresa_Herança_Mutipla;

public abstract class RecursoHumano2 implements Contrato {

    String nome;
    String cpf;

    public RecursoHumano2() {
    }

    public RecursoHumano2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return " " + this.nome + " " + this.cpf + " ";

    }

}
