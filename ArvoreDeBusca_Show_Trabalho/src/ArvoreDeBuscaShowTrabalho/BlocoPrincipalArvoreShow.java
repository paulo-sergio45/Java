package ArvoreDeBuscaShowTrabalho;



import java.util.Scanner;
import javax.swing.JOptionPane;

public class BlocoPrincipalArvoreShow {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArvoreShow arvore = new ArvoreShow();

        char opcao;
        ItemShow[] vetor = new ItemShow[arvore.getQuantNos()];

        // //////////////////////////////////////////////////   ///////////////////////////////////////////////////////    
        ItemShow i0 = new ItemShow(123, 01, "openbar", 60.0, "Hareor Dyozo Buomes", "085.090.420-00", true);
        ItemShow i1 = new ItemShow(985, 01, "openbar", 60.0, "Thomeoxe Nainedal ", "085.090.420-01", true);
        ItemShow i2 = new ItemShow(521, 01, "openbar", 60.0, "Puard Saocevilli Vupiarn", "085.090.420-02", true);
        ItemShow i3 = new ItemShow(654, 01, "openbar", 60.0, "Baztye Norbomoa Enik", "085.090.420-03", false);
        ItemShow i4 = new ItemShow(756, 02, "openbar", 60.0, "Bolxeba Diarn", "085.090.420-04", true);
        ItemShow i5 = new ItemShow(254, 02, "openbar", 60.0, "Vonmu Onsilon Darxoak", "085.090.420-05", true);
        ItemShow i6 = new ItemShow(754, 02, "openbar", 60.0, "Vonmu Onsilon Darxoak", "085.090.420-05", true);
        ItemShow i7 = new ItemShow(925, 02, "openbar", 60.0, "Vonmu Onsilon Darxoak", "085.090.420-05", true);
        ItemShow i8 = new ItemShow(295, 02, "openbar", 60.0, "Yurwe Wuvar ", "085.090.420-08", true);
        ItemShow i9 = new ItemShow(741, 01, "vip", 120.0, "Dwsili Caywyuoak", "085.090.420-09", true);
        ItemShow i10 = new ItemShow(021, 01, "vip", 120.0, "Bouruten Darpaodak", "085.090.420-10", true);
        ItemShow i11 = new ItemShow(110, 01, "vip", 120.0, "Vongrim Ergali ", "085.090.420-11", true);
        ItemShow i12 = new ItemShow(638, 01, "vip", 120.0, "Coydiain Gimnerim ", "085.090.420-12", false);
        ItemShow i13 = new ItemShow(596, 02, "vip", 120.0, "Anvyo DadalTeimoa ", "085.090.420-13", false);
        ItemShow i14 = new ItemShow(159, 02, "vip", 120.0, "Anvyo DadalTeimoa ", "085.090.420-13", true);
        ItemShow i15 = new ItemShow(962, 02, "vip", 120.0, "Thornae Werakara", "085.090.420-15", true);
        ItemShow i16 = new ItemShow(532, 02, "vip", 120.0, "Xeydd Xuhaodred ", "085.090.420-16", false);
        ItemShow i17 = new ItemShow(486, 01, "pista", 30.0, "Luola Norahu ", "085.090.420-17", true);
        ItemShow i18 = new ItemShow(356, 01, "pista", 30.0, "Barizeuili Kilteihi ", "085.090.420-18", false);
        ItemShow i19 = new ItemShow(348, 01, "pista", 30.0, "Xaxauja Lure Xukolydd", "085.090.420-19", true);
        ItemShow i20 = new ItemShow(852, 01, "pista", 30.0, "Toreis Tilaia", "085.090.429-20", false);
        ItemShow i21 = new ItemShow(398, 02, "pista", 30.0, "Durilese Soveastr ", "085.090.420-21", true);
        ItemShow i22 = new ItemShow(999, 02, "pista", 30.0, "Hareor Dyozo Buomes", "085.090.420-00", true);
        ItemShow i23 = new ItemShow(647, 02, "pista", 30.0, "Hareor Dyozo Buomes", "085.090.420-00", true);
        ItemShow i24 = new ItemShow(415, 02, "pista", 30.0, "paulo", "085.090.420-04", true);
        arvore.inserir(i0);
        arvore.inserir(i1);
        arvore.inserir(i2);
        arvore.inserir(i3);
        arvore.inserir(i4);
        arvore.inserir(i5);
        arvore.inserir(i6);
        arvore.inserir(i7);
        arvore.inserir(i8);
        arvore.inserir(i9);
        arvore.inserir(i10);
        arvore.inserir(i11);
        arvore.inserir(i12);
        arvore.inserir(i13);
        arvore.inserir(i14);
        arvore.inserir(i15);
        arvore.inserir(i16);
        arvore.inserir(i17);
        arvore.inserir(i18);
        arvore.inserir(i19);
        arvore.inserir(i20);
        arvore.inserir(i21);
        arvore.inserir(i22);
        arvore.inserir(i23);
        arvore.inserir(i24);
// //////////////////////////////////////////////////////////////////////////////////////////////////////////

