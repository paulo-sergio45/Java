package Pesquisa_Ordenacao;

public class No {

    private Item info;
    private No prox;

    public No(Item _info) {
        this.info = _info; //prox � automaticamente definido como null
    }

    public No getProx() {
        return this.prox;
    }

    public void setProx(No novo) {
        this.prox = novo;
    }

    public Item getInfo() {
        return info;
    }

    public void setInfo(Item info) {
        this.info = info;
    }
}
