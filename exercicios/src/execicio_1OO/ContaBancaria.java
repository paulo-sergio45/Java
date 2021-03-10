
package execicio_1OO;


public class ContaBancaria {
    
    private double saldodaconta;
    

public void depositar(double valor){

this.saldodaconta += valor;

}

public void sacar(double valor){

this.saldodaconta -= valor;

}

public double verificarSaldo (){


return this.saldodaconta;
} 

}