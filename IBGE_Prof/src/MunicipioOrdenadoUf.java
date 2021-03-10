package calc;

import java.util.Comparator;

public class MunicipioOrdenadoUf implements Comparator<Municipio> {

    @Override
    public int compare(Municipio m0, Municipio m1) {

        int nomeComp = m0.getCodUF().compareToIgnoreCase(m1.getCodUF());
        if (nomeComp != 0) {
            return nomeComp;
        }

        return m0.getCodUF().compareToIgnoreCase(m1.getCodUF());

    }

}
