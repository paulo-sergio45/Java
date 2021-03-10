/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AArvoredebusca;

public class Teste {

    public static void main(String[] args) {

        Item i0 = new Item(50);
        Item i1 = new Item(40);
        Item i2 = new Item(20);
        Item i3 = new Item(10);
        Item i4 = new Item(25);
        Item i5 = new Item(45);
        Item i6 = new Item(43);
        Item i7 = new Item(47);
        Item i8 = new Item(60);
        Item i9 = new Item(55);
        Item i10 = new Item(53);
        Item i11 = new Item(57);
        Item i12 = new Item(65);
        Item i13 = new Item(63);
        Item i14 = new Item(67);

        Arvore a = new Arvore();

        a.inserir(i0);
        a.inserir(i1);
        a.inserir(i2);
        a.inserir(i3);
        a.inserir(i4);
        a.inserir(i5);
        a.inserir(i6);
        a.inserir(i7);
        a.inserir(i8);
        a.inserir(i9);
        a.inserir(i10);
        a.inserir(i11);
        a.inserir(i12);
        a.inserir(i13);
        a.inserir(i14);

        Item[] vetor = a.CamPreFixado();
        for (int i = 0; i < vetor.length; i++) {

            System.out.print("  " + vetor[i].getChave());

        }
        System.out.println("");
        System.out.println(a.AltPre()[0]);

        System.out.println("");

        boolean affs = a.remover(58);

        System.out.println(" ");
        Item[] vetor1 = a.CamPreFixado();
        for (int i = 0; i < vetor1.length; i++) {

            System.out.print("  " + vetor1[i].getChave());

        }

    }

}
