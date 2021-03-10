package ArvoreDeBuscaShowTrabalho;



public class ArvoreShow {

    private NoArvShow raiz;
    private int quantNos;

    public ArvoreShow() {
        this.quantNos = 0;
        this.raiz = null;
    }

    public boolean eVazia() {
        return (this.raiz == null);
    }

    public NoArvShow getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public boolean inserir(ItemShow elem) {
        if (pesquisar(elem.getNumeroSerial())) {
            return false;
        } else {
            this.raiz = inserir(elem, this.raiz);
            this.quantNos++;
            return true;
        }
    }

    public NoArvShow inserir(ItemShow elem, NoArvShow no) {
        if (no == null) {
            NoArvShow novo = new NoArvShow(elem);
            return novo;
        } else {
            if (elem.getNumeroSerial() < no.getInfo().getNumeroSerial()) {
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

    public String pesquisarArea(int area) {

        return pesquisar(area, this.raiz).getInfo().getArea();

    }

    public int pesquisarLote(int chave) {
        return pesquisar(chave, this.raiz).getInfo().getLote();

    }

    public boolean pesquisarPagamento(int chave) {

        return pesquisar(chave, this.raiz).getInfo().isPagamento();

    }

    public Integer[] CamPreFixadoPagantes() {
        Integer n = 1;
        Integer[] vet = {0};
        return (FazCamPreFixadoPagantes(this.raiz, vet, n));

    }

    private Integer[] FazCamPreFixadoPagantes(NoArvShow arv, Integer[] vet, Integer n) {
        if (arv != null) {
            if (arv.getInfo().isPagamento()) {
                vet[0] += n;
            }

            FazCamPreFixadoPagantes(arv.getEsq(), vet, n);
            FazCamPreFixadoPagantes(arv.getDir(), vet, n);

        }
        return vet;

    }

    
    
    
    
    public Integer[] CamPreFixadoPesoassingresso(String cpf) {
        Integer n = 1;
       
        Integer[] vet1={0};
    
        return (FazCamPreFixadoPesoassingresso(this.raiz, vet1, n,cpf));

    }

    private Integer[] FazCamPreFixadoPesoassingresso(NoArvShow arv, Integer[] vet1, Integer n,String cpf) {
        if (arv != null) {
            
            if (arv.getInfo().getCpf().equals(cpf)){
               vet1[0]+=n;  
            } 
            
             
            

            FazCamPreFixadoPesoassingresso(arv.getEsq(), vet1, n,cpf);
            FazCamPreFixadoPesoassingresso(arv.getDir(), vet1, n,cpf);

        }
        return vet1;

    }

    
    
    
    
    public ItemShow[] CamPreFixadoComprPorCpf(String cpf) {
        Integer n = CamPreFixadoPesqQuanCpf(cpf)[0];
        Integer n1 = 1;
        Integer[] vet1 = {0};
        ItemShow[] vet = new ItemShow[n];
        return (FazCamPreFixadoComprPorCpf(this.raiz, vet, cpf, n1, vet1));

    }

    private ItemShow[] FazCamPreFixadoComprPorCpf(NoArvShow arv, ItemShow[] vet, String cpf, Integer n1, Integer[] vet1) {
        if (arv != null) {
            if (arv.getInfo().getCpf().equals(cpf)) {
                vet[vet1[0]] = arv.getInfo();
                vet1[0] += n1;

            }

            FazCamPreFixadoComprPorCpf(arv.getEsq(), vet, cpf, n1, vet1);
            FazCamPreFixadoComprPorCpf(arv.getDir(), vet, cpf, n1, vet1);

        }
        return vet;

    }

    public Integer[] CamPreFixadoPesqQuanCpf(String cpf) {
        Integer n = 1;
        Integer[] vet = {0};
        return (FazCamPreFixadoPesqQuanCpf(this.raiz, vet, cpf, n));

    }

    private Integer[] FazCamPreFixadoPesqQuanCpf(NoArvShow arv, Integer[] vet, String cpf, Integer n) {
        if (arv != null) {
            if (arv.getInfo().getCpf().equals(cpf)) {
                vet[0] += n;
            }

            FazCamPreFixadoPesqQuanCpf(arv.getEsq(), vet, cpf, n);
            FazCamPreFixadoPesqQuanCpf(arv.getDir(), vet, cpf, n);

        }
        return vet;

    }

    public ItemShow[] CamPreFixadoNome(String nome) {
        ItemShow[] vet = new ItemShow[1];
        return (FazCamPreFixadoNome(this.raiz, vet, nome));

    }

    private ItemShow[] FazCamPreFixadoNome(NoArvShow arv, ItemShow[] vet, String nome) {

        if (arv != null) {
            if (arv.getInfo().getNome().equals(nome)) {
                vet[0] = arv.getInfo();
            }

            FazCamPreFixadoNome(arv.getEsq(), vet, nome);
            FazCamPreFixadoNome(arv.getDir(), vet, nome);
        }
        return vet;

    }

    private NoArvShow pesquisar(int chave, NoArvShow no) {
        if (no != null) {
            if (chave < no.getInfo().getNumeroSerial()) {
                no = pesquisar(chave, no.getEsq());
            } else {
                if (chave > no.getInfo().getNumeroSerial()) {
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

    public NoArvShow remover(int chave, NoArvShow arv) {
        if (chave < arv.getInfo().getNumeroSerial()) {
            arv.setEsq(remover(chave, arv.getEsq()));
        } else {
            if (chave > arv.getInfo().getNumeroSerial()) {
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

    private NoArvShow Arrumar(NoArvShow arv, NoArvShow maior) {
        if (maior.getDir() != null) {
            maior.setDir(Arrumar(arv, maior.getDir()));
        } else {
            arv.setInfo(maior.getInfo());
            maior = maior.getEsq();
        }
        return maior;
    }

    public ItemShow[] CamCentral() {
        int[] n = new int[1];
        n[0] = 0;
        ItemShow[] vet = new ItemShow[this.quantNos];
        return (FazCamCentral(this.raiz, vet, n));
    }

    private ItemShow[] FazCamCentral(NoArvShow arv, ItemShow[] vet,
            int[] n) {
        if (arv != null) {
            vet = FazCamCentral(arv.getEsq(), vet, n);
            vet[n[0]] = arv.getInfo();
            n[0]++;
            vet = FazCamCentral(arv.getDir(), vet, n);
        }
        return vet;
    }

    public ItemShow[] CamPreFixado() {
        int[] n = new int[1];
        n[0] = 0;
        ItemShow[] vet = new ItemShow[this.quantNos];
        return (FazCamPreFixado(this.raiz, vet, n));
    }

    private ItemShow[] FazCamPreFixado(NoArvShow arv, ItemShow[] vet,
            int[] n) {
        if (arv != null) {
            vet[n[0]] = arv.getInfo();
            n[0]++;
            vet = FazCamPreFixado(arv.getEsq(), vet, n);
            vet = FazCamPreFixado(arv.getDir(), vet, n);
        }
        return vet;
    }

    public ItemShow[] CamPosFixado() {
        int[] n = new int[1];
        n[0] = 0;
        ItemShow[] vet = new ItemShow[this.quantNos];
        return (FazCamPosFixado(this.raiz, vet, n));
    }

    private ItemShow[] FazCamPosFixado(NoArvShow arv, ItemShow[] vet,
            int[] n) {
        if (arv != null) {
            vet = FazCamPosFixado(arv.getEsq(), vet, n);
            vet = FazCamPosFixado(arv.getDir(), vet, n);
            vet[n[0]] = arv.getInfo();
            n[0]++;
        }
        return vet;
    }

}
