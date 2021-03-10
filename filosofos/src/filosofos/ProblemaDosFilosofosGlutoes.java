package filosofos;

import java.util.List;
import java.util.ArrayList;

public class ProblemaDosFilosofosGlutoes{
	public static void main(String args[]){
            /*=================================================================*/
                Semaforos sema = new Semaforos(5);
            /*=================================================================*/ 
            
            
		// cria os grafos (colecao de 5 garfos)
		List<Garfo>garfos = new ArrayList<Garfo>();
		for (int i = 0; i<=4; i++){
			Garfo garfo = new Garfo(i);
			garfos.add(i,garfo);
		}
		// cria a thread do filosofo 0
		FilosofoGlutao r0 = new FilosofoGlutao(garfos, 0,sema);
		Thread f0 = new Thread(r0);
		// cria a thread do filosofo 1
		FilosofoGlutao r1 = new FilosofoGlutao(garfos, 1,sema);
		Thread f1 = new Thread(r1);
		// cria a thread do filosofo 2
		FilosofoGlutao r2 = new FilosofoGlutao(garfos, 2,sema);
		Thread f2 = new Thread(r2);
		// cria a thread do filosofo 3
		FilosofoGlutao r3 = new FilosofoGlutao(garfos, 3,sema);
		Thread f3 = new Thread(r3);
		// cria a thread do filosofo 4
		FilosofoGlutao r4 = new FilosofoGlutao(garfos, 4,sema);
		Thread f4 = new Thread(r4);		
		
		// nomeia as threads
		f0.setName("F0");
		f1.setName("F1");
		f2.setName("F2");
		f3.setName("F3");
		f4.setName("F4");
		
		// manda as threads pra fila de pronto
		f0.start();
		f1.start();
		f2.start();
		f3.start();
		f4.start();
	}
}