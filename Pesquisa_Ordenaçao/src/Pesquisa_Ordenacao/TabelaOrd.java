package Pesquisa_Ordenacao;

public class TabelaOrd {

    private Item[] vetor; // refer�ncia a um vetor de itens
    private int nElem; // n�mero de itens de dados

    public Item[] getVetor() {
        return vetor;
    }

    public void setVetor(Item[] vetor) {
        this.vetor = vetor;
    }

    public int getnElem() {
        return nElem;
    }

    public void setnElem(int nElem) {
        this.nElem = nElem;
    }

    public TabelaOrd(int tamanho) {
        this.vetor = new Item[tamanho];
        this.nElem = 0;
    }// outros m�todos da classe

    public int pesqBinaria(int chave) {
        int meio, esq, dir;
        esq = 0;
        dir = this.nElem - 1;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (chave == this.vetor[meio].getData()) {
                return meio;
            } else {
                if (chave < this.vetor[meio].getData()) {
                    dir = meio - 1;
                } else {
                    esq = meio + 1;
                }
            }
        }
        return -1;
    }

    public boolean inserir_Ord(Item elem) {
        if (this.nElem == this.vetor.length) {
            return false;
        } else {
            this.vetor[this.nElem++] = elem;
            insercao_Direta();// ordena�ao
        }
        return true;
    }

    public boolean remove(int chave) {
        int i, pos;
        if (this.nElem == 0) {
            return false;
        } else {
            pos = pesqBinaria(chave);
            if (pos >= 0) {
                for (i = pos + 1; i < this.nElem; i++) {
                    this.vetor[i - 1] = this.vetor[i];
                }
                this.nElem--;
                return true;
            } else {
                return false;
            }
        }
    }

    public void insercao_Direta() {
        int i, j;
        Item temp;

        for (i = 1; i < this.nElem; i++) {
            temp = this.vetor[i];
            j = i - 1;
            while ((j >= 0) && (this.vetor[j].getData() > temp.getData())) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
            }
            this.vetor[j + 1] = temp;
        }
    }

    public Item getElemVetor(int meio) {
        Item a = this.vetor[meio];
        return a;
    }

}
