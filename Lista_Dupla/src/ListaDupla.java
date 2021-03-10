package estruturadupla;

//Classe da declaração da lista duplamente encadeada:
public class ListaDupla {

    private NoDupla prim;

    private NoDupla ult;

    private int quantNos;

    public ListaDupla() {

        this.prim = null;

        this.ult = null;

        this.quantNos = 0;

    }

    public int getQuantNos() {

        return this.quantNos;

    }

    public NoDupla getPrim() {

        return this.prim;

    }

    public NoDupla getUlt() {

        return this.ult;

    }

    public void setQuantNos(int valorNovo) {

        this.quantNos = valorNovo;

    }

    public void setPrim(NoDupla novoNo) {

        this.prim = novoNo;

    }

    public void setUlt(NoDupla novoNo) {

        this.ult = novoNo;

    }

    public boolean eVazia() {

        return (this.prim == null);

    }

    public void inserirPrimeiro(Item elem) {

        NoDupla novoNo = new NoDupla(elem);

        if (this.eVazia()) {
            this.ult = novoNo;
        } else {

            novoNo.setProx(this.prim);

            this.prim.setAnt(novoNo);

        }

        this.prim = novoNo;

        this.quantNos++;

    }

    public void inserirUltimo(Item elem) {

        NoDupla novoNo = new NoDupla(elem);

        if (this.eVazia()) {
            this.prim = novoNo;
        } else {

            novoNo.setAnt(this.ult);

            this.ult.setProx(novoNo);

        }

        this.ult = novoNo;

        this.quantNos++;

    }

    public NoDupla pesquisarNo(int chave) {

        NoDupla atual = this.prim;

        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }

        return atual;

    }

    public boolean removerNo(int chave) {

        NoDupla atual = this.prim;

        while ((atual != null) && (atual.getInfo().getChave() != chave)) {

            atual = atual.getProx();

        }

        if (atual == null) {
            return false;
        } else if (atual == this.prim) {

            this.prim = prim.getProx();

            if (this.prim == null) {
                this.ult = null;
            } else {
                this.prim.setAnt(null);
            }

        } else if (atual == this.ult) {

            this.ult = this.ult.getAnt();

            this.ult.setProx(null);

        } else {

            atual.getProx().setAnt(atual.getAnt());

            atual.getAnt().setProx(atual.getProx());

        }

        this.quantNos--;

        return true;

    }

    public String toString() {

        String msg = "";

        NoDupla atual = this.prim;

        while (atual != null) {

            msg += atual.getInfo().getChave() + "\n";

            atual = atual.getProx();

        }

        return msg;

    }

