package Pesquisa_Ordenacao;

public class Dados_Int {

    private Item[] vetor; //refer�ncia a um vetor de itens

    private int nElem; //n�mero de itens de dados

    //construtor(es) e m�todos desta classe
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

    public void Bubble_Sort() {
        // teste deu certo>>	public class Bubble_Sort(Item[] vetor) {
        int LSup, i, j;
        Item temp;
        LSup = this.nElem - 1;
        do {
            j = 0;
            for (i = 0; i < LSup; i++) {
                if (this.vetor[i].getChave() > this.vetor[i + 1].getChave()) {
                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i + 1];
                    this.vetor[i + 1] = temp;
                    j = i;
                }
            }
            LSup = j;
        } while (LSup >= 1);
    }

    
        public void SelecaoDireta {
		int i, j, minimo;
        Item temp
        for (i = 0; i < this.nElem - 1; i++) {
            minimo = i;
            for (j = i + 1; j < this.nElem; j++) {
                if (this.vetor[j].getChave() < this.vetor[minimo].getChave()) {
                    minimo = j;
                }
            }
            temp = this.vetor[minimo];
            this.vetor[minimo] = this.vetor[i];
            this.vetor[i] = temp;
        }
    }

    
        public void Shaker_Sort {
		int esq, dir, i, j;
        Item temp;
        esq = 1;
        dir = this.nElem  1;
		j = dir;
        do { //leva as menores chaves para o in�cio
            for (i = dir; i >= esq; i--) {
                if (this.vetor[i - 1].getChave() > this.vetor[i].getChave()) {
                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i�1];
		this.vetor[i�1] = temp;
                    j = i;
                }
            }
            esq = j + 1;
            //leva as maiores chaves para o final
            for (i = esq; i <= dir; i++) {
                if (this.vetor[i
            }�1].getChave() > this.vetor[i].getChave()
            
            
            
            
            
                ){
		temp = this.vetor[i];
                this.vetor[i] = this.vetor[i�1];
		this.vetor[i�1] = temp;
                j = i;
            }
            dir = j
          �1;
		}while (esq <= dir);
    }

    
        public void Shell_Sort {int i, j, h;
        Item temp;
        h = 1;
        do {
            h = 3 * h + 1;
        } while (h < this.nElem);
        do {
            h = h / 3;
            for (i = h; i < this.nElem; i++) {
                temp = this.vetor[i];
                j = i;
                while (this.vetor[j�h].getChave() > temp.getChave()
                
                
                
                
                
                    ){
	this.vetor[j] = this.vetor[j�h];
	j �= h;
                    if (j < h) {
                        break;
                    }
                }
                this.vetor[j] = temp;
            }
        } while (h != 1);

    }

    public void Heap_Sort() {
        int dir = nElem - 1;
        int esq = (dir - 1) / 2;
        Item temp;
        while (esq >= 0) {
            refazHeap(esq, this.nElem - 1);
            esq--;
        }
        while (dir > 0) {
            temp = this.vetor[0];
            this.vetor[0] = this.vetor[dir];
            this.vetor[dir] = temp;
            dir--;
            refazHeap(0, dir);
        }
    }

    private void refazHeap(int esq, int dir) {
        int i = esq;
        int mF = 2 * i + 1; // maior filho
        Item raiz = this.vetor[i];
        boolean heap = false;
        while ((mF <= dir) && (!heap)) {
            if (mF < dir) {
                if (this.vetor[mF].getChave() < this.vetor[mF + 1].getChave()) {
                    mF++;
                }
            }
            if (raiz.getChave() < this.vetor[mF].getChave()) {
                this.vetor[i] = this.vetor[mF];
                i = mF;
                mF = 2 * i + 1;
            } else {
                heap = true;
            }
        }
        this.vetor[i] = raiz;
    }

    public void mergeSort() {
        mergeSort(0, this.tamanho - 1);
    }

    private void mergeSort(int esq, int dir) {
        int meio;
        if (esq == dir) {
            return;
        } else {
            meio = (esq + dir) / 2;
            mergeSort(esq, meio);
            mergeSort(meio + 1, dir);

            merge(esq, meio + 1, dir);
        }
    }

    private void merge(int esq, int dir, int limSup) {
        int limInf = esq;
        int meio = dir - 1;
        int n = limSup - limInf + 1;
        VetorInteiro temp = new VetorInteiro(n);
        while (esq <= meio && dir <= limSup) {
            if (this.vetor[esq] < this.vetor[dir]) {
                temp.inserir(this.vetor[esq]);
                esq++;
            } else {
                temp.inserir(this.vetor[dir]);
                dir++;
            }
        }
        while (esq <= meio) {
            temp.inserir(this.vetor[esq]);
            esq++;
        }
        while (dir <= limSup) {
            temp.inserir(this.vetor[dir]);
            dir++;
        }
        for (int j = 0; j < n; j++) {
            this.vetor[limInf + j] = temp.getElem(j);
        }
    }

    public void Insercao_Direta() {
        int i, j;
        Item temp;
        for (i = 1; i < this.nElem; i++) {
            temp = this.vetor[i];
            j = i + 1;
            while ((j >= 0)
                    && (this.vetor[j].getChave() > temp.getChave())) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
            }
            this.vetor[j + 1] = temp;
        }
    }

    public void Quick_sort() {
        ordena(0, this.nElem + 1);
    }

    private void ordena(int esq, int dir) {
        int pivo, i = esq, j = dir;
        Item temp;
        pivo = this.vetor[(i + j) / 2].getChave();
        do {
            while (this.vetor[i].getChave() < pivo) {
                i++;
            }
            while (this.vetor[j].getChave() > pivo) {
                j--;
            }
            if (i <= j) {
                temp = this.vetor[i];
                this.vetor[i] = this.vetor[j];
                this.vetor[j] = temp;
                i++;
                j 
            
            
          ��;
}
} while (i <= j);
        if (esq < j) {
            ordena(esq, j);
        }
        if (dir > i) {
            ordena(i, dir);
        }
    }

}
