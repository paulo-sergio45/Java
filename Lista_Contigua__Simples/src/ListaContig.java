package estrutura.de.dados;

public class ListaContig {

    private int fim;

    private Item[] info; // o tipo Item está declarado no capítulo 1

    public ListaContig(int qte) {

        this.fim = 0;

        this.info = new Item[qte];

    }

    public Item getInfo(int i) {

        return this.info[i];

    }

    public void setInfo(int i, Item elem) {

        this.info[i] = elem;

    }

    public int getFim() {

        return this.fim;

    }

    public void setFim(int _fim) {

        this.fim = _fim;

    }

    public boolean eVazia() {

        return (this.fim == 0);

    }

    public boolean eCheia() {
        return (this.fim == this.info.length);

    }

    public boolean inserirUltimo(Item elem) {
        if (this.eCheia()) {
            return false;

        } else {
            this.info[this.fim] = elem;
            this.fim++;

            return true;
        }
    }

    public int pesquisarNo(int chave) {
        int i = 0;

        while ((i < this.fim) && (this.info[i].getChave() != chave)) {
            i++;

        }
        return i;

    }

    public boolean removerNo(int chave) {
        int i = 0;

        while ((i < this.fim) && (this.info[i].getChave() != chave)) {
            i++;
        }

        if (i == this.fim) {
            return false;

        } else {
            for (int j = i; j < this.fim - 1; j++) {
                this.info[j] = this.info[j + 1];

            }
            this.fim--;
            return true;

        }

    }

    public String toString() {
        String msg = "";

        for (int i = 0; i < this.fim; i++) {
            msg += this.info[i].getChave() + "\n";
        }

        return msg;
    }

    //exercicio prof pediu
    public boolean remover(int chave) {
        int i = this.pesquisarNo(chave);
        if (i == this.fim) {
            return false;

        } else {
            for (int j = i; j < this.fim - 1; j++) {
                this.info[j] = this.info[j + 1];

            }
            this.fim--;
            return true;

        }

    }

    //faça um metodo para remover todos os valores
    //pares da lista
}
