
package estudopraprova;
import java.util.ArrayList;

public class arryadepontos {
private ArrayList<pontos> ponto;

    public arryadepontos() {
      ponto =new ArrayList();
    }
    
    public int gettamanho(){
     return ponto.size();
    }
    public void getponto(int ponto){
      System.out.println(this.ponto.get(ponto));
    }
    public void inserir(pontos ponto){
    this.ponto.add(ponto);
    }
     public void remover(pontos ponto){
    this.ponto.remove(ponto);
    }
     
    
}
