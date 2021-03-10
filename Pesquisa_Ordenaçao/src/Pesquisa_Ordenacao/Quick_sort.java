package Pesquisa_Ordenacao;

public class Quick_sort {
///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////

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
