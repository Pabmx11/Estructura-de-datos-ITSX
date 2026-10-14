package estructuras_lineales.COLA;

public class MainColaEsta {
    public static void main(String[] args) {
        // Creamos una cola con espacio para 3 personas/elementos
        ColaEstatica miCola = new ColaEstatica(3);

        System.out.println("*** PRUEBA DE COLA ESTÁTICA ***");

        // Metemos elementos
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        // Intentamos meter uno más cuando ya está llena
        miCola.enqueue(40);

        // Vemos cómo queda la fila
        miCola.mostrar();

        // Consultamos al primero sin sacarlo
        System.out.println("Al frente está: " + miCola.peek());
        miCola.mostrar(); // sigue igual, peek no saca a nadie

        // Atendemos al primero
        miCola.dequeue();
        miCola.mostrar();
        System.out.println("Al frente está: " + miCola.peek());

        // Aunque se liberó un lugar, la cola lineal no lo reutiliza
        miCola.enqueue(50);

        // Atendemos a los que quedan
        miCola.dequeue();
        miCola.dequeue();
        miCola.mostrar();

        // Con la cola vacía, peek y dequeue marcan error
        miCola.peek();
        miCola.dequeue();
    }
}
