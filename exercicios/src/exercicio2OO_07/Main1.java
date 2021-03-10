
package exercicio2OO_07;
import exercicio2OO_07.FuncionariosdoBanco;

public class Main1 {
    public static void main(String[] args) {
        
        FuncionariosdoBanco banco =new FuncionariosdoBanco();
        
        banco.setValerefeiçao(18.2);
        System.out.println(banco.getValerefeiçao());  
        banco.valorValerefeiçao(1);
         System.out.println(banco.getValerefeiçao());  
        
}}
