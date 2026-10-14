# Colas en Java: Estática, Circular y Dinámica

Práctica de la **Unidad 3 – Tarea 2** de la materia **Estructura de Datos**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

**Alumno:** Pablo Hinojosa 

Implementación modular de tres tipos de cola en Java. Cada estructura tiene su propia clase **y su propio `Main` independiente** que la prueba en consola.

---

## Estructura del proyecto

```
src/
└── estructuras_lineales/
    ├── Nodo.java                       # Nodo enlazado (reutilizado de la práctica de Pilas)
    └── COLA/
        ├── ColaEstatica.java           # Cola lineal sobre arreglo
        ├── ColaEstaticaCircular.java   # Cola circular sobre arreglo
        ├── ColaDinamica.java           # Cola con nodos enlazados
        │
        ├── MainColaEsta.java           # Main → prueba de la cola estática
        ├── MainColaCir.java            # Main → prueba de la cola circular
        └── MainColaDin.java            # Main → prueba de la cola dinámica
```

### Separación de los `Main`

| Estructura | Clase | Main independiente |
|---|---|---|
| Cola estática lineal | `ColaEstatica` | `MainColaEsta` |
| Cola estática circular | `ColaEstaticaCircular` | `MainColaCir` |
| Cola dinámica | `ColaDinamica` (usa `Nodo`) | `MainColaDin` |

---

## Operaciones implementadas

| Operación | `ColaEstatica` | `ColaEstaticaCircular` | `ColaDinamica` |
|---|---|---|---|
| Insertar al final | `enqueue(int)` | `enqueue(int)` | `encolar(int)` |
| Sacar del frente | `dequeue()` | `dequeue()` | `desencolar()` |
| Consultar el frente sin sacarlo | `peek()` | `peek()` | `peek()` |
| Mostrar la fila | `mostrar()` | `mostrar()` | `mostrar()` |
| ¿Está vacía? | — | — | `estaVacia()` |
| Contar elementos (recorrido) | — | — | `contarElementos()` |

`peek()` devuelve `-1` y muestra un mensaje de error cuando la cola está vacía.

---

## Cómo ejecutar

### Desde IntelliJ IDEA
Abrir el proyecto, ir a cualquiera de los tres `Main` dentro de `src/estructuras_lineales/COLA/` y dar clic en **Run**.

### Desde la terminal
Desde la raíz del proyecto:

```bash
javac -d out src/estructuras_lineales/*.java src/estructuras_lineales/COLA/*.java
```

```bash
java -cp out estructuras_lineales.COLA.MainColaEsta
```

```bash
java -cp out estructuras_lineales.COLA.MainColaCir
```

```bash
java -cp out estructuras_lineales.COLA.MainColaDin
```

---

## Comparación de las tres colas

| Aspecto | Estática lineal | Estática circular | Dinámica |
|---|---|---|---|
| **Memoria** | Arreglo de tamaño fijo reservado al crearla | Arreglo de tamaño fijo reservado al crearla | Un nodo por elemento, se reserva memoria solo al encolar |
| **Capacidad** | Fija. Los lugares liberados por `dequeue` **no se reutilizan**: puede marcar “llena” aunque tenga espacios vacíos | Fija, pero **reutiliza** los lugares liberados gracias al índice `% capacidad` | Sin límite fijo (solo la memoria disponible) |
| **Apuntadores** | `frente` y `fin` solo avanzan | `frente` y `fin` dan la vuelta al arreglo; `tamaño` lleva la cuenta | Referencias `frente` y `fin` a nodos |
| **Ventajas** | La más sencilla de implementar | Aprovecha todo el arreglo sin mover elementos; operaciones O(1) | Crece y se reduce según se necesite; operaciones O(1) |
| **Desventajas** | Desperdicia espacio; se “agota” con el uso | Hay que fijar la capacidad desde el inicio | Cada nodo usa memoria extra para la referencia `siguiente`; `contarElementos()` es O(n) |
