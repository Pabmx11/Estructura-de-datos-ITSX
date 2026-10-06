package Estructuras_lineales;

public class PilaDinamica {
    Nodo cima; // Declarando un nodo llamado cima. El control remoto que apunta al elemento de hasta arriba

    // Constructor de la pila
    public PilaDinamica() {
        this.cima = null; // Arranca vacía
    }

    // Método PUSH (Meter elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); // 1. Creamos el nuevo nodo con el dato recibido.
        nuevo.siguiente = cima;   // 2. El nuevo nodo apunta hacia la cima actual (enlaza al nodo anterior).
        cima = nuevo;             // 3. Actualizamos la cima para que el nuevo nodo sea ahora el tope.
    }

    // Método POP (Sacar el elemento de arriba)
    void pop() {
        if (!isEmpty()) { // Comprueba que la pila contenga al menos un nodo
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima baja al nodo que estaba debajo, desvinculando el superior
        } else {
            System.out.println("¡Pila dinámica vacía!"); // Control de subdesbordamiento
        }
    }

    // Método MOSTRAR (Recorriendo con el explorador)
    void mostrar() {
        Nodo actual = cima; // Nuestro explorador arranca en la cima
        System.out.print("Pila Dinámica (Cima -> Fondo): ");

        while (actual != null) { // Mientras no lleguemos al fondo (null)
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Saltamos al siguiente nodo
        }
        System.out.println(); // Salto de línea
    }

    // Método isEmpty (Verificar si la pila está vacía)
    boolean isEmpty() {
        return cima == null; // Retorna true si la cima no apunta a ningún nodo, false en caso contrario
    }

    // Método PEEK (Consultar el valor en la cima sin desvincularlo)
    int peek() {
        if (!isEmpty()) { // Verificamos primero que la pila contenga datos
            System.out.println("Elemento en la cima: " + cima.dato);
            return cima.dato; // Retorna el dato almacenado en el nodo de la cima sin modificar los enlaces
        } else {
            System.out.println("¡Pila dinámica vacía!"); // Notifica en caso de que la pila no tenga nodos
            return -1; // Valor por defecto si está vacía
        }
    }
}
