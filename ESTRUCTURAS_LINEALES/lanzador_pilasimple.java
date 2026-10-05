package Estructuras_lineales;

public class lanzador_pilasimple {
    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();

        p.pop(); // Saca el 30
        p.mostrar();
    }
}
