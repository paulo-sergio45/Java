package calc;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataLoader {
    // atributos

    private static String[] header;
    private static Object[][] data;
    private static String path = "F:\\Atividade_T2_dados_IBGE.txt";
    private static String separator = "*";

//	private static String path = Messages.getString("DataLoader.0")+Messages.getString("DataLoader.1"); //$NON-NLS-1$ //$NON-NLS-2$
//	private static String separator = Messages.getString("DataLoader.2"); //$NON-NLS-1$
    static {
        convertData(SuporteArquivo.leArquivo(path));
        convertHeader(SuporteArquivo.getHeader());
    }

    // getters & setters
    public static String[] getHeader() {
        return header;
    }

    private static void setHeader(String[] header) {
        DataLoader.header = header;
    }

    public static Object[][] getData() {
        return data;
    }

    public static void setData(Object[][] data) {
        DataLoader.data = data;
    }

    // helper methods
    public static void convertHeader(String header) {
        setHeader(new String[5]);
        StringTokenizer st = new StringTokenizer(header, separator);
        int i = 0;
        while (st.hasMoreTokens()) {
            DataLoader.header[i++] = st.nextToken();
        }
//		for (int k=0;k<this.columnNames.length;k++){
//			System.out.print(DataLoader.header[k]+" ");
//		}
    }

    public static void convertData(List<Municipio> municipios) {
        data = new String[municipios.size()][5];
        int i = 0;
        for (Municipio municipio : municipios) {
            data[i] = new String[5];
            data[i][0] = municipio.getSiglaUF();
            data[i][1] = municipio.getCodUF();
            data[i][2] = municipio.getCodMun();
            data[i][3] = municipio.getMunicipio();
            data[i][4] = municipio.getPopulacao();
            i++;
        }
//		System.out.println("============================= data.lenght: "+data.length);
//		for (int k=0;k<data.length;k++){
//			for (int m=0;m<data[k].length;m++){
//				System.out.print(data[k][m]+" ");				
//			}
//			System.out.println("\n");
//		}
    }

    public static Object[][] voltaDatai(List<Municipio> municipios) {
        String[][] data = new String[municipios.size()][5];
        int i = 0;
        for (Municipio municipio : municipios) {
            data[i] = new String[5];
            data[i][0] = municipio.getSiglaUF();
            data[i][1] = municipio.getCodUF();
            data[i][2] = municipio.getCodMun();
            data[i][3] = municipio.getMunicipio();
            data[i][4] = municipio.getPopulacao();
            i++;
        }
        return data;
    }

    public static List<Municipio> dataToList(String[][] data) {
        List<Municipio> munis = new ArrayList<Municipio>();
        for (int k = 0; k < data.length; k++) {
            Municipio m = new Municipio(data[k][0], data[k][1], data[k][2], data[k][3], data[k][4]);
            munis.add(m);
        }
        return munis;
    }
}
