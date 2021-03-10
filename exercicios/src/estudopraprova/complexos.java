
package estudopraprova;


public class complexos {
  
    private double real,imaginaria;
    
    public complexos(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria; 
}
public complexos() {
    }

public void print(complexos p1){
    System.out.println(p1);
}

public complexos soma(complexos complexo,complexos complexo1){
    double somareal=complexo.real+complexo1.real;
    double somaimag=complexo.imaginaria+complexo1.imaginaria;
    return new complexos(somareal,somaimag);
}
public complexos subtraçao(complexos complexo,complexos complexo1){
    double subtrreal=complexo.real+complexo1.real;
    double subrtimag=complexo.imaginaria+complexo1.imaginaria;
    return new complexos(subtrreal,subrtimag);
}

}
