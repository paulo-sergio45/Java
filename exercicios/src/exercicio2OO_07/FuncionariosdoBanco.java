
package exercicio2OO_07;


public class FuncionariosdoBanco {
    private double valerefeiçao;

    public double getValerefeiçao() {
        return valerefeiçao;
    }

    public void setValerefeiçao(double valerefeiçao) {
        this.valerefeiçao = valerefeiçao;
    }
    
      public void valorValerefeiçao(double valorvalerefeiçao) {
  double p =valorvalerefeiçao/100;
 double r= p*this.valerefeiçao;
 this.valerefeiçao=this.valerefeiçao+r;
    }
}
