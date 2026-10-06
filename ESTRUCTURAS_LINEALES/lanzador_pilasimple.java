package Estructuras_lineales;

public class lanzador_pilasimple {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PILA ESTÁTICA (PilaSimple) ===");
        PilaSimple p = new PilaSimple();

        System.out.println("¿La pila está vacía?: " + p.isEmpty());

        System.out.println("\n--- Insertando elementos (Push) ---");
        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();

        System.out.println("\n--- Consultando el tope (Peek) ---");
        p.peek();

        System.out.println("\n--- Extrayendo elemento (Pop) ---");
        p.pop(); // Saca el 30
        p.mostrar();

        System.out.println("\n--- Llenando la pila hasta el límite ---");
        p.push(40);
        p.push(50);
        p.push(60); // Alcanza la capacidad máxima (5 elementos)
        p.mostrar();

        System.out.println("¿La pila está llena?: " + p.isFull());

        System.out.println("\n--- Intento de desbordamiento (Overflow) ---");
        p.push(70); // Desbordamiento
    }
}
