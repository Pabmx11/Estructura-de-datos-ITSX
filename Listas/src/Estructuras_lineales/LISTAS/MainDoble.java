package Estructuras_lineales.LISTAS;

/**
 * Clase principal para probar el funcionamiento de la Lista Doblemente Enlazada.
 */
public class MainDoble {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        System.out.println("--- PRUEBA DE INSERCIONES ---");
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlInicio(5);

        // Debería mostrar: null <- [5] <-> [10] <-> [20] <-> [30] -> null
        lista.mostrarAdelante();

        // Demostración del recorrido hacia atrás gracias al apuntador 'anterior' y 'cola'
        lista.mostrarAtras();

        System.out.println("\n--- PRUEBA DE BÚSQUEDA ---");
        System.out.println("¿El 20 está en la lista? " + lista.buscar(20));
        System.out.println("¿El 99 está en la lista? " + lista.buscar(99));

        System.out.println("\n--- PRUEBA DE ELIMINACIÓN (Elemento del medio: 20) ---");
        lista.eliminar(20);

        // Verificamos de nuevo en ambas direcciones tras el recorte
        lista.mostrarAdelante();
        lista.mostrarAtras();
    }
}