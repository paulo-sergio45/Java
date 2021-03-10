package pilha__fila;

public class FilaCircularChar {

    private ItemChar[] info;
    private int frente;
    private int tras;
    private int tamanho;

    public FilaCircularChar(char qte) {
        this.frente = 0;
        this.tras = 0;
        this.tamanho = 0;
        this.info = new ItemChar[qte];
    }

    public ItemChar getInfo() {
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

    public boolean enfileirar(ItemChar elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.tras] = elem;
            this.tras = (++this.tras % this.info.length);
            this.tamanho++;
            return true;
        }
    }

    public ItemChar desenfileirar() {
        ItemChar no;
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
            ItemChar elem;
            for (int i = 1; i <= tam; i++) {
                elem = this.desenfileirar();
                if (elem.getChave() >= 0) {
                    this.enfileirar(elem);
                }
            }

        }

    }
}
