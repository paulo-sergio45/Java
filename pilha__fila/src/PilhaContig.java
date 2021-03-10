package pilha__fila;

public class PilhaContig {

    private Item[] info;
    private int topo;

    public PilhaContig(int qte) {
        this.topo = 0;
        this.info = new Item[qte];
    }

    public Item getInfo() {
        return this.info[this.topo - 1];
    }

    public int getTopo() {
        return this.topo;
    }

    public boolean eVazia() {
        return (this.topo == 0);
    }

    public boolean eCheia() {
        return (this.topo == this.info.length);
    }

    public boolean empilhar(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.topo] = elem;
            this.topo++;
            return true;
        }
    }

    public Item desempilhar() {
        if (this.eVazia()) {
            return null;
        } else {
            this.topo--;
            return this.info[this.topo];
        }
    }

    //inverter as letras de uma palavra
    public String inverterPalavra(String palavra) {
        if (this.info.length < palavra.length()) {
            return null;
        } else {
            String resposta = "";
            for (int i = 0; i < palavra.length(); i++) {
                this.empilhar(new Item((int) palavra.charAt(i)));
            }
            while (!this.eVazia()) {
                resposta += this.desempilhar().getChave();
            }
            return resposta;
        }
    }

/// exercicio 03 lista pilhacont 04
    public int compararIdeticas(PilhaContig pilha2) {
        if (eVazia() && pilha2.eVazia()) {
            return 1;
        } else if (this.eVazia() || pilha2.eVazia()) {
            return 0;
        } else if (this.topo != pilha2.topo) {
            return 0;
        } else {
            PilhaContig aux1 = new PilhaContig(this.topo);
            PilhaContig aux2 = new PilhaContig(this.topo);

            boolean igual = true;

            while (!this.eVazia() && igual) {
                if (this.info[this.topo].getChave() == pilha2.info[pilha2.topo].getChave()) {

                } else {
                    igual = false;
                }

                while (!aux1.eVazia()) {
                    this.empilhar(aux1.desempilhar());
                    pilha2.empilhar(aux2.desempilhar());
                }
                if (igual) {
                    return 1;
                } else {
                    return 1;
                }

            }
        }
        return 0;
    }

    public boolean emplilhar2(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.topo] = elem;
            this.topo++;
            return true;
        }

    }

    public Item d3esenpilhar2() {
        if (this.eVazia()) {
            return null;
        } else {
            this.topo--;
            return this.info[this.topo];
        }

    }

    public boolean emplilhar3(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.topo] = elem;
            this.topo++;
            return true;
        }

    }

    public Item desempilhar3() {
        if (this.eVazia()) {
            return null;
        } else {
            this.topo--;
            return this.info[this.topo];
        }

    }

    public boolean enpilhar4(Item elem) {
        if (this.eCheia()) {
            return false;
        } else {
            this.info[this.topo] = elem;
            this.topo++;
            return true;
        }

    }

    public Item desenpilhar() {
        if (this.eVazia()) {
            return null;
        } else {
            this.topo--;
            return this.info[this.topo];

        }

    }

}
