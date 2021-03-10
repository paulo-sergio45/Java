package exercicio2OO_05;

public class Complexos {

    private double a, b;

    private double i;

    public Complexos(double numeroc1, double numeroc2) {
        i=Math.sqrt(-1);
        this.a = numeroc1;
        this.b = numeroc2;

    }

    public Complexos() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void somareais(double numeroca, double numerocb, double numerocc, double numerocd) {
        double r = (numeroca + numerocc);
        double r1 = (numerocb + numerocd);
        System.out.println(r +"" + r1 + "*i");

    }

    public void subtaçaoc(double numeroca, double numerocb, double numerocc, double numerocd) {
        double r = (numeroca - numerocc);
        double r1 = (numerocb - numerocd);
        System.out.println(r +"" + r1 + "*i");

    }

}
