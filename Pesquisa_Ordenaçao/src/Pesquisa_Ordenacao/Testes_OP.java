package Pesquisa_Ordenacao;

import java.io.IOException;

public class Testes_OP {

    public static void main(String[] args) throws IOException {

        // datas da pesquisa
        int[] vet3 = ManipuladorArquivo
                .leitorData(
                        "E:/WorkSpace_eclipse/Pesquisa_Ordena�ao/src/Pesquisa_Ordena�ao/data.txt",
                        400);

        // //preemchendo vetor
        Dados_Int vet = new Dados_Int(
                ManipuladorArquivo
                        .leitor("E:/WorkSpace_eclipse/Pesquisa_Ordena�ao/src/Pesquisa_Ordena�ao/promissoria500alea.txt",
                                500));

        // //abb inserindo elementos
        Arvore arv = new Arvore();

        for (int i = 0; i < vet.getnElem(); i++) {
            arv.insere(vet.getVetor()[i]);
        }

        // //avl inserindo elementos
        Arvore_AVL arvavl = new Arvore_AVL();

        for (int i = 0; i < vet.getnElem(); i++) {

            arvavl.insereRaiz(vet.getVetor()[i]);

        }
        // heap_Sort teste

        vet.toString();
        vet.Shell_Sort();
        System.out.println("//////////////////////////////// ");
        vet.toString();

        // quick_Sort teste
        vet.toString();
        vet.;
        System.out.println("//////////////////////////////// ");
        vet.toString();

    }

}
