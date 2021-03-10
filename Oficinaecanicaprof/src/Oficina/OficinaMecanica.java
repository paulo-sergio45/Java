package Oficina;

import java.util.ArrayList;
import java.util.List;

public class OficinaMecanica {

    public static void main(String[] args) {
        // Criar m�o de obra
        MaoDeObra mo1 = new MaoDeObra("Jo�o", "888.335.092-93");
        MaoDeObra mo2 = new MaoDeObra("Tiago", "928.264.192-34");

        // Servi�os
        Servico s1 = new ServicoAcabamento("Lanternagem", 350D, 6D);
        Servico s2 = new ServicoMecanico("Troca de correia dentada", 150D, 3D);

        // Insumos + lista de insumos
        Insumo i1 = new Insumo();
        Insumo i2 = new Insumo();
        Insumo i3 = new Insumo();
        Insumo i4 = new Insumo();

        // lista de insumos do item de servi�o 1
        ArrayList<Insumo> insumos_it1 = new ArrayList<Insumo>();
        insumos_it1.add(i1);
        insumos_it1.add(i2);

        // lista de insumos do item de servi�o 2
        ArrayList<Insumo> insumos_it2 = new ArrayList<Insumo>();
        insumos_it2.add(i3);
        insumos_it2.add(i4);

        // Itens de servi�o
        ItemServico it1 = new ItemServico(mo1, s1, insumos_it1);
        ItemServico it2 = new ItemServico(mo2, s2, insumos_it2);

        // Ordem de servi�o
        OrdemServico os = new OrdemServico();
        List<ItemServico> itensServico = new ArrayList<ItemServico>();
        itensServico.add(it1);
        itensServico.add(it2);
        os.setItensServico(itensServico);
    }

}
