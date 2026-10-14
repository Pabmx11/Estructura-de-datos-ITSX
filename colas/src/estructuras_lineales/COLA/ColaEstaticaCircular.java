package estructuras_lineales.COLA;

public class ColaEstaticaCircular {
    private int[] arreglo;
    private int capacidad;
    private int frente;
    private int fin;

    private int tamaño;

    public ColaEstaticaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;
    }

    public void enqueue(int valor) {
        if (tamaño == capacidad) {

            System.out.println("Error, la cola está llena.");
            return;
        }

        fin = (fin + 1) % capacidad;

        arreglo[fin] = valor;

        tamaño++;

        System.out.println("Entro a la fila: " + valor);
    }

    public int dequeue() {
        if (tamaño == 0) {
            System.out.println("Error: La cola está vacia");
            return -1;
        }

        int atendido = arreglo[frente];
        frente = (frente + 1) % capacidad;

        tamaño--;

        System.out.println("Atendido y fuera: " + atendido);
        return atendido;
    }

    public int peek() {
        if (tamaño == 0) {
            System.out.println("Error: La cola está vacia");
            return -1;
        }

        return arreglo[frente];
    }

    public void mostrar() {
        if (tamaño == 0) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.print("Fila actual: ");
        for (int i = 0; i < tamaño; i++) {
            int indice = (frente + i) % capacidad;
            System.out.print(arreglo[indice] + " ");
        }
        System.out.println();
    }
}
