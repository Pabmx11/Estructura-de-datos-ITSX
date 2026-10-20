package Estructuras_lineales.LISTAS;
import Estructuras_lineales.NodoDoble;

/**
 * Implementación de una Lista Doblemente Enlazada.
 * Permite inserción, eliminación, búsqueda y recorridos en ambas direcciones.
 */
public class ListaDoble {
    public NodoDoble cabeza; // Apuntador al primer nodo
    public NodoDoble cola;   // Apuntador al último nodo

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Verifica si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // 1. Inserción al inicio
    public void insertarAlInicio(int x) {
        NodoDoble nuevo = new NodoDoble(x);

        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    // 2. Inserción al final
    public void insertarAlFinal(int x) {
        NodoDoble nuevo = new NodoDoble(x);

        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // 3. Mostrar hacia adelante (de cabeza a cola)
    public void mostrarAdelante() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble actual = cabeza;
        System.out.print("Lista (Adelante): null <- ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }
            actual = actual.siguiente;
        }
        System.out.println(" -> null");
    }

    // 4. Mostrar hacia atrás (de cola a cabeza)
    public void mostrarAtras() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble actual = cola;
        System.out.print("Lista (Atrás): null <- ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.anterior != null) {
                System.out.print(" <-> ");
            }
            actual = actual.anterior;
        }
        System.out.println(" -> null");
    }

    // 5. Buscar un valor
    public boolean buscar(int x) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.dato == x) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // 6. Eliminar un elemento por su valor
    public void eliminar(int x) {
        if (estaVacia()) {
            return;
        }

        NodoDoble actual = cabeza;

        // Búsqueda del nodo a eliminar
        while (actual != null && actual.dato != x) {
            actual = actual.siguiente;
        }

        // Si no se encontró el valor
        if (actual == null) {
            return;
        }

        // CASO A: Eliminar la CABEZA
        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            } else {
                cola = null; // Si se vació la lista
            }
            return;
        }

        // CASO B: Eliminar la COLA
        if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            return;
        }

        // CASO C: Eliminar en el MEDIO
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
    }
}