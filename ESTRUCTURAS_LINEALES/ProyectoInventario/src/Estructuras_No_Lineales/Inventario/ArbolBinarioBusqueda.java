package Estructuras_No_Lineales.Inventario;

public class ArbolBinarioBusqueda {
    private Producto raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void insertar(String nombre, int stock, double precio) {
        this.raiz = insertarRecursivo(this.raiz, nombre, stock, precio);
    }

    private Producto insertarRecursivo(Producto actual, String nombre, int stock, double precio) {
        if (actual == null) {
            return new Producto(nombre, stock, precio);
        }

        int comparacion = nombre.compareTo(actual.nombre);

        if (comparacion < 0) {
            actual.izq = insertarRecursivo(actual.izq, nombre, stock, precio);
        } else if (comparacion > 0) {
            actual.der = insertarRecursivo(actual.der, nombre, stock, precio);
        }

        return actual;
    }

    public Producto buscar(String nombre) {
        return buscarRecursivo(this.raiz, nombre);
    }

    private Producto buscarRecursivo(Producto actual, String nombre) {
        if (actual == null) {
            return null;
        }

        int comparacion = nombre.compareTo(actual.nombre);

        if (comparacion == 0) {
            return actual;
        }

        if (comparacion < 0) {
            return buscarRecursivo(actual.izq, nombre);
        }

        return buscarRecursivo(actual.der, nombre);
    }

    public void eliminar(String nombre) {
        this.raiz = eliminarRecursivo(this.raiz, nombre);
    }

    private Producto eliminarRecursivo(Producto actual, String nombre) {
        if (actual == null) {
            return null;
        }

        int comparacion = nombre.compareTo(actual.nombre);

        if (comparacion < 0) {
            actual.izq = eliminarRecursivo(actual.izq, nombre);
        } else if (comparacion > 0) {
            actual.der = eliminarRecursivo(actual.der, nombre);
        } else {
            // Caso 1: nodo hoja
            if (actual.izq == null && actual.der == null) {
                return null;
            }

            // Caso 2: nodo con un hijo
            if (actual.izq == null) {
                return actual.der;
            }
            if (actual.der == null) {
                return actual.izq;
            }

            // Caso 3: nodo con dos hijos, se reemplaza con su sucesor inorden
            Producto sucesor = obtenerMinimo(actual.der);

            actual.nombre = sucesor.nombre;
            actual.stock = sucesor.stock;
            actual.precio = sucesor.precio;

            actual.der = eliminarRecursivo(actual.der, sucesor.nombre);
        }

        return actual;
    }

    private Producto obtenerMinimo(Producto actual) {
        while (actual.izq != null) {
            actual = actual.izq;
        }
        return actual;
    }

    public void imprimirInOrder() {
        imprimirRec(this.raiz);
    }

    private void imprimirRec(Producto actual) {
        if (actual != null) {
            imprimirRec(actual.izq);
            System.out.println(actual);
            imprimirRec(actual.der);
        }
    }
}
