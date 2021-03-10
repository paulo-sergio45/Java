
package estudopraprova;


public class pontos {
    private double x,y;

    public void atualizarxy(double x,double y) {
        this.x = x;
         this.y = y;
    }
    
    public double coordenadax() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double coordenaday() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
     public void print(pontos ponto) {
      System.out.println("("+ponto.x+","+ponto.y+")");
    }
    
    public double distancia(pontos primeiro){
        
     
 double p=Math.pow(this.x-primeiro.x, 2)+Math.pow(this.y-primeiro.y, 2);
        
        return Math.sqrt(p);
    
    }
}
