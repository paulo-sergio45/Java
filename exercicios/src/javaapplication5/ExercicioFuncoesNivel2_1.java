
package javaapplication5;
import java.util.Scanner;
 
public class ExercicioFuncoesNivel2_1 {
    
    public static void main(String[] args) {  
        Scanner scan=new Scanner(System.in);
        
        System.out.println("valores A, B e C");
        double a =scan.nextDouble();
        double b =scan.nextDouble();
        double c =scan.nextDouble();
        
        System.out.println("resutado"+resuta(a,b,c));
}
    static double resuta(double a, double b,double c){
    double r,d,s;
    
    s=Math.pow((b+c),2);
    r=Math.pow((a+b),2);
    d=((r+s)/2);
    
    return d;
    }
    }