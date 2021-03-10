package Pesquisa_Ordenacao;

///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////
public class Insercao_Direta {

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

}
