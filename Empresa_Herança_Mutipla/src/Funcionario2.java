package Empresa_Herança_Mutipla;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario2 extends RecursoHumano2 implements RegimeClt {

    String matricula;
    Double salario;

    public Funcionario2() {
    }

    public Funcionario2(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario2(String nome, String cpf, String matricula, Double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public void admit() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.print("adimite " + getClass().getSimpleName() + ": " + getNome() + ", " + nf.format(getSalario()));
    }

    @Override
    public void demit() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.print("demite " + getClass().getSimpleName() + ": " + getNome() + ", " + nf.format(getSalario()));
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return super.toString() + " " + this.matricula + " " + nf.format(this.salario) + " ";
    }

}
