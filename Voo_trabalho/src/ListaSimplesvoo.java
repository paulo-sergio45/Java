package voo;

public class ListaSimplesvoo {

    private Novoo prim;
    private Novoo ult;
    private int quantNos;

    //construtor da classe
    public ListaSimplesvoo() {
        this.prim = null;
        this.ult = null;
        this.quantNos = 0;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public Novoo getPrim() {
        return this.prim;
    }

    public Novoo getUlt() {
        return this.ult;
    }

    public void setQuantNos(int novoValor) {
        this.quantNos = novoValor;
    }

    public void setPrim(Novoo novoNo) {
        this.prim = novoNo;
    }

    public void setUlt(Novoo novoNo) {
        this.ult = novoNo;
    }

    public boolean eVazia() {
        return (this.prim == null);
    }

    public void inserirPrimeiro(Itemvoo elem) {

        Novoo novoNo = new Novoo(elem);
        if (this.eVazia()) {
            this.ult = novoNo;
        }
        novoNo.setProx(this.prim);
        this.prim = novoNo;
        this.quantNos++;
    }

    public void inserirUltimo(Itemvoo elem) {
        Novoo novoNo = new Novoo(elem);
        if (this.eVazia()) {
            this.prim = novoNo;
        } else {
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.quantNos++;
    }

    public Novoo pesquisarNo(int chave) {
        Novoo atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }
        return atual;
    }

    public boolean removerNo(int chave) {
        Novoo atual = this.prim;
        Novoo ant = null;
        if (eVazia()) {
            return false;
        } else {
            while ((atual != null) && (atual.getInfo().getChave() != chave)) {
                ant = atual;
                atual = atual.getProx();
            }
            if (atual == null) {
                return false;
            } else {
                if (atual == this.prim) {
                    if (this.prim == this.ult) {
                        this.ult = null;
                    }
                    this.prim = this.prim.getProx();
                } else {
                    if (atual == this.ult) {
                        this.ult = ant;
                    }
                    ant.setProx(atual.getProx());
                }
                this.quantNos--;
                return true;
            }
        }
    }
    //outra forma de escrever o método para remover determinado Nó

    public boolean removerNó(int x) {
        if (this.eVazia()) {
            return false;
        } else if (this.prim.getInfo().getChave() == x) {
            if (this.prim.getProx() == null) {//se for único nó da lista
                this.ult = null;
            }
            //remover o primeiro nó da lista
            this.prim = this.prim.getProx();
            this.quantNos--;
            return true;
        } else {
            Novoo atual = this.prim;
            while ((atual.getProx() != null)
                    && (atual.getProx().getInfo().getChave() != x)) {
                atual = atual.getProx();
            }
            if (atual.getProx() == null) {//não achou o valor na lista
                return false;
            } else {
                if (atual.getProx() == this.ult) {//se for o último nó
                    atual.setProx(null);
                    this.ult = atual;
                } else {	//remove o nó no meio da lista
                    atual.setProx(atual.getProx().getProx());
                }
                this.quantNos--;
                return true;
            }
        }
    }

    public void imprime() {

        Novoo atual = this.prim;
        while (atual != null) {

            System.out.println(atual.getInfo().getChave() + " " + atual.getInfo().getNome()
                    + " " + atual.getInfo().getCpf() + " " + atual.getInfo().getTelefone() + " "
                    + atual.getInfo().getDestino());

            atual = atual.getProx();
        }

    }

    public void removerPassageiroSelecionado(int valor) {
        Novoo atual = this.prim;
        if (this.eVazia()) {
            System.out.println("esta vazia");

        } else if (atual.getInfo().getChave() == valor) {
            atual.setProx(null);
            prim.setProx(null);
            ult.setProx(null);
            quantNos--;
        } else {
            while (atual.getProx() != null) {

                if (atual.getProx().getInfo().getChave() == valor) {
                    atual.setProx(atual.getProx().getProx());
                }
                atual = atual.getProx();
            }
        }
        if (atual == null) {
            ult.setProx(atual);
            quantNos--;

        }
        System.out.println("removido");

    }

    public void impimindoSelecionado(int valor) {
        Novoo atual = this.prim;
        if (this.eVazia()) {
            System.out.println("esta vazia");

        } else if (atual.getInfo().getChave() == valor) {
            System.out.println(atual.getInfo().getChave() + " " + atual.getInfo().getNome()
                    + " " + atual.getInfo().getCpf() + " " + atual.getInfo().getTelefone() + " "
                    + atual.getInfo().getDestino());
        } else {
            while (atual != null) {

                if (atual.getProx().getInfo().getChave() == valor) {
                    System.out.println(atual.getInfo().getChave() + " " + atual.getInfo().getNome()
                            + " " + atual.getInfo().getCpf() + " " + atual.getInfo().getTelefone() + " "
                            + atual.getInfo().getDestino());
                }
                atual = atual.getProx();
            }
        }

    }

    public Novoo TransferênciPassageiro(int valor) {

        Novoo atual = this.prim;
        Novoo aux = atual;
        if (this.eVazia()) {
            System.out.println("esta vazia");
            return aux;

        } else if (atual.getInfo().getChave() == valor) {
            aux = atual;

            return aux;
        } else {
            while (atual != null) {

                if (atual.getProx().getInfo().getChave() == valor) {
                    aux = atual;

                }
                atual = atual.getProx();
            }
        }

        if (atual == null) {
            aux = atual;

        }
        System.out.println("movido");
        return aux;

    }

    public Itemvoo alteraDestino(Itemvoo elem, int destino) {

        String R = null;
        if (destino == 1) {

            R = "Recife";

        } else if (destino == 2) {

            R = "Recife";

        } else if (destino == 3) {

            R = "Recife";
        }
        Itemvoo aux = new Itemvoo(elem.getChave(), elem.getNome(),
                elem.getCpf(), elem.getTelefone(), R);

        return aux;

    }

}
