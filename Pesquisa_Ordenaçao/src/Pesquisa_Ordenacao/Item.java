package Pesquisa_Ordenacao;

public class Item {

    private int chave;
    private int data;

    // outros atributos
    // construtor(es) e metodos para manipular os atributos,
    // dentre eles:
    public Item(int chave) {
        super();
        this.chave = chave;
    }

    Item(String string, String string0, String string1, Double valueOf, Boolean valueOf0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
