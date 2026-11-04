package Estructuras_No_Lineales.Inventario;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static final Scanner entrada = new Scanner(System.in);
    private static final ArbolBinarioBusqueda inventario = new ArbolBinarioBusqueda();

    public static void main(String[] args) {
        boolean continuar = true;

        try {
            while (continuar) {
                mostrarMenu();

                switch (entrada.nextLine().trim().toLowerCase()) {
                    case "a" -> registrarProducto();
                    case "b" -> buscarProducto();
                    case "c" -> eliminarProducto();
                    case "d" -> mostrarInventario();
                    case "e" -> continuar = false;
                    default -> System.out.println("Opción no válida. Elige una letra de la a a la e.");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("\nNo hay más datos de entrada.");
        }

        System.out.println("Saliendo del sistema de inventario.");
    }

    private static void mostrarMenu() {
        System.out.println("\n===== CONTROL DE INVENTARIO =====");
        System.out.println("a) Registrar nuevo producto");
        System.out.println("b) Buscar producto por nombre");
        System.out.println("c) Dar de baja producto");
        System.out.println("d) Mostrar inventario completo");
        System.out.println("e) Salir");
        System.out.print("Elige una opción: ");
    }

    private static void registrarProducto() {
        String nombre = leerNombre();

        if (inventario.buscar(nombre) != null) {
            System.out.println("El producto " + nombre + " ya existe.");
            return;
        }

        int stock = leerStock();
        double precio = leerPrecio();

        inventario.insertar(nombre, stock, precio);
        System.out.println("Producto " + nombre + " registrado.");
    }

    private static void buscarProducto() {
        String nombre = leerNombre();
        Producto producto = inventario.buscar(nombre);

        if (producto == null) {
            System.out.println("El producto " + nombre + " no existe.");
            return;
        }

        mostrarEncabezado();
        System.out.println(producto);
    }

    private static void eliminarProducto() {
        String nombre = leerNombre();

        if (inventario.buscar(nombre) == null) {
            System.out.println("El producto " + nombre + " no existe.");
            return;
        }

        inventario.eliminar(nombre);
        System.out.println("Producto " + nombre + " dado de baja.");
    }

    private static void mostrarInventario() {
        if (inventario.estaVacio()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        mostrarEncabezado();
        inventario.imprimirInOrder();
    }

    private static void mostrarEncabezado() {
        System.out.printf("%-25s %8s %12s%n", "Nombre", "Stock", "Precio");
    }

    private static String leerNombre() {
        while (true) {
            System.out.print("Nombre del producto: ");
            String nombre = entrada.nextLine();

            if (!nombre.isBlank()) {
                return normalizarNombre(nombre);
            }
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    private static String normalizarNombre(String nombre) {
        String[] palabras = nombre.trim().toLowerCase().split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = Character.toUpperCase(palabras[i].charAt(0)) + palabras[i].substring(1);
        }

        return String.join(" ", palabras);
    }

    private static int leerStock() {
        while (true) {
            System.out.print("Stock: ");

            try {
                int stock = Integer.parseInt(entrada.nextLine().trim());

                if (stock >= 0) {
                    return stock;
                }
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número entero.");
                continue;
            }
            System.out.println("El stock no puede ser negativo.");
        }
    }

    private static double leerPrecio() {
        while (true) {
            System.out.print("Precio: ");

            try {
                double precio = Double.parseDouble(entrada.nextLine().trim());

                if (Double.isFinite(precio) && precio >= 0) {
                    return precio;
                }
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número, usando punto para los decimales.");
                continue;
            }
            System.out.println("El precio debe ser un número mayor o igual a 0.");
        }
    }
}
