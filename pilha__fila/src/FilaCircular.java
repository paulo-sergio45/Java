package pilha__fila;

public class FilaCircular {

    private Item[] info;
    private int frente;
    private int tras;
    private int tamanho;

    public FilaCircular(int qte) {
        this.frente = 0;
        this.tras = 0;
        this.tamanho = 0;
        this.info = new Item[qte];
    }

    public Item getInfo() {
        return this.info[this.frente];
    }

    public int getFrente() {
        return this.frente;
    }

    public int getTras() {
        return this.tras;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean eVazia() {
        return (this.tamanho == 0);
    }

    public boolean eCheia() {
        return (this.tamanho == this.info.length);
    }

    public boolean enfileirar(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.tras] = elem;
            this.tras = (++this.tras % this.info.length);
            this.tamanho++;
            return true;
        }
    }

    public Item desenfileirar() {
        Item no;
        if (this.eVazia()) {
            return null;
        } else {
            no = this.info[this.frente];
            this.frente = (++this.frente % this.info.length);
            this.tamanho--;
            return no;
        }
    }

    public String toString() { //imprimir o conteúdo da fila
        String msg = "";
        int aux = this.frente;
        for (int i = 1; i <= this.tamanho; i++) {
            msg += this.info[aux].getChave() + " ";
            aux = (++aux % this.info.length);
        }
        return msg;
    }

    ////exercicio 01 lista filacircular 05
    public void retirarNegativos() {
        if (!this.eVazia()) {
            int tam = this.tamanho;
            Item elem;
            for (int i = 1; i <= tam; i++) {
                elem = this.desenfileirar();
                if (elem.getChave() >= 0) {
                    this.enfileirar(elem);
                }
            }

        }

    }

    public boolean enfileira2(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.tras] = elem;
            this.tras = (++this.tras % this.info.length);
            this.tamanho++;
            return true;
        }

    }

    public Item desenfilira2() {
        Item no;
        if (this.eVazia()) {
            return null;
        } else {
            no = this.info[this.frente];
            this.frente = (++this.frente % this.info.length);
            this.tamanho--;
            return no;
        }

    }

    public boolean empilhar3(Item elem) {
        if (eCheia()) {
            return false;
        } else {
            this.info[this.tras] = elem;
            this.tras = (++this.tras % this.info.length);
            this.tamanho++;
            return true;
        }

    }

    public Item desefileirar3() {
        Item no;
        if (this.eVazia()) {
            return null;
        } else {

            no = this.info[this.frente];
            this.frente = (++this.frente % this.info.length);
            this.tamanho--;
            return no;

        }

    }

}
