package Pesquisa_Ordenacao;

public class Nodo {

    private Item info;
    private Nodo esq, dir;
    private byte fatorBalanceamento;

    Nodo(Item i) {// construtor
        this.info = i;
        this.fatorBalanceamento = 0;
    }

    public Nodo getDir() {
        return this.dir;
    }

    public void setDir(Nodo dir) {
        this.dir = dir;
    }

    public Nodo getEsq() {
        return this.esq;
    }

    public void setEsq(Nodo esq) {
        this.esq = esq;
    }

    public byte getFatorBalanceamento() {
        return this.fatorBalanceamento;

    }

    public void setFatorBalanceamento(byte fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }

    public Item getInfo() {
        return this.info;
    }
}
