package Metodos_de_Busqueda;

public class PracticaBusquedaSecuencial {

    public static int busquedaSecuencial(int[] arr, int clave) {

        // TODO 1: Completa la condicion del ciclo para recorrer todo el arreglo
        for (int i = 0; i < arr.length; i++) {

            // TODO 2: Compara el elemento actual con la clave buscada
            if (arr[i] == clave) {
                // TODO 3: Que indice debes regresar si lo encontraste?
                return i;
            }
        }

        // TODO 4: Que valor se regresa cuando el elemento NO esta en el arreglo?
        return -1;
    }

    public static void main(String[] args) {
        int[] calificaciones = {78, 92, 65, 88, 95, 70};

        int pos1 = busquedaSecuencial(calificaciones, 88);  // Esperado: 3
        int pos2 = busquedaSecuencial(calificaciones, 100); // Esperado: -1

        System.out.println("Posicion de 88: " + pos1);
        System.out.println("Posicion de 100: " + pos2);
    }
}
