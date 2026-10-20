package Estructuras_lineales.LISTAS;

public class ListaMain {
    public static void main(String[] args) {
        // Creamos nuestra lista simple
        ListaSimple lista = new ListaSimple();

        System.out.println("¿La lista está vacia? " + lista.estaVacia());

        // Probando inserciones
        lista.insertarAlFin(10);
        lista.insertarAlFin(20);
        lista.insertarAlFin(30);
        lista.insertarAlInicio(5);

        // Debería mostrar: 5 -> 10 -> 20 -> 30 -> null
        lista.mostrar();

        // Probando búsqueda
        System.out.println("¿El 20 está en la lista? " + lista.buscar(20));
        System.out.println("¿El 99 está en la lista? " + lista.buscar(99));

        System.out.println("\nEliminado el numero 20 (del centro)...");
        lista.eliminar(20);

        lista.mostrar();
    }
}
