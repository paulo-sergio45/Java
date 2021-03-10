package Pesquisa_Ordenacao;

///////////////algoritmo e para ficar errado pois precisa ser inserido em uma classe////////////
public class Shell_Sort {

    public void Shell_Sort() {
        int i, j, h;
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
}
