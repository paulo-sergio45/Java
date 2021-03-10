package voo;

public class Itemvoo {

    private int chave;

    private String nome;
    private String cpf;
    private String telefone;
    private String destino;

    public Itemvoo(int chave, String nome, String cpf, String telefone, String destino) {
        this.chave = chave;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.destino = destino;
    }

    public Itemvoo(int ch) {
        this.chave = ch;
    }

    public void setChave(int ch) {
        this.chave = ch;
    }

    public int getChave() {
        return this.chave;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
