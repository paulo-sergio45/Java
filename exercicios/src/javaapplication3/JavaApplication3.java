
package javaapplication3;
import java.util.*;
public class JavaApplication3 {

    public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);
        int B = 0,I=0,R=0,C=0,imp;
     System.out.println("decimal");
        B=scan.nextInt();
 int[] vet=new int[16];
 
 if(B%2==0){for(;B>0.99;){ C=R%2;  R=B/2; B=R;  vet[I]=C; I++;  }}
 
 else{for(;B>0.99;){ C=R%2;  R=B/2; B=R;  vet[I]=C; I++;if(R==0){vet[0]=1;} }}

 for(I=15;I>-1;I--){System.out.print(vet[I]);  }System.out.println("\t binário");
    
}}
