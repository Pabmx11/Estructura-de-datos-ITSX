package Estructuras_No_Lineales.Arbol;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        this.raiz = insertarRecursivo(this.raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izq = insertarRecursivo(actual.izq, valor);
        } else if (valor > actual.valor) {
            actual.der = insertarRecursivo(actual.der, valor);
        }

        return actual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (valor == actual.valor) {
            return true;
        }

        if (valor < actual.valor) {
            return buscarRecursivo(actual.izq, valor);
        }

        return buscarRecursivo(actual.der, valor);
    }

    public void eliminar(int valor) {
        this.raiz = eliminarRecursivo(this.raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual == null) return null;

        if (valor < actual.valor) {
            actual.izq = eliminarRecursivo(actual.izq, valor);
        } else if (valor > actual.valor) {
            actual.der = eliminarRecursivo(actual.der, valor);
        } else {

            if (actual.izq == null &&  actual.der == null) {
            return null;
            }
            if (actual.izq == null) return actual.der;
            if (actual.der == null) return actual.izq;

            Nodo sucesor = obtenerMinimo(actual.der);

            actual.valor = sucesor.valor;

            actual.der = eliminarRecursivo(actual.der, sucesor.valor);
        }

        return actual;
    }

    private Nodo obtenerMinimo(Nodo actual) {
        while (actual.izq != null) {
            actual = actual.izq;
        }
        return actual;
    }

    public void imprimirInOrder() {
        imprimirRec(this.raiz);
        System.out.println();
    }

    private void imprimirRec(Nodo actual) {
        if (actual != null) {
            imprimirRec(actual.izq);
            System.out.print(actual.valor + " ");
            imprimirRec(actual.der);
        }
    }
}