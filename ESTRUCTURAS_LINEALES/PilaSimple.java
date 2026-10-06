package Estructuras_lineales;

public class PilaSimple {
    int[] datos = new int[5]; // Capacidad fija de 5
    int tope = -1;            // Empieza vacía (índice -1 indica sin elementos)

    // 1. Meter dato (Push) // Llenar la pila
    void push(int x) {
        if (!isFull()) { // Control de desbordamiento: verifica que haya espacio disponible
            tope++; // Avanza el apuntador al siguiente espacio disponible
            datos[tope] = x; // Almacena el nuevo elemento en la posición del tope
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila llena!"); // Notifica desbordamiento si el arreglo está lleno
        }
    }

    // 2. Sacar dato (Pop)
    void pop() {
        if (!isEmpty()) { // Control de subdesbordamiento: verifica que existan elementos
            System.out.println("Sacaste: " + datos[tope]);
            tope--; // Reduce el índice para descartar el elemento superior
        } else {
            System.out.println("¡Pila vacía!"); // Notifica subdesbordamiento si no hay elementos
        }
    }

    // Ver la pila
    void mostrar() {
        System.out.print("Pila actual: ");
        for (int i = 0; i <= tope; i++) { // Recorre el arreglo desde la base hasta la posición del tope
            System.out.print(datos[i] + " ");
        }
        System.out.println(); // Salto de línea
    }

    // Verificar si la pila está vacía
    boolean isEmpty() {
        return tope == -1; // Retorna true si el tope está en -1 (sin elementos), false si contiene datos
    }

    // Verificar si el arreglo alcanzó su límite
    boolean isFull() {
        return tope == datos.length - 1; // Retorna true si el tope llegó a la última posición del arreglo
    }

    // Consultar el elemento en el tope sin eliminarlo del arreglo
    int peek() {
        if (!isEmpty()) { // Comprueba que la pila no esté vacía antes de consultar
            System.out.println("Elemento en el tope: " + datos[tope]);
            return datos[tope]; // Retorna el valor en la posición del tope sin modificar el índice
        } else {
            System.out.println("¡Pila vacía!"); // Notifica en caso de que la pila no tenga datos
            return -1; // Valor por defecto si está vacía
        }
    }
}
