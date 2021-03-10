package trabalho;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Pilha implements Serializable {

    private int[] pilha;
    private int ind = 0;
    private int total = 0;

    public Pilha(int tamanho) {
        int[] pilha = new int[tamanho];

        ind = tamanho;

    }

    public void cear() {
        for (int i = 0; i < pilha.length; i++) {
            pilha[i] = 0;
        }
    }

    public void isEmpty() {
        int n = 0;
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == 0) {
                n = 1;
            } else {
                n = 2;
            }
        }
        switch (n) {
            case 1:
                System.out.println("pilha vazia");
                break;
            case 2:
                System.out.println();
                break;
        }

    }

    public void isFull() {
        int n = 0;
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != 0) {
                n = 1;
            } else {
                n = 2;
            }
        }
        switch (n) {
            case 1:
                System.out.println("pilha cheia");
                break;
            case 2:
                System.out.println();
                break;
        }

    }

    public void pushelement(int valor) throws Exception {
        if (valor < 0 || valor > 9) {
            throw new Exception("insira um valo  >=0 & <=9");
        } else {
            if (total < ind) {

                int[] vet = new int[ind];
                if (total == 0) {
                    for (int i = 0; i < vet.length; i++) {
                        vet[i] = 0;
                        pilha = vet;
                    }
                }

                vet = pilha;

                vet[total] = valor;

                pilha = vet;

                this.total++;

            } else {
                throw new Exception("erro nao tem espaço");
            }
        }
    }

    public void setPilha(int[] valor) {

        this.pilha = valor;

    }

    public int topelement() throws Exception {
        int n = 0;
        if (total < 0) {
            throw new Exception("nao existe");

        } else {
            int[] vet = pilha;
            n = vet[total - 1];

        }
        return n;
    }

    public int pop() throws Exception {
        int n;
        if (total <= 0) {
            throw new Exception("nao existe");

        } else {
            int[] vet = pilha;
            n = vet[total - 1];
            vet[total - 1] = 0;
            pilha = vet;
            total--;

        }

        return n;

    }

    public void getInd() {
        System.out.println(ind);
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public void printPilha() {
        for (int i = 0; i < pilha.length; i++) {
            System.out.print(pilha[i] + ",");
        }

    }

    public void printPilha(Pilha pilha) {
        pilha.printPilha();

    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] somador(Pilha a, Pilha b) throws Exception {
        int n = 0, resto = 0, resto2 = 0;

        int[] vet = new int[a.getTotal() + 1];
        int[] vet2 = new int[a.getTotal() + 1];
        int[] vetr = new int[1];

        for (int i = 0; a.getTotal() + b.getTotal() != 0; i++, n = 0) {
            n += a.topelement();
            n += b.topelement();
            if (n >= 10) {

                int valor1 = n % 100;
                int valor2 = n % 10;
                resto = valor1 / 10;
                resto2 = valor2;
                vetr[0] = resto;

            }

            if (resto > 0) {
                n = resto2;
                vet[i + 1] = vetr[0];
            }

            vet[i] += n;
            vetr[0] = 0;
            a.pop();
            b.pop();
            resto = 0;
            resto2 = 0;
        }

        int k = vet.length - 1;
        for (int i = 0; i < vet.length; i++, k--) {
            int c = 0;
            vet2[i] = vet[k];
        }

        return vet2;

    }

    public void recObect(Pilha pilha) {
        try {

            FileOutputStream file = new FileOutputStream("pilha.file");
            ObjectOutputStream objec = new ObjectOutputStream(file);
            objec.writeObject(pilha);
            objec.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public Pilha readObect() {
        Pilha p1 = null;
        try {

            FileInputStream file = new FileInputStream("pilha.file");
            ObjectInputStream objec = new ObjectInputStream(file);
            Pilha p = (Pilha) objec.readObject();
            objec.close();
            p1 = p;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return p1;

    }

}