        int numeroSerial;
        int lote;
        String area = "";
        Double valor = 0.0;
        String nome = "";
        String cpf = "";
        String oppaga = "";
        boolean pagamento = false;

        do {
            System.out.println("Escolha uma Opção:\n"
                    + "1. Inserir Nó na árvore\n"
                    + "2. Localizar Nó na árvore\n"
                    + "3. Excluir Nó da árvore\n"
                    + "4. Exibir árvore ordenada\n"
                    + "5. pesquisar quantas pessoas compraram mais de um ingreso\n"
                    + "6.  pesquisar quantidades de ingresso por CPF\n"
                    + "7. pesquisa Quantos pagentes\n"
                    + "8. Sair");
            opcao = scan.next().charAt(0);
            switch (opcao) {
                case '1':
                    System.out.println("Inserir um numeroSerial na árvore\n"
                            + "Digite um numeroSerial");
                    numeroSerial = scan.nextInt();

                    System.out.println("Inserir um Lote na árvore\n"
                            + "Digite um Lote");
                    lote = scan.nextInt();

                    System.out.println("Inserir um Area na árvore\n"
                            + "Digite um Area");
                    area = scan.next();

                    System.out.println("Inserir um Valor do Ingresso na árvore\n"
                            + "Digite um valor");
                    valor = scan.nextDouble();

                    System.out.println("Inserir um Nome na árvore\n"
                            + "Digite um Nome");
                    nome = scan.next();

                    System.out.println("Inserir um CPF na árvore\n"
                            + "Digite um CPF");
                    cpf = scan.next();

                    System.out.println("Digite um Pagamento se efetuado árvore\n"
                            + "Pagamento 0 = não efetuado 1 = efetuado  ");
                    oppaga = scan.next();
                    if (oppaga.equals("0")) {
                        pagamento = false;
                    } else {
                        pagamento = true;
                    }

                    if (arvore.inserir(new ItemShow(numeroSerial, lote, area, valor, nome, cpf, pagamento))) {
                        System.out.println("inserção efetuada com sucesso");
                    } else {
                        System.out.println("inserção não efetuada, "
                                + "valor já existe");
                    }
                    break;
                case '2':
                    if (arvore.eVazia()) {
                        System.out.println("Árvore está vazia");
                    } else {
                        System.out.println("Localizar um valor\n"
                                + "Digite o valor");
                        numeroSerial = scan.nextInt();
                        if (arvore.pesquisar(numeroSerial)) {
                            System.out.println("o " + numeroSerial + " foi"
                                    + " encontrado");
                        } else {
                            System.out.println("o valor não foi"
                                    + " encontrado na arvore");
                        }
                    }
                    break;
                case '3':
                    if (arvore.eVazia()) {
                        System.out.println("Arvore está vazia");
                    } else {
                        System.out.println("Excluir um elemento da"
                                + " lista\nDigite um valor");
                        numeroSerial = scan.nextInt();
                        if (arvore.remover(numeroSerial)) {
                            System.out.println("remoção efetuada");
                        } else {
                            System.out.println("remoção não"
                                    + " efetuada, valor não encontrado");
                        }
                    }
                    break;
                case '4':
                    if (arvore.eVazia()) {
                        System.out.println("A árvore está vazia");
                    } else {
                        vetor = arvore.CamCentral();
                        String msg = " ";
                        for (int i = 0; i < arvore.getQuantNos(); i++) {
                            msg += vetor[i].getNumeroSerial() + " ";
                        }
                        System.out.println("Exibir a árvore: " + msg);

                    }
                    break;

                case '5':
                    if (arvore.eVazia()) {
                        System.out.println("A árvore está vazia");
                    } else {
                        ItemShow[] vet = arvore.CamPreFixado();
                        for (int i = 0; i < vet.length; i++) {
                        Integer n =   arvore.CamPreFixadoPesoassingresso(vet[i].getCpf())[0];
                            if (n>2) {
                                
                            
                            System.out.println(vet[i].getNome()+" comprou "+n+" ingresos \n");
                        }}
                                
                        System.out.println("");
                        
                    }
                    break;

                case '6':
                    System.out.println("pesquisa por CPF"
                            + " \nDigite um CPF");
                    cpf = scan.next();

                    ItemShow[] vetor1 = arvore.CamPreFixadoComprPorCpf(cpf);

                    for (int i = 0; i < vetor1.length; i++) {

                        System.out.println(" " + vetor1[i].imprimi());
                    }

                    break;
                    case '7':
                   
                        System.out.println("\nnumero de ingresos ja pago: "+arvore.CamPreFixadoPagantes()[0]+"\n");
                  
       

                    break;
                case '8':
                    System.out.println("fim do programa");
                    break;

                default:
                    System.out.println("opção inválida, tente novamente");

            }
        } while (opcao != '8');
        System.exit(0);
    }
}
