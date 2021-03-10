
package exercicio2OO_08;


public class Led {

   
   private boolean led;
   private String corled;
   
    public Led(String corled) {
        this.corled = corled;
    }

    public String getcorLed() {
        return this.corled;
    }

     public void ligaled(int liga1) {
        if(liga1==1)
            this.led=true;
    }
    public void desliga(int desliga0) {
        if(desliga0==0)
            this.led=false;
    }

    public boolean getLed() {
        return this.led;
    }
 
    
 
    
}
