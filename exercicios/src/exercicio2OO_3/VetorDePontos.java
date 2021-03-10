
package exercicio2OO_3;


public class VetorDePontos {
    private double[] x,y;
    private int nElem ;

    
    public VetorDePontos(int tamanhox,int tamanhoy){
    x =new double[tamanhox];
     y =new double[tamanhoy];
    }
    
    
    public void setPontox(double[] ponto) {
        this.x = ponto;  
    }
     public void setPontoy(double[] ponto) {
        this.y = ponto;  
    }

    public double[] getPontox() {
        return this.x;
    }
     public double[] getPontoy() {
        return this.y;
    }

      public int getnElem() {
          int i = 0;
          for ( i = 0; i < x.length; i++) {
              
           
          } this.nElem+=i;
          
          for (i = 0; i < y.length; i++) {
            
          } this.nElem+=i;
    return this.nElem;
      }
   
   public double gettamatho(double[] x,double[] y ){
       double d=0,d1=0,r;
       int i;
       for ( i = 0; i < x.length-1; i++) {
            
       d= x[i]-x[i+1];
       d1= y[i]-y[i+1];
       }
       r=Math.sqrt(Math.pow(d, 2)+Math.pow(d1, 2));
        return r;
   }
    
   public void print (){
       for (int i = 0; i < x.length; i++) {
           System.out.println("ponto x"+x[i]); 
           
       }
       for (int i = 0; i < y.length; i++) {
           System.out.println("ponto y"+y[i]); 
           
       }
   }
}
