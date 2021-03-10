package AArvoredebusca;

public class Arvore {

    private NoArv raiz;
    private int quantNos;

    public Arvore() {
        this.quantNos = 0;
        this.raiz = null;
    }

    public boolean eVazia() {
        return (this.raiz == null);
    }

    public NoArv getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public boolean inserir(Item elem) {
        if (pesquisar(elem.getChave())) {
            return false;
        } else {
            this.raiz = inserir(elem, this.raiz);
            this.quantNos++;
            return true;
        }
    }

    public NoArv inserir(Item elem, NoArv no) {
        if (no == null) {
            NoArv novo = new NoArv(elem);
            return novo;
        } else {
            if (elem.getChave() < no.getInfo().getChave()) {
                no.setEsq(inserir(elem, no.getEsq()));
                return no;
            } else {
                no.setDir(inserir(elem, no.getDir()));
                return no;
            }
        }
    }

    public boolean pesquisar(int chave) {
        if (pesquisar(chave, this.raiz) != null) {
            return true;
        } else {
            return false;
        }
    }

    private NoArv pesquisar(int chave, NoArv no) {
        if (no != null) {
            if (chave < no.getInfo().getChave()) {
                no = pesquisar(chave, no.getEsq());
            } else {
                if (chave > no.getInfo().getChave()) {
                    no = pesquisar(chave, no.getDir());
                }
            }
        }
        return no;
    }

    public boolean remover(int chave) {
        if (pesquisar(chave, this.raiz) != null) {
            this.raiz = remover(chave, this.raiz);
            this.quantNos--;
            return true;
        } else {
            return false;
        }
    }

    public NoArv remover(int chave, NoArv arv) {
        if (chave < arv.getInfo().getChave()) {
            arv.setEsq(remover(chave, arv.getEsq()));
        } else {
            if (chave > arv.getInfo().getChave()) {
                arv.setDir(remover(chave, arv.getDir()));
            } else {
                if (arv.getDir() == null) {
                    return arv.getEsq();
                } else {
                    if (arv.getEsq() == null) {
                        return arv.getDir();
                    } else {
                        arv.setEsq(Arrumar(arv, arv.getEsq()));
                    }
                }
            }
        }
        return arv;
    }

    private NoArv Arrumar(NoArv arv, NoArv maior) {
        if (maior.getDir() != null) {
            maior.setDir(Arrumar(arv, maior.getDir()));
        } else {
            arv.setInfo(maior.getInfo());
            maior = maior.getEsq();
        }
        return maior;
    }

    public Item[] CamCentral() {
        int[] n = new int[1];
        n[0] = 0;
        Item[] vet = new Item[this.quantNos];
        return (FazCamCentral(this.raiz, vet, n));
    }

    private Item[] FazCamCentral(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet = FazCamCentral(arv.getEsq(), vet, n);
            vet[n[0]] = arv.getInfo();
            n[0]++;
            vet = FazCamCentral(arv.getDir(), vet, n);
        }
        return vet;
    }

    public Item[] CamPreFixado() {
        int[] n = new int[1];
        n[0] = 0;
        Item[] vet = new Item[this.quantNos];
        return (FazCamPreFixado(this.raiz, vet, n));
    }

    private Item[] FazCamPreFixado(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet[n[0]] = arv.getInfo();
            n[0]++;
            vet = FazCamPreFixado(arv.getEsq(), vet, n);
            vet = FazCamPreFixado(arv.getDir(), vet, n);
        }
        return vet;
    }

    public Item[] CamPosFixado() {
        int[] n = new int[1];
        n[0] = 0;
        Item[] vet = new Item[this.quantNos];
        return (FazCamPosFixado(this.raiz, vet, n));
    }

    private Item[] FazCamPosFixado(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet = FazCamPosFixado(arv.getEsq(), vet, n);
            vet = FazCamPosFixado(arv.getDir(), vet, n);
            vet[n[0]] = arv.getInfo();
            n[0]++;
        }
        return vet;
    }
    ////////////////exercicio complexidade algoritimo

    public int[] QuannoPreFixado() {
        int[] n = new int[1];
        n[0] = 0;
        Item[] vet = new Item[this.quantNos];
        return (QuannoFazPreFixado(this.raiz, n));
    }

    private int[] QuannoFazPreFixado(NoArv arv, int[] n) {
        if (arv != null) {
            n[0]++;
            QuannoFazPreFixado(arv.getEsq(), n);
            QuannoFazPreFixado(arv.getDir(), n);
        }
        return n;
    }

    public boolean[] ComplePre() {
        boolean[] b = new boolean[1];
        b[0] = true;
        int[] n = new int[1];
        n[0] = 0;
        int[] f = new int[1];
        f[0] = 0;
        return (CompleFazPre(this.raiz, n, b, f));
    }

    private boolean[] CompleFazPre(NoArv arv, int[] n, boolean[] b, int[] f) {
        if (arv != null) {

            if (arv.getEsq() == null && arv.getDir() == null) {
                if (f[0] == 0) {
                    f[0] = n[0];
                } else {
                    if (f[0] == n[0] && b[0] == true) {
                        b[0] = true;
                    } else {
                        b[0] = false;
                    }
                }

            }
            n[0] = n[0] + 1;
            CompleFazPre(arv.getEsq(), n, b, f);

            CompleFazPre(arv.getDir(), n, b, f);
            n[0] = n[0] - 1;
        }

        return b;
    }

    public int[] FolhPre() {
        int[] n = new int[1];
        n[0] = 0;
        return (FolhFazPre(this.raiz, n));
    }

    private int[] FolhFazPre(NoArv arv, int[] n) {
        if (arv != null) {
            if (arv.getEsq() == null && arv.getDir() == null) {
                n[0]++;
            }
            FolhFazPre(arv.getEsq(), n);
            FolhFazPre(arv.getDir(), n);
        }
        return n;
    }

    public int[] AltPre() {
        int[] n = new int[1];
        n[0] = 0;
        int[] f = new int[1];
        f[0] = 0;
        return (AltFazPre(this.raiz, n, f));
    }

    private int[] AltFazPre(NoArv arv, int[] n, int[] f) {
        if (arv != null) {

            if (arv.getEsq() == null && arv.getDir() == null) {
                if (f[0] < n[0]) {
                    f[0] = n[0];

                }
            }
            n[0] = n[0] + 1;
            AltFazPre(arv.getEsq(), n, f);

            AltFazPre(arv.getDir(), n, f);
            n[0] = n[0] - 1;

        }
        return f;

    }
}
