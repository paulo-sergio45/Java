package exercicio2OO_05;

import exercicio2OO_05.Complexos;

public class main {

    public static void main(String[] args) {
        Complexos a = new Complexos(3, 2);
        Complexos b = new Complexos(5, -3);
        Complexos c = new Complexos(7, 10);
        Complexos d = new Complexos(3, 6);
        System.out.println(a.getA());
        System.out.println(a.getB());
        System.out.println(b.getA());
        System.out.println(b.getB());

        System.out.println(" ");
        System.out.println(c.getA());
        System.out.println(c.getB());
        System.out.println(d.getA());
        System.out.println(d.getB());
        a.somareais(a.getA(), a.getB(), b.getA(), b.getB());
        a.subtaçaoc(c.getA(), c.getB(), d.getA(), d.getB());
    }
}
