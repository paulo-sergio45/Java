package Oficina;

import java.util.ArrayList;
import java.util.List;

public class ItemServico {

    private MaoDeObra maoDeObra;
    private Servico servico;
    private List<Insumo> insumos;

    public ItemServico() {
    }

    public ItemServico(MaoDeObra maoDeObra, Servico servico, ArrayList<Insumo> insumos) {
        super();
        this.maoDeObra = maoDeObra;
        this.servico = servico;
        this.insumos = insumos;
    }

    public MaoDeObra getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(MaoDeObra maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }
}