//    exercicio inserir antes do primeiro no
    public void inserirAntesdoPrimeiro(Item elem) {

        NoDupla novoNo = new NoDupla(elem);

        novoNo.setProx(this.prim);

        this.prim.setAnt(novoNo);

        this.prim = novoNo;
        this.quantNos++;

    }

    //inserir depois do ultimo
    public void inserirDepoisDoUltimo(Item elem) {

        NoDupla novoNo = new NoDupla(elem);
        if (this.eVazia()) {
            this.prim = novoNo;
        } else {

            this.ult.setProx(novoNo);
            novoNo.setAnt(this.ult);
            this.ult = novoNo;

            this.quantNos++;
        }

    }

    //inserir na k esima posicao
    public boolean inserirNaKEsimaPosicao(Item elem, int valor) {
        int i = 1;
        NoDupla atual = this.prim;
        NoDupla novoNo = new NoDupla(elem);
        if (this.eVazia() || valor > this.quantNos) {
            return false;
        }
        while (i != valor) {
            atual = atual.getProx();
        }
        if (valor == 1) {
            novoNo.setProx(this.prim);
            this.prim.setAnt(novoNo);
            this.prim = novoNo;
            this.quantNos++;
            return true;
        } else if (valor != 1) {
            novoNo.setProx(atual);
            novoNo.setAnt(atual.getAnt());
            atual.getAnt().setProx(novoNo);
            atual.setAnt(novoNo);
            this.quantNos++;
            return true;
        }

        return false;
    }

    //remover a k-ésima posição
    public boolean removerKesimo(int k) {
        if (this.eVazia() || k > this.quantNos) {
            return false;
        } else {
            if (k == 1) {
                if (this.prim == this.ult) {
                    this.prim = null;
                    this.ult = null;
                } else {
                    this.prim = this.prim.getProx();
                    this.prim.setAnt(null);
                }
            } else if (k == this.quantNos) {
                this.ult = this.ult.getAnt();
                this.ult.setProx(null);
            } else {
                NoDupla atual = this.prim;
                for (int i = 1; i <= k; i++) {
                    atual = atual.getProx();
                }
                atual.getAnt().setProx(atual.getProx());
                atual.getProx().setAnt(atual.getAnt());
            }
            this.quantNos--;
            return true;
        }
    }
    // exerciocio 6 a) apostila 3 lista dupla

    public ListaDupla concatenarDuaslistas(ListaDupla lista1) {
        ListaDupla listan = this;
        if (lista1.eVazia() && this.eVazia()) {
            return null;
        } else if (lista1.eVazia()) {
            listan = this;
        } else if (this.eVazia()) {
            listan = lista1;

        } else {

            while (lista1.getQuantNos() != 0) {
                NoDupla elem1 = lista1.getPrim();
                this.inserirUltimo(elem1.getInfo());
                lista1.removerKesimo(lista1.getPrim().getInfo().getChave());

            }

        }

        return listan;
    }

    // exerciocio 6 b) apostila 3 lista dupla
    public ListaDupla PartirAoMeio() {
        if (this.eVazia()) {
            return null;

        } else {
            double k = this.quantNos;
            k = k / 2;
            int k1 = (int) Math.round(k);

            while (this.quantNos >= k1) {

                this.removerKesimo(k1);
                k1++;
            }
            return this;
        }
    }

    public void esvasiarLista() {

        while (this.quantNos != 0) {

            this.removerNo(this.prim.getInfo().getChave());
        }
    }

    // exerciocio 7 apostila 3 lista dupla
    public int buscarMaior() {
        if (this.eVazia()) {
            return -1;
        } else {

            int numero = 0;
            NoDupla atual = this.prim;
            while (atual != null) {
                if (atual.getInfo().getChave() > numero) {
                    numero = atual.getInfo().getChave();

                }
                atual = atual.getProx();
            }
            return numero;
        }

    }

    // exerciocio 6 c apostila 3 lista dupla
    public ListaDupla inserirOrdenarMm() {
        if (this.eVazia()) {
            return null;
        }
        ListaDupla aux = new ListaDupla();

        while (this.quantNos != 0) {

            int maior = this.buscarMaior();

            Item i = new Item(maior);
            aux.inserirUltimo(i);
            this.removerKesimo(maior);

        }

        return aux;
    }

    public boolean inserirAposUltimo2(Item elem) {
        NoDupla novo = this.prim;
        if (this.eVazia()) {
            this.prim = novo;
            this.ult = novo;
            this.quantNos++;
            return true;
        } else {

            novo.setAnt(this.ult);
            this.ult.setProx(novo);
            this.ult = novo;
            this.quantNos++;
            return true;
        }

    }

    public boolean removerNo2(int item) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != item)) {
            atual = atual.getProx();
        }
        if (this.eVazia()) {
            return false;
        } else if (atual == this.ult) {
            this.ult = this.ult.getAnt();
            this.ult = null;
            this.quantNos--;
            return true;
        } else if (atual == this.prim) {
            this.prim = this.prim.getProx();
            this.prim = null;
            this.quantNos--;
            return true;
        } else {
            atual.getProx().setAnt(atual.getAnt());
            atual.getAnt().setProx(atual.getProx());
            this.quantNos--;
            return true;
        }

    }

    public NoDupla pesquisarNo2(int chave) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }

        return atual;
    }

    public void inserirAposUtimo3(Item elem) {
        NoDupla novo = new NoDupla(elem);
        if (this.eVazia()) {

        } else {
            novo.setAnt(this.ult);
            this.ult.setProx(novo);
            quantNos++;

        }
    }

    public boolean removerNo4(int chave) {
        NoDupla atual = this.prim;
        while (atual.getInfo().getChave() != chave) {
            atual = atual.getProx();
        }
        if (this.eVazia()) {
            return false;
        } else if (atual == this.prim) {
            this.prim = this.prim.getProx();
            this.prim.setAnt(null);
            return true;
        } else if (atual == this.ult) {
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
            return true;

        }
        return false;
    }

    public NoDupla pesquisar(int chave) {
        NoDupla atual = this.prim;
        while (atual.getInfo().getChave() == chave) {
            atual = atual.getProx();
        }
        return atual;

    }

}
