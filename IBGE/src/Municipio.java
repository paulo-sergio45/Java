package IBGE;

public class Municipio {

    private String sigla;
    private String codEstado;
    private String codMunicipio;
    private String nomeMunicipio;
    private String qtdeHabitantes;

    // contrutor
    public Municipio() {
    }

    public Municipio(String sigla, String codEstado, String codMunicipio,
            String nomeMunicipio, String qtdeHabitantes) {
        this.sigla = sigla;
        this.codEstado = codEstado;
        this.codMunicipio = codMunicipio;
        this.nomeMunicipio = nomeMunicipio;
        this.qtdeHabitantes = qtdeHabitantes;
    }

    // getters & setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getQtdeHabitantes() {
        return qtdeHabitantes;
    }

    public void setQtdeHabitantes(String qtdeHabitantes) {
        this.qtdeHabitantes = qtdeHabitantes;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "sigla: " + sigla
                + "codEstado: " + codEstado
                + "codMunicipio: " + codMunicipio
                + "nomeMunicipio: " + nomeMunicipio
                + "qtdeHabitantes: " + qtdeHabitantes + "\n";
    }
}
