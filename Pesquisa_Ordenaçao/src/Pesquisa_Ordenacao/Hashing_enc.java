package Pesquisa_Ordenacao;

public class Hashing_enc {

    private Item[] vetor; // refer�ncia a um vetor de itens
    private int nElem; // n�mero de itens de dados

    private No prim;

    // construtor(es) e m�todos desta classe
    public Hashing_enc(int quant) {
        this.vetor = new Item[quant];
        this.prim = null;
        this.nElem = quant;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No pesqSeq(int chave) {
        No atual = this.prim;
        while ((atual != null) && (atual.getInfo().getData() != chave)) {
            atual = atual.getProx();
        }
        return atual;
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

    public int pesq_HashingEnc(int chave) {

        return Hashing(chave, this.nElem);
    }

    public boolean inserir(Item elemento) {
        No novoNo = new No(elemento);
        if (this.vetor[Hashing(elemento.getData(), this.nElem)] == null) {
            this.vetor[Hashing(elemento.getData(), this.nElem)] = elemento;
            return true;
        } else if (this.vetor[Hashing(elemento.getData(), this.nElem)]
                .getLista() == null) {
            this.vetor[Hashing(elemento.getData(), this.nElem)]
                    .setLista(novoNo);
            return true;
        } else {
            No atual = this.vetor[Hashing(elemento.getData(), this.nElem)]
                    .getLista();
            while ((atual.getProx() != null)) {
                atual = atual.getProx();
            }
            atual.setProx(novoNo);
            return true;
        }

    }

    public int Hashing(int chave, int M) {

        return chave % M;
    }

}
