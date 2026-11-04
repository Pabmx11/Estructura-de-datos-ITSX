package Estructuras_No_Lineales.Inventario;

import java.util.Locale;

public class Producto {
    String nombre;
    int stock;
    double precio;
    Producto izq;
    Producto der;

    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.izq = null;
        this.der = null;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%-25s %8d %12.2f", nombre, stock, precio);
    }
}
