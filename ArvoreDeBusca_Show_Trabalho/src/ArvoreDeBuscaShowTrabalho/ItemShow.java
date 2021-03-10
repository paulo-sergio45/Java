package ArvoreDeBuscaShowTrabalho;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import sun.util.resources.CalendarData;

public class ItemShow {

    Date datai = Calendar.getInstance(TimeZone.getTimeZone("GMT-03:00")).getTime();

    private int numeroSerial;
    private int lote;
    private String area;
    private String data;
    private Double valor;
    private String nome;
    private String cpf;
    private boolean pagamento = false;

    public ItemShow(int numeroSerial, int lote, String area, Double valor,
            String nome, String cpf, boolean pagamento) {
        this.numeroSerial = numeroSerial;
        this.lote = lote;
        this.area = area;
        this.valor = valor;
        this.nome = nome;
        this.cpf = cpf;
        this.pagamento = pagamento;
        this.data = datai.toString();
    }

    public void setNumeroSerial(int NumeroSerial) {
        this.numeroSerial = NumeroSerial;
    }
    //Faz a leitura do valor do atributo numeroSerial

    public int getNumeroSerial() {
        return this.numeroSerial;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String imprimi() {
        if (this.numeroSerial!=0&&this.area!=null&&this.lote!=0&&this.valor!=null) {
            
            return ("\n Serial: " + this.numeroSerial
                + "\n data  : " + this.data
                + "\n lote  : " + this.lote
                + "\n area  : " + this.area
                + "\n valor : " + this.valor
                + "\n nome  : " + this.nome
                + "\n cpf   : " + this.cpf + "");
        } else {
            
            
            
            
        }
        return null;
       
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

}
