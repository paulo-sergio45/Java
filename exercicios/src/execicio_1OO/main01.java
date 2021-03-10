
package execicio_1OO;

import java.util.Scanner;



public class main01 {
   
  public static void main(String[] args) {  
   Scanner scan= new Scanner (System.in);
      ContaBancaria conta = new ContaBancaria(); 
  
  conta.depositar(5000);
      
  conta.sacar(2500);
  
      System.out.println("saldo "+conta.verificarSaldo());
  
  
  
  }

   
}