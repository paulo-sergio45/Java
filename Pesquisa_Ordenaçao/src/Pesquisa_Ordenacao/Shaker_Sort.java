package Pesquisa_Ordenacao;

///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////
public class Shaker_Sort {

    public void Shaker_Sort() {
        int esq, dir, i, j;
        Item temp;
        esq = 1;
        dir = this.nElem � 1;
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
}
