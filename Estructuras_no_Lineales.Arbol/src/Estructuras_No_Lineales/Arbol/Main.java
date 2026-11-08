package Estructuras_No_Lineales.Arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);

        System.out.print("Árbol original (InOrder): ");
        arbol.imprimirInOrder();

        System.out.println("\nEliminando el 20 (sin hijos)...");
        arbol.eliminar(20);

        System.out.print("Árbol actualizado: ");
        arbol.imprimirInOrder();

        System.out.println("\nEliminando el 30 (con 1 hijo)...");
        arbol.eliminar(30);

        System.out.print("Arbol actualizado final: ");
        arbol.imprimirInOrder();

    }
}

