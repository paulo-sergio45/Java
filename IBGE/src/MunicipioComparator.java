package IBGE;

import java.util.Comparator;

public class MunicipioComparator implements Comparator<Municipio> {

    @Override
    public int compare(Municipio m0, Municipio m1) {

        int nomeComp = m0.getNomeMunicipio().compareTo(m1.getNomeMunicipio());
        if (nomeComp != 0) {
            return nomeComp;
        }

        return m0.getCodEstado().compareTo(m1.getCodEstado());

//		int codEstadoComp = m0.getCodEstado().compareTo(m1.getCodEstado());
//		if (codEstadoComp != 0){
//			return codEstadoComp;
//		}
//				
//		return m0.getNomeMunicipio().compareTo(m1.getNomeMunicipio());
    }
}
