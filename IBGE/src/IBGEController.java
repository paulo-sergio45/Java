package IBGE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IBGEController {

    public static List<Municipio> leArquivo(String path, String name) {
        Scanner sc = null;
        List<Municipio> municipios = new ArrayList<Municipio>();
        // teste do arquivo ...
        File f = new File(path + name);
        System.out.println("Existe? " + (f.exists() ? f.getPath() : "arquivo n�o encontrado"));
        // processar o arquivo
        String linha;

        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {  // tem pr�xima linha?
                linha = sc.nextLine(); // recupera a pr�xima linha
                //				System.out.println("nextLine ..."+linha);

                StringTokenizer st = new StringTokenizer(linha, "*");
                Municipio m = new Municipio();
                m.setSigla(st.nextToken());
                m.setCodEstado(st.nextToken());
                m.setCodMunicipio(st.nextToken());
                m.setNomeMunicipio(st.nextToken());
                m.setQtdeHabitantes(st.nextToken());

                municipios.add(m);

            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return municipios;
    }

    // imprime lista de munic�pios ...
    public static void imprime(List<Municipio> municipios) {
        // imprime lista de munic�pios ...
        System.out.printf("%5s%15s%15s%5s%-35s%20s", "SIGLA",
                "COD. ESTADO",
                "COD. MUNIC.",
                "     ",
                "NOME NUNIC.",
                "HABITANTES");
        for (Municipio m : municipios) {
            //			System.out.println(m);
            System.out.printf("\n%5s%15s%15s%5s%-35s%20s", m.getSigla(),
                    m.getCodEstado(),
                    m.getCodMunicipio(),
                    "     ",
                    m.getNomeMunicipio(),
                    m.getQtdeHabitantes());
        }
    }

    public static void ordena(List<Municipio> municipios) {
        Collections.sort(municipios, new MunicipioComparator());
    }

}
