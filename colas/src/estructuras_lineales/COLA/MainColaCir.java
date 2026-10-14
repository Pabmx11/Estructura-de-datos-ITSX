package estructuras_lineales.COLA;

public class MainColaCir {
    public static void main(String[] args) {
        ColaEstaticaCircular cola = new ColaEstaticaCircular(5);

        System.out.println("*** PRUEBA DE COLA ESTÁTICA CIRCULAR ***");

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.enqueue(50);

        System.out.println("\n--- fila actual ---");
        cola.mostrar();

        System.out.println("\n--- Intentando agregar con la cola llena ---");
        cola.enqueue(99);

        System.out.println("\n--- Peek (consultar sin sacar) ---");
        System.out.println("Al frente está: " + cola.peek());
        cola.mostrar();

        System.out.println("\n--- Atendiendo (Dequeue)---");
        cola.dequeue();
        cola.dequeue();

        System.out.println("\n---Fila después de atender---");
        cola.mostrar();
        System.out.println("Al frente está: " + cola.peek());

        System.out.println("\n--- Agregando más (Efecto circular---");
        cola.enqueue(60);
        cola.enqueue(70);

        System.out.println("\n--- Estado final---");
        cola.mostrar();
        System.out.println("Al frente está: " + cola.peek());

        System.out.println("\n--- Vaciando la cola ---");
        for (int i = 0; i < 5; i++) {
            cola.dequeue();
        }
        cola.mostrar();
        cola.peek();
    }
}
