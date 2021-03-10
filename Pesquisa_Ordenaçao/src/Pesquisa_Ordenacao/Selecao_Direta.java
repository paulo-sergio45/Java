package Pesquisa_Ordenacao;

///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////
public void SelecaoDireta() {
        int i, j, minimo;
        Item temp;
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
