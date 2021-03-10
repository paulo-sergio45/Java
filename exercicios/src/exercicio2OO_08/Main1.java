
package exercicio2OO_08;
import exercicio2OO_08.Led;

public class Main1 {
    public static void main(String[] args) {
        Led l =new Led("vermelho");
      
        
        l.desliga(0);
   System.out.println(l.getLed());     
        l.ligaled(1);
      System.out.println(l.getLed());  
      System.out.println(l.getcorLed());  
        
}
}