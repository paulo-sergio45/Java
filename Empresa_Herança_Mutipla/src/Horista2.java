package Empresa_Herança_Mutipla;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Horista2 extends RecursoHumano2 implements RegimeComissionado {

    Double comissao;

    public Horista2() {
    }

    public Horista2(String nome, String cpf, Double comissao) {
        super(nome, cpf);
        this.comissao = comissao;
    }

    @Override
    public void admit() {
        System.out.println("Adimite " + getClass().getSimpleName() + ": " + getNome());
    }

    @Override
    public void demit() {
        System.out.println("Demite " + getClass().getSimpleName() + ": " + getNome());
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return super.toString() + " " + nf.format(this.comissao) + " ";
    }

}
