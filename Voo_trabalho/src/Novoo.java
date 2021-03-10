package voo;

public class Novoo {

    private Itemvoo info; // a declaração do tipo Item está no capitulo 1
    private Novoo prox;

    public Novoo(Itemvoo elem) {
        this.info = elem;
        this.prox = null;
        // a variável elem contém os dados que serão armazenados
        // esta linha é opcional, pois o prox é automaticamente 
        //definido como null
    }

    public Novoo(Itemvoo info, Novoo prox) {
        this.info = info;
        this.prox = prox;
    }

    public Itemvoo getInfo() {
        return this.info;
    }

    public void setInfo(Itemvoo elem) {
        this.info = elem;
    }

    public Novoo getProx() {
        return this.prox;
    }

    public void setProx(Novoo novoNo) {
        this.prox = novoNo;
    }

}
