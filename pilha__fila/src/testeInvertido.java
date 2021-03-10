package pilha__fila;

import java.util.Scanner;

public class testeInvertido {

    public static void main(String[] args) {
        PilhaChar pilha = new PilhaChar(10);
        Scanner scan = new Scanner(System.in);
        String palavra = "dados";
        System.out.println("a palavra invertida � "
                + pilha.inverterPalavra(palavra));
    }

}
