package Pesquisa_Ordenacao;

import java.io.IOException;

public class HeapSort_PesquisaBinaria {

    private static String arq;

    public static void main(String[] args) throws IOException {
        // datas da pesquisa
        int[] vet3 = ManipuladorArquivo
                .leitorData(
                        "E:/WorkSpace_eclipse/Pesquisa_Ordena�ao/src/Pesquisa_Ordena�ao/data.txt",
                        400);

        String con = "";
        String con1 = "";
        String lr = "";
        for (int i = 0; i < 5; i++) {
            // //preemchendo vetor
            Dados_Int vet = new Dados_Int(
                    ManipuladorArquivo
                            .leitor("E:/WorkSpace_eclipse/Pesquisa_Ordena�ao/src/Pesquisa_Ordena�ao/promissoria500alea.txt",
                                    500));

            vet.Heap_Sort();

            for (int k = 0; k < vet3.length; k++) {
                int p = vet.pesq_Binaria(vet3[k]);

                if (p == -1) {

                    con += vet3[k] + "=" + "N�O H� PROMISS�RIA NA DATA MENCIONADA";
                    System.out.println("");

                } else if (vet.getVetor()[p].isPagamento() == true) {
                    lr = vet.getVetor()[p].getNome() + ";"
                            + String.valueOf(vet.getVetor()[p].getValor())
                            + ";" + vet.getVetor()[p].getDiaMesAno();
                    con += vet3[k] + "=" + lr;
                    System.out.println("");
                } else {
                    lr = vet.getVetor()[p].getNome() + ";"
                            + String.valueOf(vet.getVetor()[p].getValor())
                            + ";" + vet.getVetor()[p].getDiaMesAno();
                    con1 += vet3[k] + "=" + lr;
                    System.out.println("");
                }

            }
        }
    }

}
