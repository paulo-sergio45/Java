package estruturadupla;

public class listadupla_teste {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.inserirUltimo(new Item(1));
        lista.inserirUltimo(new Item(2));
        lista.inserirUltimo(new Item(3));
        lista.inserirUltimo(new Item(4));

        ListaDupla lista1 = new ListaDupla();
        lista1.inserirUltimo(new Item(2));
        lista1.inserirUltimo(new Item(2));
        lista1.inserirUltimo(new Item(2));
        lista1.inserirUltimo(new Item(2));

        System.out.print(" 1 \n" + lista.toString());
        System.out.println("");
        lista = lista.inserirOrdenarMm();
        System.out.print("  2 " + lista.toString());

    }

}
