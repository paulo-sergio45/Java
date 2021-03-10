/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author paulo
 */
public class Semaforos {

    private  int valor;
    private ArrayBlockingQueue fila;
    
 public Semaforos(int n) {
       this.fila = new ArrayBlockingQueue<Thread>(n);
       this.valor=1;
    }
     public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
      public Thread getElemFila() {
        return (Thread) this.fila.poll();
    }

    public void setElemFila(Thread p) {
        this.fila.add(p);
    }


    /*=================================================================*/
    public void down(Thread p) throws InterruptedException  {

        setValor( getValor()-1);

            System.out.println(getValor());
        if (getValor() < 0) {
            
            setElemFila(Thread.currentThread());
            try {
               synchronized (Thread.currentThread()) {
                    Thread.currentThread().wait(); // Aguarda até que algum agendamento ocorra.										
				}
            } catch (InterruptedException ex) {
                 Logger.getLogger(FilosofoGlutao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        

    }

    public void up() throws InterruptedException {

         setValor( getValor()+1);
        
        System.out.println(getValor());
        if (getValor() <= 0) {
            Thread p = (Thread) getElemFila();

               synchronized (p) {
				p.notify(); // Avisa que houve um agendamento.
			}
          
        }

    }
 /*=================================================================*/

  
}
