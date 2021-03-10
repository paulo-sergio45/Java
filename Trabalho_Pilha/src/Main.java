package trabalho;

import trabalho.Pilha;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Pilha p = new Pilha(4);
        Pilha p1 = new Pilha(4);
        Pilha p2 = new Pilha(p.getTotal() + 1);

        p.pushelement(0);
        p.pushelement(5);
        p.pushelement(9);
        p.pushelement(2);

        p1.pushelement(3);
        p1.pushelement(7);
        p1.pushelement(8);
        p1.pushelement(4);

        p.printPilha();
        System.out.println("");
        p1.printPilha();
        /*  
         System.out.println("");
         p.pushelement(10);
         p.printPilha();
         System.out.println("");
         p.pushelement(5);
         p.printPilha();
         System.out.println("");
         p.pop();
         p.printPilha();
         System.out.println("");
         p.pushelement(15);
         p.printPilha();
         System.out.println("");
         p.pushelement(7);
         p.printPilha();
         System.out.println("");
         p.pop();
         p.printPilha();
         System.out.println("");
             
        
         p.pop();
         */

        p2.setPilha(p2.somador(p, p1));
        System.out.println("");
        p2.printPilha();

        p2.recObect(p);

        System.out.println("");

        p2.printPilha(p2.readObect());

    }

}
