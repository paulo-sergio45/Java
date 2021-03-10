
package exercicio_2OO;
import exercicio_2OO.contador.*;
        
        
public class main1 {
    
      public static void main(String[] args) {  
          contador contador = new contador();
          
          contador.incrementar(20);
          System.out.println(" contador"+contador.retornarOValorDoContador());
          
          
          contador.zerar();
           System.out.println("contador"+ contador.retornarOValorDoContador());
         
          
          contador.incrementar(50);
           System.out.println("contador"+ contador.retornarOValorDoContador());
          
}
}