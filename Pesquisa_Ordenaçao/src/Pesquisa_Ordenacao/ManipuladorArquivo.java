package Pesquisa_Ordenacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorArquivo {

    public static void escritor(String path, String cont) throws IOException {
        try {

            FileWriter arq = new FileWriter(path);
            BufferedWriter gra = new BufferedWriter(arq);
            gra.write(cont);

        } catch (IllegalArgumentException e) {
            e.notify();
        }
    }

    public static int[] leitorData(String path, int tamanho)
            throws FileNotFoundException, IOException {
        int[] vet = new int[tamanho];

        try {

            FileReader arq = new FileReader(path);
            BufferedReader lr = new BufferedReader(arq);
            String linha = "";

            for (int i = 0; lr.ready(); i++) {

                linha = lr.readLine();

                String[] s = linha.split("/");
                String s1 = s[2] + s[1] + s[0];
                vet[i] = Integer.valueOf(s1);

            }
            arq.close();

        } catch (FileNotFoundException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        } catch (Exception e) {
            e.notify();
        }

        return vet;
    }

    public static Item[] leitor(String path, int tamanho)
            throws FileNotFoundException, IOException {
        Item[] vet = new Item[tamanho];

        try {

            FileReader arq = new FileReader(path);
            BufferedReader lr = new BufferedReader(arq);
            String linha = "";

            for (int i = 0; lr.ready(); i++) {

                linha = lr.readLine();
                String[] s = linha.split(";");
                vet[i] = new Item(s[0], s[1], s[2], Double.valueOf(s[3]),
                        Boolean.valueOf(s[4]));

            }
            arq.close();
        } catch (FileNotFoundException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        } catch (Exception e) {
            e.notify();
        }

        return vet;
    }

}
