package estructuras_lineales.COLA;

// Reutilizamos la misma clase Nodo de la práctica de Pilas
import estructuras_lineales.Nodo;

public class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(int x) {
        Nodo nuevo = new Nodo(x);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    public int peek() { // consulta el nodo del frente sin desvincularlo
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return frente.dato;
    }

    public int contarElementos() { // recorre los nodos desde el frente hasta el fin
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        Nodo actual = frente;
        System.out.print("Frente -> ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ");
            actual = actual.siguiente;
        }
        System.out.println("<- Fin");
    }
}
