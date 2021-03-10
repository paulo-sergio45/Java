package calc;

import java.text.Collator;
import java.util.Comparator;
import java.util.stream.Collector;

public class Municipioordenadonome implements Comparator<Municipio> {

    @Override
    public int compare(Municipio m0, Municipio m1) {

        int nomeComp = m0.getMunicipio().compareToIgnoreCase(m1.getMunicipio());
        if (nomeComp != 0) {
            return nomeComp;
        }

        return m0.getMunicipio().compareToIgnoreCase(m1.getMunicipio());

    }
}
