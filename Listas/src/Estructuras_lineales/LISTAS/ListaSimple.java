package Estructuras_lineales.LISTAS;

import Estructuras_lineales.Nodo;

public class ListaSimple {
    public Nodo cabeza;
    public ListaSimple() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void insertarAlFin(int x) {
        Nodo nuevo = new Nodo(x);

        if  (estaVacia()) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza; // el explorador arranca en la cabeza
        while (actual.siguiente != null) { // avanza hasta el ultimo nodo
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo; // el ultimo nodo ahora apunta al nuevo
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            return;
        }

        Nodo actual = cabeza;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(int x) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == x) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public void eliminar(int x) {
        if (estaVacia()) {
            return;
        }
        if (cabeza.dato == x) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != x) {
                actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}
