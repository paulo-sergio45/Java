
package estudopraprova;

public class main {
     public static void main(String[] args) { 
     aluno a=new aluno(3);
     
   a.setNome("paulo sergio alves dos santos");
   a.setMatricula("123456789");
   a.addNotas(7.1);
   a.addNotas(10);
   a.addNotas(5);
   
   System.out.println(a.getMatricula()); 
   System.out.println(a.getNome());
   System.out.println( a.media(a.getNotas()));
         
   pontos p = new pontos();
   
   p.atualizarxy(5, 5);
   p.setX(5);
   p.setY(5);
 
         System.out.println(  p.distancia(p));
         System.out.println("("+p.getX()+","+p.getY()+")");
         
         vetordepontos v =new vetordepontos(5);
          pontos p0= new pontos();
          p0.atualizarxy(1, 2);
         pontos p1= new pontos();
          p1.atualizarxy(3, 4);
          pontos p2= new pontos();
           p2.atualizarxy(5, 6);
           pontos p3= new pontos();
            p3.atualizarxy(7, 8);
            pontos p4= new pontos();
             p4.atualizarxy(9, 10);
           
            v.addponto(p0);
             v.addponto(p1);
              v.addponto(p2);
               v.addponto(p3);
                v.addponto(p4);
                
            
             v.gettamanho();
                v.removervet(0);
               v.print();
               
               arryadepontos ap =new arryadepontos();
               ap.inserir(p4);
               ap.inserir(p0);
               ap.inserir(p3);
               System.out.println(ap.gettamanho());
               ap.remover(p0);
               ap.getponto(1);
               
               complexos c=new complexos(25,6);
                complexos c1=new complexos(2,86);
                
            c.print(c.soma(c, c1)); 
             c.print(c.subtraçao(c, c1)); 
}
}