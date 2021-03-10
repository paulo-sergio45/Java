package calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuporteArquivo {

    private static String header = "Sigla*Cod. UF.*Cod. Mun.*Municipio*Populacao";

//        private static List<Municipio> municipios = new ArrayList<Municipio>();
    public static List<Municipio> leArquivo(String arq) {
        // // define nome do arquivo
        // String arq = "D:\\Tiago\\Faesa\\AVA\\_02-CC-Linguagem de "+
        // "Programa II-Pl-Da-AVA\\Atividade_T2_dados_IBGE.txt";
        // criar um objeto "arquivo"
        File f = new File(arq);
        // criar um objeto de varredura do arquivo
        Scanner sc = null;
        // criar uma lista para os municipios
        List<Municipio> municipios = new ArrayList<Municipio>();
        // teste arquivo
        System.out.println("Existe? " + f.exists() + "  \n"
                + f.getAbsolutePath());
        // ler arquivo
        try {
            sc = new Scanner(f);
            // enquanto houver linhas ...
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                // System.out.println("===>> "+linha);
                // dividir a linha pelo separador *
                StringTokenizer st = new StringTokenizer(linha, "*");
                // para cada campo do registro
                while (st.hasMoreElements()) {
                    // extrair o municipio
                    Municipio m = new Municipio(st.nextToken(), st.nextToken(),
                            st.nextToken(), st.nextToken(), st.nextToken());
                    // adicionar o municipio de lista
                    municipios.add(m);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return municipios;

    }

    public static void imprimeArq(List<Municipio> municipios) {
        System.out.printf("\n%-10s%-10s%10s%50s%10s", "Sigla", "C�d. UF.",
                "Cod. Mun.", "Municipio", "Popula��o");
        for (Municipio municipio : municipios) {
            System.out.printf("\n%-10s%-10s%10s%50s%10s",
                    municipio.getSiglaUF(), municipio.getCodUF(),
                    municipio.getCodMun(), municipio.getMunicipio(),
                    municipio.getPopulacao());
        }
    }

    public static String getHeader() {
        return header;
    }

    public static void GravaArquivo(List<Municipio> municipio) {
        try {
            FileWriter arq = new FileWriter("F:\\Atividade_T2_dados_IBGE.txt");
        } catch (IOException ex) {
            Logger.getLogger(SuporteArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public static List<Municipio> getMunicipios() {
//        return municipios;
//    }
//
//    public static void setMunicipios(List<Municipio> aMunicipios) {
//        municipios = aMunicipios;
//    }
}
