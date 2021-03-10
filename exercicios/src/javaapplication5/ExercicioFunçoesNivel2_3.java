package javaapplication5;

import java.util.Scanner;

public class ExercicioFunçoesNivel2_3 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
       int r,a=0 ;
       
        System.out.println("idade");
        a=scan.nextInt();
        
       r = idade(a);
       
        switch(r)
        {   case 0:
                    r=0;
                    System.out.println("adulto");
                    break;
            case 1:
                    r=1;
                    System.out.println("infatil A");
                    break;
            case 2:
                    r=2;
                    System.out.println("infatil B");
                    break;
            case 3:
                    r=3;
                    System.out.println("juvenil A");
                    break;
            case 4:
                    r=4;
                    System.out.println("juvenil B");
                    break;
            case 5:
                    r=1;
                    System.out.println("infatil A");
                    break;
        
        } 
    
    }

static int idade(int a){
int r=0;
    if(a>=5&&a<=7){ r=1;}
     if(a>=8&&a<=10){ r=2;}
      if(a>=11&&a<=13){ r=3;}
       if(a>=14&&a<=17) {r=4;}
        
    
return r;
}
}
