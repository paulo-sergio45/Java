package voo;

import java.util.Scanner;

public class MenuPrincipalvoo {

    static Scanner scan = new Scanner(System.in);

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ListaSimplesvoo voodeFaR = new ListaSimplesvoo();
        ListaSimplesvoo voodeFaJP = new ListaSimplesvoo();
        ListaSimplesvoo voodeFaF = new ListaSimplesvoo();
        int dR = 1;
        int dF = 2;
        int dJ = 3;
        int opcao = 0;
        int valor = 0;
        String nome;
        String cpf;
        String telefone;
        String destino;
        Itemvoo item;
        do {
            opcao = 0;
            System.out.println("escolha uma opção:\n"
                    + "1. Inclusão de passageiros ao voo\n"
                    + "2. Apresentar dados dos passageiros de um determinado vôo \n"
                    + "3. Apresentar dados de passageiros de acordo com o código pesquisado\n"
                    + "4. Exclusão de passageiro da lista de acordo com seu código\n"
                    + "5. Transferência de passageiro de um vôo para outro destino\n"
                    + "6. sair do programa\n");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    opcao = 0;
                    System.out.println("escolha uma opção:\n"
                            + "1. Inclusão de passageiros ao voo destino Recife \n"
                            + "2. Inclusão de passageiros ao voo destino Fortaleza \n"
                            + "3. Inclusão de passageiros ao voo destino João Pessoa \n");
                    opcao = scan.nextInt();
                    switch (opcao) {

                        case 1:
                            opcao = 0;
                            System.out.println("digite cod. ");
                            valor = scan.nextInt();
                            System.out.println(" nome");
                            nome = scan.next();
                            System.out.println("cpf");
                            cpf = scan.next();
                            System.out.println("telefone");
                            telefone = scan.next();
                            System.out.println("destino");
                            destino = scan.next();
                            item = new Itemvoo(valor, nome, cpf, telefone, destino);
                            voodeFaR.inserirUltimo(item);
                            System.out.println("operação realizada com sucesso!");
                            break;
                        case 2:
                            opcao = 0;
                            System.out.println("digite cod. ");
                            valor = scan.nextInt();
                            System.out.println(" nome");
                            nome = scan.next();
                            System.out.println("cpf");
                            cpf = scan.next();
                            System.out.println("telefone");
                            telefone = scan.next();
                            System.out.println("destino");
                            destino = scan.next();
                            item = new Itemvoo(valor, nome, cpf, telefone, destino);
                            voodeFaF.inserirUltimo(item);
                            System.out.println("operação realizada com sucesso!");
                            break;
                        case 3:
                            opcao = 0;
                            System.out.println("digite cod. ");
                            valor = scan.nextInt();
                            System.out.println(" nome");
                            nome = scan.next();
                            System.out.println("cpf");
                            cpf = scan.next();
                            System.out.println("telefone");
                            telefone = scan.next();
                            System.out.println("destino");
                            destino = scan.next();
                            item = new Itemvoo(valor, nome, cpf, telefone, destino);
                            voodeFaJP.inserirUltimo(item);
                            System.out.println("operação realizada com sucesso!");
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    break;
                case 2:
                    opcao = 0;
                    System.out.println("escolha uma opção:\n"
                            + "1. imprimi dados passageiros do voo destino Recife  \n"
                            + "2. imprimi dados passageiros do voo destino Fortaleza  \n"
                            + "3. imprimi dados passageiros do voo destino João Pessoa \n");
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            opcao = 0;
                            voodeFaR.imprime();
                            break;
                        case 2:
                            opcao = 0;
                            voodeFaF.imprime();
                            break;
                        case 3:
                            opcao = 0;
                            voodeFaJP.imprime();
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    break;
                case 3:
                    opcao = 0;
                    System.out.println("escolha uma opção:\n"
                            + "1. imprimi dados do passageiro selecionado do voo destino Recife  \n"
                            + "2. imprimi dados do passageiro selecionado do voo destino Fortaleza  \n"
                            + "3. imprimi dados do passageiro selecionado do voo destino João Pessoa \n");
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            opcao = 0;
                            System.out.println("imprimi um determinado passageiro voo destino Recife\n");
                            System.out.println("digite o cod. passageiro: ");
                            valor = scan.nextInt();
                            voodeFaR.impimindoSelecionado(valor);
                            break;
                        case 2:
                            opcao = 0;
                            System.out.println("imprimi um determinado passageiro voo destino Fortaleza \n");
                            System.out.println("digite o cod. passageiro: ");
                            valor = scan.nextInt();
                            voodeFaF.impimindoSelecionado(valor);
                            break;
                        case 3:
                            opcao = 0;
                            System.out.println("imprimi um determinado passageiros voo João Pessoa\n");
                            System.out.println("digite o cod. passageiro: ");
                            valor = scan.nextInt();
                            voodeFaJP.impimindoSelecionado(valor);
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    break;
                case 4:
                    opcao = 0;
                    System.out.println("escolha uma opção:\n"
                            + "1. Exclusão de passageiro da lista de acordo com seu código voo destino Recife  \n"
                            + "2. Exclusão de passageiro da lista de acordo com seu código voo destino Fortaleza  \n"
                            + "3. Exclusão de passageiro da lista de acordo com seu código destino João Pessoa \n");
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            voodeFaR.removerPassageiroSelecionado(valor);
                            break;
                        case 2:
                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            voodeFaF.removerPassageiroSelecionado(valor);
                            break;
                        case 3:
                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            voodeFaJP.removerPassageiroSelecionado(valor);
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    break;

                case 5:
                    opcao = 0;
                    System.out.println("escolha uma opção:\n"
                            + "1. Transferência de passageiro de um vôo para  Recife  \n"
                            + "2. Transferência de passageiro de um vôo para  Fortaleza  \n"
                            + "3. Transferência de passageiro de um vôo para  João Pessoa \n");
                    opcao = scan.nextInt();
                    switch (opcao) {

                        case 1:

                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            if (voodeFaF.TransferênciPassageiro(valor).getInfo().getChave() == valor) {

                                voodeFaR.alteraDestino(voodeFaF.TransferênciPassageiro(valor).getInfo(), dF);
                                voodeFaR.inserirUltimo(voodeFaF.TransferênciPassageiro(valor).getInfo());
                                voodeFaR.removerNo(valor);
                            } else if (voodeFaJP.TransferênciPassageiro(valor).getInfo().getChave() == valor) {

                                voodeFaR.alteraDestino(voodeFaJP.TransferênciPassageiro(valor).getInfo(), dF);
                                voodeFaR.inserirUltimo(voodeFaJP.TransferênciPassageiro(valor).getInfo());
                                voodeFaR.removerNo(valor);
                            } else {
                                System.out.println("passageiro nao existe");
                            }
                            break;
                        case 2:
                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            if (voodeFaR.TransferênciPassageiro(valor).getInfo().getChave() == valor) {
                                voodeFaF.alteraDestino(voodeFaR.TransferênciPassageiro(valor).getInfo(), dR);
                                voodeFaF.inserirUltimo(voodeFaR.TransferênciPassageiro(valor).getInfo());
                                voodeFaF.removerNo(valor);
                            } else if (voodeFaJP.TransferênciPassageiro(valor).getInfo().getChave() == valor) {
                                voodeFaF.alteraDestino(voodeFaJP.TransferênciPassageiro(valor).getInfo(), dR);
                                voodeFaF.inserirUltimo(voodeFaJP.TransferênciPassageiro(valor).getInfo());
                                voodeFaF.removerNo(valor);
                            } else {
                                System.out.println("passageiro nao existe");
                            }
                            break;
                        case 3:
                            opcao = 3;
                            System.out.println("digite cod passageiro: ");
                            valor = scan.nextInt();
                            if (voodeFaR.TransferênciPassageiro(valor).getInfo().getChave() == valor) {
                                voodeFaJP.alteraDestino(voodeFaJP.TransferênciPassageiro(valor).getInfo(), dJ);
                                voodeFaJP.inserirUltimo(voodeFaR.TransferênciPassageiro(valor).getInfo());
                                voodeFaJP.impimindoSelecionado(valor);
                            } else if (voodeFaF.TransferênciPassageiro(valor).getInfo().getChave() == valor) {
                                voodeFaJP.alteraDestino(voodeFaF.TransferênciPassageiro(valor).getInfo(), dJ);
                                voodeFaJP.inserirUltimo(voodeFaF.TransferênciPassageiro(valor).getInfo());
                                voodeFaJP.removerNo(valor);
                            } else {
                                System.out.println("passageiro nao existe");
                            }
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    break;
            }
        } while (opcao != 4);
    }
}
