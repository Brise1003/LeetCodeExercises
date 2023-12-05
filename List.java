import java.util.LinkedList;

public class List {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        LinkedList<Integer> lista1 = new LinkedList<>();

        lista.add(10);
        lista.add(18);
        lista.add(1,17);
        lista.addFirst(1);
        lista.addLast(20);

        lista1 = (LinkedList<Integer>) lista.clone();

        System.out.println("El tamaño de la lista es: " + lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
        lista.removeFirst();
        for (int i:lista1) {
            System.out.println(i);
        }

    }

}
