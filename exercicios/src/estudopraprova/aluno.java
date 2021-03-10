
package estudopraprova;


public class aluno {

   
private String nome;
private String matricula;
private double[] notas;
private  int i;
 
    public aluno(int quantidadenotas) {
         notas = new double[quantidadenotas];
    }


 public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
     

    public void addNotas(double notas) {
        
        
             this.notas[i] = notas;
        i++;
       
    }
     public double media(double notas[]) {
         double nota = 0;
         int i;
        for ( i = 0; i< this.notas.length; i++) {
           nota += this.notas[i];
        }
    return nota/this.notas.length;
       
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

   
}
