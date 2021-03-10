package calc;

import java.util.Comparator;

public class Municipioordenadonome implements Comparator<Municipio> {

    @Override
    public int compare(Municipio m0, Municipio m1) {

        int nomeComp = m0.getMunicipio().compareToIgnoreCase(m1.getMunicipio());
        if (nomeComp != 0) {
            return nomeComp;
        }

        return m0.getMunicipio().compareTo(m1.getMunicipio());

    }
}
