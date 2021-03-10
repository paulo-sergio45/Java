
package exercicio_6OO;


public class pais {
    
   private String iso;
   private String nome;
   private double populaçao ;
   private double dimensao ;
   private pais[] fronteira;
   private pais[] paises;

   
    public void setDimensao(double valor) {
        this.dimensao=valor;
    }
    public double getDimensao() {
        return dimensao;
    }
    
    
   public void setFronteiras( pais[] pais) {
     this.fronteira = pais;
    } 
   public pais[] getFronteiras( ) {
     return this.fronteira;
    }
   
   
    public void setPaises( pais[] paises) {
     this.paises = paises;
    }
    public pais[] getPaises( ) {
     return this.paises ;
    }
    
    
     public void setIso (String nome){
   this.iso=nome;
   }
     public String getIso (){
     return this.iso;
   }
     
     
   public void setNome (String nome){
   this.nome=nome;
  } 
   public String getNome (){
     return this.nome;
     
     
  }
    public void setPopulaçao (double valor){
   this.populaçao=valor;
  }
      public double getPopulaçao (){
    return this.populaçao;
  }
 
  
    public void imprimir(pais valores){
     System.out.println(""+ this.iso );  
    System.out.println(""+this.nome );
   System.out.println(""+this.populaçao );
    System.out.println(""+this.dimensao );
  
    
    }
   
}
