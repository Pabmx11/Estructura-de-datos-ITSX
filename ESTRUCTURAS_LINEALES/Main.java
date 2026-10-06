package Estructuras_lineales;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PILA DINÁMICA (PilaDinamica) ===");
        PilaDinamica miPila = new PilaDinamica();

        System.out.println("¿La pila está vacía?: " + miPila.isEmpty());

        System.out.println("\n--- Insertando elementos (Push) ---");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.mostrar();

        System.out.println("\n--- Consultando la cima (Peek) ---");
        miPila.peek();

        System.out.println("\n--- Extrayendo elemento (Pop) ---");
        miPila.pop(); // Saca el 30
        miPila.mostrar();

        System.out.println("\n--- Vaciando la pila ---");
        miPila.pop();
        miPila.pop();
        miPila.mostrar();
        System.out.println("¿La pila está vacía?: " + miPila.isEmpty());

        System.out.println("\n--- Intento de subdesbordamiento (Underflow) ---");
        miPila.pop();
    }
}
