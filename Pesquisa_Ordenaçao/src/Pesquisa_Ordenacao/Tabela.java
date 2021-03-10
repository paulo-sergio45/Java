package Pesquisa_Ordenacao;

public class Tabela {

    private Item[] vetor; //refer�ncia a um vetor de itens
    private int nElem; //n�mero de itens de dados

    public Tabela(int tamanho) {
        this.vetor = new Item[tamanho];
        this.nElem = 0;
    }// outros m�todos da classe
}
