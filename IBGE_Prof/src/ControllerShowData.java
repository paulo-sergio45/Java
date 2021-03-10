package calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerShowData {

    public static List<Municipio> leArquivo(String path, String name) {
        Scanner sc = null;
        List<Municipio> municipios = new ArrayList<Municipio>();
        // teste do arquivo ...
        FileReader f = null;
        try {
            f = new FileReader(path + name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControllerShowData.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
        System.out.println("Existe? " + ("arquivo nao encontrado"));
        // processar o arquivo
        String linha;

        sc = new Scanner(f);
        while (sc.hasNextLine()) { // tem proxima linha?
            linha = sc.nextLine(); // recupera a proxima linha
            // System.out.println("nextLine ..."+linha);

            StringTokenizer st = new StringTokenizer(linha, "*");
            Municipio m = new Municipio();
            m.setSiglaUF(st.nextToken());
            m.setCodUF(st.nextToken());
            m.setMunicipio(st.nextToken());
            m.setMunicipio(st.nextToken());
            m.setPopulacao(st.nextToken());

            municipios.add(m);

        }
        return municipios;
    }

    // imprime lista de municipios ...
    public static void imprime(List<Municipio> municipios) {
        // imprime lista de municipios ...
        System.out.printf("%5s%15s%15s%5s%-35s%20s", "SIGLA", "COD. ESTADO",
                "COD. MUNIC.", "     ", "NOME NUNIC.", "HABITANTES");
        for (Municipio m : municipios) {
            // System.out.println(m);
            System.out.printf("\n%5s%15s%15s%5s%-35s%20s", m.getSiglaUF(),
                    m.getCodUF(), m.getCodMun(), "     ", m.getMunicipio(),
                    m.getPopulacao());
        }
    }

    public static void ordenaNome(List<Municipio> municipios) {
        Collections.sort(municipios, new Municipioordenadonome());

    }

    public static void ordenaUf(List<Municipio> municipios) {

        Collections.sort(municipios, new MunicipioOrdenadoUf());

    }

    public static List<String> quntosMunicipiorepet(List<Municipio> municipios) {
        int n = 0;
        String muni;
        List<String> m = new ArrayList<>();
        for (int i = 0; i < municipios.size(); i++) {
            muni = municipios.get(i).getMunicipio();
            n = 0;
            for (int j = 0; j < municipios.size(); j++) {

                if (municipios.get(j).getMunicipio().contains(muni)) {
                    n++;

                    m.add(municipios.get(j).getMunicipio() + " -> repet :" + String.valueOf(n));

                }

            }
        }

        return m;
    }

    public static List<Municipio> municenoest50a150(List<Municipio> municipios) {
        int n = 0;
        String[] vet = new String[4];
        String[] vet2 = new String[4];

        List<Municipio> m = new ArrayList<>();
        vet[0] = "GO";
        vet2[0] = "Goias";
        vet[1] = "MT";
        vet2[1] = "Mato Grosso";
        vet[2] = "MS";
        vet2[2] = "Mato Grosso do Sul";
        vet[3] = "DF";
        vet2[3] = "Distrito Federal";

        for (int i = 0; i < vet.length; i++) {

            for (int j = 0; j < municipios.size(); j++) {
                if (municipios.get(j).getSiglaUF().equals(vet[i]) && municipios.get(j).getPopulacao().length() >= 5 && municipios.get(j).getPopulacao().length() <= 7) {
                    if (Double.valueOf(municipios.get(j).getPopulacao()) >= 50.000 && Double.valueOf(municipios.get(j).getPopulacao()) <= 150.000) {

                        m.add(municipios.get(j));
                    }

                }

            }

        }

        return m;
    }

    public static List<Municipio> municentoesmenos100(List<Municipio> municipios) {
        int n = 0;
        String[] vet = new String[4];
        String[] vet2 = new String[4];

        List<Municipio> m = new ArrayList<>();
        vet[0] = "GO";
        vet2[0] = "Goias";
        vet[1] = "MT";
        vet2[1] = "Mato Grosso";
        vet[2] = "MS";
        vet2[2] = "Mato Grosso do Sul";
        vet[3] = "DF";
        vet2[3] = "Distrito Federal";

        for (int i = 0; i < vet.length; i++) {

            for (int j = 0; j < municipios.size(); j++) {
                if (municipios.get(j).getSiglaUF().equals(vet[i]) && municipios.get(j).getPopulacao().length() <= 6) {

                    m.add(municipios.get(j));
                }

            }

        }

        return m;
    }

}
