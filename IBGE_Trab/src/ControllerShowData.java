package calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

    public static List<Municipio> ordenaNome(List<Municipio> municipios) {
        Collections.sort(municipios, new Municipioordenadonome());
        return null;

    }

    public static List<Municipio> ordenaUf(List<Municipio> municipios) {
        Collections.sort(municipios, new MunicipioOrdenadoUf());

        return municipios;
    }

    public static int quntosMunicipioporestado(List<Municipio> municipios, String estado) {
        int n = 0;

        for (Municipio municipio : municipios) {

            if (municipio.getSiglaUF().contains(estado)) {
                n++;
            }

        }

        return n;
    }

}
