package Pesquisa_Ordenacao;

///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////
public class Bubble_Sort {

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
}
