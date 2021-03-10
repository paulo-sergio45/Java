package Pesquisa_Ordenacao;

public class Arvore {

    private No_Arvore raiz;

    public Arvore() {
        this.raiz = null;

    } // m�todos (inclusive os de inser��o, remo��o e pesquisa)

    public boolean pesquisa(int chave) {
        No_Arvore temp;
        temp = this.pesquisa(chave, this.raiz);
        if (temp != null) {
            return true;
        } else {
            return false;
        }
    }

    private No_Arvore pesquisa(int chave, No_Arvore no) {
        No_Arvore temp;
        temp = no;
        if (temp != null) {
            if (chave < temp.getInfo().getData()) {
                temp = this.pesquisa(chave, temp.getEsq());
            } else {
                if (chave > temp.getInfo().getData()) {
                    temp = this.pesquisa(chave, temp.getDir());
                }
            }
        }
        return temp;
    }

    public boolean insere(Item elem) {
        boolean existe;
        existe = this.pesquisa(elem.getData());
        if (existe) {
            return false;
        } else {
            this.raiz = this.insere(elem, this.raiz);

            return true;

        }
    }

    private No_Arvore insere(Item elem, No_Arvore no) {
        No_Arvore novo;
        if (no == null) {
            novo = new No_Arvore(elem);
            return novo;
        } else {
            if (elem.getData() < no.getInfo().getData()) {
                no.setEsq(this.insere(elem, no.getEsq()));
                return no;
            } else {
                no.setDir(this.insere(elem, no.getDir()));
                return no;
            }
        }
    }

    private No_Arvore remove(int chave, No_Arvore arv) {
        if (arv == null) {
            return arv;
        } else {
            if (chave < arv.getInfo().getData()) {
                arv.setEsq(this.remove(chave, arv.getEsq()));
            } else if (chave > arv.getInfo().getData()) {
                arv.setDir(this.remove(chave, arv.getDir()));
            } else if (arv.getDir() == null) {
                return arv.getEsq();
            } else if (arv.getEsq() == null) {
                return arv.getDir();
            } else {
                arv.setEsq(this.arruma(arv, arv.getEsq()));
            }
        }

        return arv;
    }

    private No_Arvore arruma(No_Arvore Q, No_Arvore R) {
        if (R.getDir() != null) {
            R.setDir(this.arruma(Q, R.getDir()));
        } else {
            Q.setInfo(R.getInfo());
            R = R.getEsq();
        }
        return R;
    }

    public TabelaOrd CamCentral(TabelaOrd vetOrdenado) {
        return (this.FazCamCentral(this.raiz, vetOrdenado));
    }

    private TabelaOrd FazCamCentral(No_Arvore arv, TabelaOrd vetOrdenado) {
        if (arv != null) {
            vetOrdenado = this.FazCamCentral(arv.getEsq(), vetOrdenado);
            vetOrdenado.inserir_Ord(arv.getInfo());
            vetOrdenado = this.FazCamCentral(arv.getDir(), vetOrdenado);
        }
        return vetOrdenado;
    }

    public Arvore ArvoreBalanceada(TabelaOrd vetOrdenado) {
        Arvore temp = new Arvore();
        this.Balancear(vetOrdenado, temp, 0, vetOrdenado.getnElem() - 1);
        return temp;
    }

    private void Balancear(TabelaOrd vet, Arvore temp, int inic, int fim) {
        int meio;

        if (fim >= inic) {
            meio = (inic + fim) / 2;
            temp.insere(vet.getElemVetor(meio));
            this.Balancear(vet, temp, inic, meio - 1);
            this.Balancear(vet, temp, meio + 1, fim);
        }
    }
}
