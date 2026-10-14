package estructuras_lineales.COLA;

public class MainColaDin {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();

        System.out.println("*** PRUEBA DE COLA DINÁMICA ***");

        System.out.println("\n--- Cola recién creada ---");
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Encolando ---");
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Peek (consultar sin sacar) ---");
        System.out.println("Al frente está: " + cola.peek());
        cola.mostrar(); // sigue igual, peek no saca a nadie

        System.out.println("\n--- Desencolando ---");
        System.out.println("Atendido y fuera: " + cola.desencolar());
        System.out.println("Atendido y fuera: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Al frente está: " + cola.peek());
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Sin límite de capacidad ---");
        for (int i = 50; i <= 100; i += 10) {
            cola.encolar(i);
        }
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());

        System.out.println("\n--- Vaciando la cola ---");
        while (!cola.estaVacia()) {
            cola.desencolar();
        }
        cola.mostrar();
        System.out.println("Elementos: " + cola.contarElementos());
        cola.peek();
        cola.desencolar();
    }
}
