package Metodos_de_Ordenamiento;

public class MainQuick {
    public static void main(String[] args) {
        int[] arreglo = {6,1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        QuickSort.imprimirArreglo(arreglo);

        QuickSort.ordenar(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado con Quicksort:");
        QuickSort.imprimirArreglo(arreglo);
    }
}
