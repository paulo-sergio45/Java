package Pesquisa_Ordenacao

�ao;

import java.io.IOException;

public class Teste {

    public static void main(String[] args) throws IOException {

        // Arvore arv=new Arvore();
        // Arvore_AVL arvAVL=new Arvore_AVL();
        // Dados_Int vet =new
        // Dados_Int(ManipuladorArquivo.leitor("E:/WorkSpace_eclipse/Pesquisa_Ordena�ao/src/Pesquisa_Ordena�ao/promissoria500alea.txt",500))
        // ;
        Hashing_enc vetenc = new Hashing_enc(13);

        Item vet0 = new Item("12/12/2014", "Cinthia Caliari", "9766376468",
                350.00, true);
        Item vet10 = new Item("12/12/2014", "Cinthia Caliari", "9766376468",
                350.00, true);
        Item vet11 = new Item("12/12/2014", "Cinthia Caliari", "9766376468",
                350.00, true);
        Item vet12 = new Item("12/12/2014", "Cinthia Caliari", "9766376468",
                350.00, true);
        Item vet1 = new Item("05/09/1992", "Jo�o da Silva", "9766376468",
                50.00, true);
        Item vet2 = new Item("12/02/2013", "Ana Rezende", "9766376468",
                1050.00, true);
        Item vet3 = new Item("30/08/1912", "Cinthia Caliari", "9766376468",
                3000.00, true);
        Item vet4 = new Item("31/04/1889", "Cinthia Caliari", "9766376468",
                500.00, true);
        Item vet5 = new Item("01/11/2000", "Cinthia Caliari", "9766376468",
                250.00, true);
        Item vet6 = new Item("11/06/2024", "Cinthia Caliari", "9766376468",
                100.00, true);
        Item vet7 = new Item("22/11/1999", "Cinthia Caliari", "9766376468",
                900.00, true);
        Item vet8 = new Item("10/12/2018", "Cinthia Caliari", "9766376468",
                10.00, true);
        Item vet9 = new Item("09/07/2010", "Cinthia Caliari", "9766376468",
                69.00, true);

        Item[] vet = {vet0, vet1, vet2, vet3, vet4, vet5, vet6, vet7, vet8,
            vet9, vet10, vet11, vet12};
        // arv.insere(vet0);arv.insere(vet1);arv.insere(vet2);arv.insere(vet3);
        // arv.insere(vet4);arv.insere(vet5);arv.insere(vet6);arv.insere(vet7);
        // arv.insere(vet8);arv.insere(vet9);
        // System.out.println( vet.getnElem());
        // vet.inserir(vet0);vet.inserir(vet1);vet.inserir(vet2);vet.inserir(vet3);
        // vet.inserir(vet4);vet.inserir(vet5);vet.inserir(vet6);vet.inserir(vet7);
        // vet.inserir(vet8);vet.inserir(vet9);

        // bubble Sort teste
        // vet.toString();
        // vet.bubble_Sort();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        // insercao_Direta teste
        // vet.toString();
        // vet.insercao_Direta();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        // heap_Sort teste
        // vet.toString();
        // vet.heap_Sort();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        // quick_Sort teste
        // vet.toString();
        // vet.quick_Sort();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        // selecao_Direta teste
        // vet.toString();
        // vet.selecao_Direta();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        //
        // shaker_Sort teste
        // vet.toString();
        // vet.shaker_Sort();
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        // shell_Sort teste
        // vet.toString();
        // vet.shell_Sort(0, 1, 2);
        // System.out.println("//////////////////////////////// ");
        // vet.toString();
        for (int i = 0; i < vet.length; i++) {
            vetenc.inserir(vet[i]);
        }

    }

}
