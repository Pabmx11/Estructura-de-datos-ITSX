# Estructuras Lineales: Implementación de Pilas (Stack)

Este proyecto implementa y demuestra el funcionamiento del TDA (Tipo de Dato Abstracto) **Pila** en lenguaje Java, aplicando la disciplina **LIFO** (*Last In, First Out*), mediante dos estrategias fundamentales de asignación de memoria: **Pila Estática** y **Pila Dinámica**.

---

## 1. Estructura y Diferencias Conceptuales

### Pila Estática (`PilaSimple.java`)
* **Almacenamiento contiguo en memoria**: Se implementa utilizando un arreglo unidimensional de tamaño fijo (`int[] datos = new int[5]`). Todos los elementos se almacenan en posiciones de memoria consecutivas.
* **Control mediante índice (`tope`)**: Una variable entera `tope` almacena la posición del elemento superior. Inicia en `-1` cuando la pila está vacía y se incrementa o decrementa con cada inserción o extracción.
* **Capacidad acotada y desbordamiento**: Al tener un tamaño predefinido, la estructura requiere obligatoriamente del método `isFull()` (`tope == datos.length - 1`) para evitar **desbordamiento (*overflow*)** antes de realizar un `push()`.

### Pila Dinámica (`PilaDinamica.java`)
* **Almacenamiento en nodos enlazados**: Se implementa mediante una estructura de nodos independientes (`Nodo`), cada uno conteniendo su valor (`dato`) y una referencia o enlace (`siguiente`) hacia el nodo anterior.
* **Memoria dinámica (no contigua)**: Los nodos se crean bajo demanda en el *Heap* de la memoria RAM, sin requerir direcciones de memoria contiguas.
* **Control mediante referencia (`cima`)**: Un puntero a objeto `cima` apunta directamente al nodo más reciente. Cuando la pila está vacía, su valor es `null`.
* **Capacidad flexible**: No utiliza `isFull()` debido a que el crecimiento de la estructura está delimitado únicamente por la memoria física (RAM) disponible en el entorno de ejecución.

### Cuadro Comparativo

| Característica | Pila Estática (`PilaSimple`) | Pila Dinámica (`PilaDinamica`) |
| :--- | :--- | :--- |
| **Estructura base** | Arreglo de tamaño fijo (`int[]`) | Nodos enlazados (`Nodo`) |
| **Disposición en memoria** | Bloque contiguo | Dispersa en el Heap (enlaces por referencia) |
| **Tamaño / Capacidad** | Fija (5 elementos) | Dinámica (crece y decrece bajo demanda) |
| **Control de límite** | Requiere `isFull()` (*overflow*) | No utiliza `isFull()` (limitada por RAM) |
| **Puntero de control** | Índice entero `tope` (`-1` = vacía) | Referencia a nodo `cima` (`null` = vacía) |
| **Operaciones implementadas** | `push`, `pop`, `mostrar`, `isEmpty`, `isFull`, `peek` | `push`, `pop`, `mostrar`, `isEmpty`, `peek` |

---

## 2. Instrucciones de Compilación y Ejecución

### Desde la Terminal
1. Abrir la terminal y ubicarse en el directorio del proyecto:
   ```bash
   cd /Users/pablohinojosa/IdeaProjects/Estructura-de-datos-ITSX/ESTRUCTURAS_LINEALES
   ```

2. Compilar todos los archivos fuente `.java`:
   ```bash
   javac *.java
   ```

3. Ejecutar las pruebas de la **Pila Estática**:
   ```bash
   java -cp .. Estructuras_lineales.lanzador_pilasimple
   ```

4. Ejecutar las pruebas de la **Pila Dinámica**:
   ```bash
   java -cp .. Estructuras_lineales.Main
   ```

### Desde el IDE (IntelliJ IDEA)
1. Abrir la carpeta del proyecto en IntelliJ IDEA.
2. Asegurarse de que el directorio del paquete esté reconocido como raíz de código fuente (*Sources Root*).
3. **Pila Estática**: Abrir `lanzador_pilasimple.java`, hacer clic derecho dentro del editor y seleccionar **Run 'lanzador_pilasimple.main()'** (o presionar el botón verde ▶).
4. **Pila Dinámica**: Abrir `Main.java`, hacer clic derecho dentro del editor y seleccionar **Run 'Main.main()'** (o presionar el botón verde ▶).

---

## 3. Pruebas de Ejecución con Salida por Consola

### Salida por Consola: Pila Estática (`lanzador_pilasimple`)

```text
=== PRUEBA DE PILA ESTÁTICA (PilaSimple) ===
¿La pila está vacía?: true

--- Insertando elementos (Push) ---
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30 

--- Consultando el tope (Peek) ---
Elemento en el tope: 30

--- Extrayendo elemento (Pop) ---
Sacaste: 30
Pila actual: 10 20 

--- Llenando la pila hasta el límite ---
Metiste: 40
Metiste: 50
Metiste: 60
Pila actual: 10 20 40 50 60 
¿La pila está llena?: true

--- Intento de desbordamiento (Overflow) ---
¡Pila llena!
```

### Salida por Consola: Pila Dinámica (`Main`)

```text
=== PRUEBA DE PILA DINÁMICA (PilaDinamica) ===
¿La pila está vacía?: true

--- Insertando elementos (Push) ---
Pila Dinámica (Cima -> Fondo): 30 20 10 

--- Consultando la cima (Peek) ---
Elemento en la cima: 30

--- Extrayendo elemento (Pop) ---
Sacaste de la pila: 30
Pila Dinámica (Cima -> Fondo): 20 10 

--- Vaciando la pila ---
Sacaste de la pila: 20
Sacaste de la pila: 10
Pila Dinámica (Cima -> Fondo): 
¿La pila está vacía?: true

--- Intento de subdesbordamiento (Underflow) ---
¡Pila dinámica vacía!
```
