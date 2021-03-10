
package exercicio2OO_01;


public class aluno {
private String nome;
    private String matricula;
    private double[] notas;
    private int cont=0;
    
    private double media;
    
   
   public aluno(int quantidadeNotas){
		notas = new double[quantidadeNotas];
	}
   
    public void adicionarnotas(double notas){
        if (cont +1 > this.notas.length){
            System.out.println("Numero máximo de notas informado");
		
        }  else{          
    this.notas[this.cont]=notas;
    this.cont++;}
   
    }
    
    public double setmedia(){
        double media=0;
        for (int i = 0; i < this.cont; i++) {
         
           media +=this.notas[i];
        }
    
            this.media = media/this.cont;
    return this.media ;
    
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void Print() {
      System.out.println(this.matricula + " " + 
	                       this.nome + " "+ this.media );
    }
    
}  
