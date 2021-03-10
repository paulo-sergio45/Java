package Pesquisa_Ordenacao;

public class Merge_Sort {
///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////

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
}
