
package estudopraprova;

public class vetordepontos {
   
    
    private pontos[] ponto;
    private int nlem;

    public vetordepontos(int tamanhovet) {
        ponto =new pontos[tamanhovet];
       
    }
    public void getponto(int posiçao) {
        System.out.println(ponto[posiçao]);   
       
    }
    public void inserefinavet(pontos ponto){
        if(nlem+1<this.ponto.length-1){System.out.println("tamnho maximo");}
        else{
        this.ponto[this.ponto.length]=ponto;
       this.nlem++; }
    }
    public void removervet(int ind){
        this.ponto[ind]=null;
        int i = ind;
        for ( ; i < this.ponto.length; i++) {
         if(!(i+1>ponto.length-1)){
            this.ponto[i]=this.ponto[i+1];
          this.ponto[i+1]=null;
        }}
        
    }
    
    public void print(){
       for (int i = 0; i < this.ponto.length; i++) {
             if (i+1<this.ponto.length){
         System.out.println("("+this.ponto[i].getX()+","+this.ponto[i].getY()+")");
       }   else{ return;} }
      
    }
   
    public void addponto(pontos ponto) {
       this.ponto[this.nlem]=ponto;
       this.nlem++;
    }

    public int gettamanho() {
        return nlem;
    }

  
    
}
