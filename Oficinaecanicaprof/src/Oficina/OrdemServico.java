package Oficina;

import java.util.List;

public class OrdemServico {

    private List<ItemServico> itensServico;

    public OrdemServico() {
    }

    public OrdemServico(List<ItemServico> itensServico) {
        super();
        this.itensServico = itensServico;
    }

    private void listaOS() {

    }

    private void calculaOS() {

    }

    public List<ItemServico> getItensServico() {
        return itensServico;
    }

    public void setItensServico(List<ItemServico> itensServico) {
        this.itensServico = itensServico;
    }
}
