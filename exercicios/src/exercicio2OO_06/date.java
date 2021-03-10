
package exercicio2OO_06;


public class date {
    
   private int mes,dia,ano; 

    public date(int dia, int mes, int ano) {
        if(dia>=1&&dia<=31){
        this.dia = dia;}
        else{System.out.println("data invalida");}
        
         if(mes>=1&&mes<=12){
        this.mes = mes;}
         else{System.out.println("data invalida");}
         
         if(ano>=1900&&ano<=2900){
        this.ano = ano;}
         else{System.out.println("data invalida");}
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }
    
    public void display(){
        System.out.println(this.dia+"/"+this.mes+"/"+ this.ano );
    }
    public void nextDay(){
    this.dia++;
    }
     public void nextMes(){
    this.mes++;
    }
      public void nextAno(){
    this.ano++;
    }
}
