package IBGE;

import java.util.List;

public class IBGE {

    public static void main(String[] args) {
        List<Municipio> municipios = IBGEController.leArquivo("D:\\TiagoW\\Projetos\\",
                "Atividade_T2_dados_IBGE.txt");
        IBGEController.imprime(municipios);
        IBGEController.ordena(municipios);
        System.out.println("\n============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("============================================");
        IBGEController.imprime(municipios);

    }
}
