package Pesquisa_Ordenacao;

public class Arvore_AVL {

    private Nodo raiz;
    private boolean h;

    public Arvore_AVL() {
        this.raiz = null;
        this.h = true;
    }

    // Outros m�todos
    public void insereRaiz(Item elem) {
        this.raiz = this.insere(elem, this.raiz);
    }

    private Nodo insere(Item elem, Nodo no) {
        if (no == null) {
            Nodo novo = new Nodo(elem);
            this.h = true;
            return novo;
        } else {
            if (elem.getData() < no.getInfo().getData()) {
                // Insere � esquerda e verifica se precisa balancear � direita
                no.setEsq(this.insere(elem, no.getEsq()));
                no = this.balancearDir(no);
                return no;
            } else {
                // Insere � direita e verifica se precisa balancear � esquerda
                no.setDir(this.insere(elem, no.getDir()));
                no = this.balancearEsq(no);
                return no;
            }
        }
    }

    private Nodo balancearDir(Nodo no) {

        if (this.h) {
            switch (no.getFatorBalanceamento()) {
                case 1:
                    no.setFatorBalanceamento((byte) 0);
                    this.h = false;
                    break;
                case 0:
                    no.setFatorBalanceamento((byte) -1);
                    break;
                case -1:
                    no = this.rotacaoDireita(no);
            }
        }
        return no;
    }

    private Nodo balancearEsq(Nodo no) {
        if (this.h) {
            switch (no.getFatorBalanceamento()) {
                case -1:
                    no.setFatorBalanceamento((byte) 0);
                    this.h = false;
                    break;
                case 0:
                    no.setFatorBalanceamento((byte) 1);
                    break;
                case 1:
                    no = this.rotacaoEsquerda(no);
            }
        }
        return no;
    }

    private Nodo rotacaoDireita(Nodo no) {
        Nodo temp1, temp2;
        temp1 = no.getEsq();
        if (temp1.getFatorBalanceamento() == -1) {
            no.setEsq(temp1.getDir());
            temp1.setDir(no);
            no.setFatorBalanceamento((byte) 0);
            no = temp1;
        } else {
            temp2 = temp1.getDir();
            temp1.setDir(temp2.getEsq());
            temp2.setEsq(temp1);
            no.setEsq(temp2.getDir());
            temp2.setDir(no);
            if (temp2.getFatorBalanceamento() == -1) {
                no.setFatorBalanceamento((byte) 1);
            } else {
                no.setFatorBalanceamento((byte) 0);
            }
            if (temp2.getFatorBalanceamento() == 1) {
                temp1.setFatorBalanceamento((byte) -1);
            } else {
                temp1.setFatorBalanceamento((byte) 0);
            }
            no = temp2;
        }
        no.setFatorBalanceamento((byte) 0);
        this.h = false;
        return no;

    }

    private Nodo rotacaoEsquerda(Nodo no) {
        Nodo temp1, temp2;
        temp1 = no.getDir();
        if (temp1.getFatorBalanceamento() == 1) {
            no.setDir(temp1.getEsq());
            temp1.setEsq(no);
            no.setFatorBalanceamento((byte) 0);
            no = temp1;
        } else {
            temp2 = temp1.getEsq();
            temp1.setEsq(temp2.getDir());
            temp2.setDir(temp1);
            no.setDir(temp2.getEsq());
            temp2.setEsq(no);
            if (temp2.getFatorBalanceamento() == 1) {
                no.setFatorBalanceamento((byte) -1);
            } else {
                no.setFatorBalanceamento((byte) 0);
            }
            if (temp2.getFatorBalanceamento() == -1) {
                temp1.setFatorBalanceamento((byte) 1);
            } else {
                temp1.setFatorBalanceamento((byte) 0);
            }
            no = temp2;
        }
        no.setFatorBalanceamento((byte) 0);
        this.h = false;
        return no;
    }
}
