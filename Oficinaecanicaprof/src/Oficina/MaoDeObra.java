package Oficina;

public class MaoDeObra {

    private String nome;
    private String cpf;

    // construtores
    public MaoDeObra() {
    }

    public MaoDeObra(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters & setters
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

}
