package Empresa_Herança_Mutipla;

import java.text.NumberFormat;
import java.util.Locale;

public class Gerente2 extends Funcionario2 {

    Double gratificaçao;

    public Gerente2() {
    }

    public Gerente2(String nome, String cpf, String matricula, Double salario, Double gratificaçao) {
        super(nome, cpf, matricula, salario);
        this.gratificaçao = gratificaçao;
    }

    @Override
    public void admit() {
        super.admit();
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(", " + nf.format(getGratificaçao()));

    }

    @Override
    public void demit() {
        super.demit();
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(", " + nf.format(getGratificaçao()));

    }

    @Override
    public void calculaSalario() {
        System.out.println("==>" + getClass().getSimpleName() + " <" + getNome() + "> " + "" + getSalario());
    }

    public Double getGratificaçao() {
        return gratificaçao;
    }

    public void setGratificaçao(Double gratificaçao) {
        this.gratificaçao = gratificaçao;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return super.toString() + " " + nf.format(this.gratificaçao) + " ";
    }

}
