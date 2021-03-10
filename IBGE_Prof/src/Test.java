package calc;

import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//		List<Municipio> municipios = ControllerShowData.leArquivo("G://",
//				"Atividade_T2_dados_IBGE.txt");
//		ControllerShowData.imprime(municipios);
//		ControllerShowData.ordena(municipios);
//		System.out.println("\n============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		System.out.println("============================================");
//		ControllerShowData.imprime(municipios);

        List<Municipio> munis = SuporteArquivo.leArquivo("F://Atividade_T2_dados_IBGE.txt");
        // simular que o arquivo foi carregado na JTable
        String[][] data = (String[][]) DataLoader.getData();
        // Converte matriz em lista ...
        munis = DataLoader.dataToList(data);
        // imprime lista
        System.out.println("===================== ANTES ========================");
        SuporteArquivo.imprimeArq(munis);
        System.out.println("===================== DEPOIS ========================");
        List<Municipio> relt = ControllerShowData.municenoest50a150(munis);
        SuporteArquivo.imprimeArq(relt);
        DataLoader.setData(data);
    }
}
