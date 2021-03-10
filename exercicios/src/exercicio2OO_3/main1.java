
package exercicio2OO_3;
import exercicio2OO_3.VetorDePontos;

public class main1 {
      public static void main(String[] args) {  
          VetorDePontos v =new VetorDePontos(2, 2);
           double[] x ={2,2};
                double[] y ={6,1};
          v.setPontox(x);
          v.setPontoy(y);
          
          System.out.println(v.gettamatho(x, y));
          System.out.println(v.getnElem());
        v.print();
          
          
          
          
          
}
}