
package javaapplication5;

import java.util.Scanner;
public class ExercicioFuncoesNivel1_6 {
    	public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
              
            System.out.println("valor xa,xb,ya,yb");
                double xa=scan.nextDouble();
                 double ya=scan.nextDouble();
                  double xb=scan.nextDouble();
                   double yb=scan.nextDouble();
            
            System.out.println("Resutado:"+planoc(xa,ya,xb,yb));           
        }

static double planoc(double xa,double ya,double xb,double yb){
double dab;

    dab=Math.sqrt(Math.pow((xb-xa),2)+Math.pow((yb-ya),2));
    
    return dab;
}

}
