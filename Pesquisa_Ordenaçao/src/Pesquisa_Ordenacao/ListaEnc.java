package Pesquisa_Ordenacao;

public class ListaEnc {

    private No prim;

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public ListaEnc() {
        this.prim = null;
    }

    public No pesqSeq(int chave) {
        No atual = this.prim;
        while ((atual != null) && (atual.getInfo().getData() != chave)) {
            atual = atual.getProx();
        }
        return atual;
    }

    public void inserirPrimeiro(Item elem) {
        No novo = new No(elem);
        novo.setProx(this.prim);
        this.prim = novo;

    }

    public boolean remove(int chave) {
        No atual = this.prim;
        No ant = this.prim;
        if (atual == null) {
            return false;
        }
        while (atual.getInfo().getData() != chave) {
            if (atual.getProx() == null) {
                return false;
            } else {
                ant = atual;
                atual = atual.getProx();
            }
        }
        if (atual == this.prim) {
            this.prim = this.prim.getProx();
        } else {
            ant.setProx(atual.getProx());
        }
        return true;
    }

}
