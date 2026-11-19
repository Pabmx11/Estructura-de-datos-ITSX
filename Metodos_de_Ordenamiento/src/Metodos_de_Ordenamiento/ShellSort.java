package Metodos_de_Ordenamiento;

/**
 * Clase que implementa el algoritmo de ordenamiento Shellsort.
 * Es una optimizacion del ordenamiento por insercion que compara elementos
 * separados por intervalos (gaps) mayores a uno, reduciendolos progresivamente.
 */
public class ShellSort {

    /**
     * Ordena un arreglo de enteros de forma ascendente usando Shellsort.
     */
    public static void ordenar(int[] arr) {
        int n = arr.length;

        // 1. Reduccion del salto: Empieza en n/2 y se divide entre 2 en cada vuelta hasta ser 0
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            // 2. Recorrido tipo insercion pero saltando segun el 'intervalo' actual
            for (int i = intervalo; i < n; i++) {
                int temp = arr[i]; // Elemento que vamos a acomodar
                int j = i;

                // ========================================================
                // TODO: Los alumnos deben completar el ciclo while de desplazamiento
                // utilizando el 'intervalo' correspondiente para comparar y mover elementos.
                // ========================================================
                while (j >= intervalo && arr[j - intervalo] > temp) {
                    // Escribir la logica de intercambio por saltos
                    arr[j] = arr[j - intervalo]; // Recorremos el elemento mayor 'intervalo' posiciones adelante
                    j -= intervalo;              // Saltamos hacia atras para seguir comparando
                }

                // Insertamos el valor temporal en el hueco que quedo libre
                arr[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
