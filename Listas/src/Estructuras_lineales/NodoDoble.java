package Estructuras_lineales;

/**
 * Representa un nodo para una Lista Doblemente Enlazada.
 * A diferencia de la lista simple, este nodo tiene dos apuntadores:
 * uno hacia adelante (siguiente) y otro hacia atrás (anterior).
 */
public class NodoDoble {
    public int dato;             // El valor numérico almacenado en el nodo
    public NodoDoble siguiente;  // Apuntador al nodo de adelante
    public NodoDoble anterior;   // Apuntador al nodo de atrás

    // Constructor para inicializar el nodo con un valor
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null; // Al crearse, no apunta a nadie adelante
        this.anterior = null;  // Al crearse, no apunta a nadie atrás
    }
}