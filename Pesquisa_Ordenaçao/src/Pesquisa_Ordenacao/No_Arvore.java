package Pesquisa_Ordenacao;

public class No_Arvore {

    private Item info;
    private No_Arvore dir, esq;

    public No_Arvore(Item informacao) {
        this.info = informacao;
    }

    public No_Arvore getDir() {
        return dir;
    }

    public void setDir(No_Arvore dir) {
        this.dir = dir;
    }

    public No_Arvore getEsq() {
        return esq;
    }

    public void setEsq(No_Arvore esq) {
        this.esq = esq;
    }

    public Item getInfo() {
        return info;
    }

    public void setInfo(Item novo) {
        this.info = novo;
    }
}
