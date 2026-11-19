# Métodos de Ordenamiento en Java

Práctica de la **Unidad 5** de la materia **Estructura de Datos (AED-1026)**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

## Integrantes (práctica de Mezcla Directa)

- Pablo Ali Hinojosa de la Hidalga
- Jorge Angel Saldaña Morales
- Rey Arturo Acosta Varela

Implementación del algoritmo de ordenamiento por **Burbuja** (Bubble Sort) visto en clase, con la optimización de bandera: si en una pasada no hay intercambios, el arreglo ya está ordenado y el algoritmo termina. El proyecto también incluye **QuickSort**, **ShellSort** y la práctica de ordenamiento externo por **Mezcla Directa**.

## Estructura del proyecto

```
Metodos_de_Ordenamiento/
├── f1.txt                          # Archivo auxiliar F1 de la Mezcla Directa
├── f2.txt                          # Archivo auxiliar F2 de la Mezcla Directa
└── src/
    └── Metodos_de_Ordenamiento/
        ├── Burbuja.java               # ordenar() e imprimirArreglo()
        ├── Main.java                  # Prueba de Burbuja
        ├── QuickSort.java             # ordenar(), particionar() e imprimirArreglo()
        ├── MainQuick.java             # Prueba de QuickSort
        ├── ShellSort.java             # ordenar() e imprimirArreglo()
        ├── MainShell.java             # Prueba de ShellSort
        └── MezclaDirectaPractica.java # intercalarBloques() y su main
```

## Requisitos

- Git
- JDK 17 o superior (`java -version` para comprobarlo)

## Clonar, compilar y ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/Pabmx11/Estructura-de-datos-ITSX.git
```

2. Entrar a la carpeta del proyecto:

```bash
cd Estructura-de-datos-ITSX/Metodos_de_Ordenamiento
```

3. Compilar:

```bash
javac -d out src/Metodos_de_Ordenamiento/*.java
```

4. Ejecutar el ordenamiento por Burbuja:

```bash
java -cp out Metodos_de_Ordenamiento.Main
```

5. Ejecutar QuickSort:

```bash
java -cp out Metodos_de_Ordenamiento.MainQuick
```

6. Ejecutar ShellSort:

```bash
java -cp out Metodos_de_Ordenamiento.MainShell
```

### Desde IntelliJ IDEA

Abrir la carpeta `Metodos_de_Ordenamiento` con *File → Open*, abrir el `Main` que se quiera probar (`Main.java`, `MainQuick.java` o `MainShell.java`) dentro de `src/Metodos_de_Ordenamiento/` y dar clic en **Run**.

## Salida esperada

Burbuja (`Main`):

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]
```

QuickSort (`MainQuick`):

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado con Quicksort:
[1, 2, 3, 4, 5, 6, 7, 8]
```

ShellSort (`MainShell`):

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado con Shellsort:
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Complejidad de Burbuja

| Caso | Tiempo |
|---|---|
| Mejor caso (arreglo ya ordenado) | O(n), gracias a la bandera |
| Caso promedio | O(n²) |
| Peor caso (arreglo en orden inverso) | O(n²) |

Ordena dentro del mismo arreglo, así que solo usa memoria extra O(1).

## QuickSort contra ShellSort

| Aspecto | QuickSort | ShellSort |
|---|---|---|
| Mejor caso | O(n log n) | O(n log n) |
| Caso promedio | O(n log n) | Depende de los saltos; en la práctica, muy por debajo de O(n²) |
| Peor caso | O(n²) (con pivote en el último elemento, ocurre con un arreglo ya ordenado) | O(n²) con los saltos n/2, n/4, …, 1 |
| Memoria extra | O(log n) en promedio por la recursión; O(n) en el peor caso | O(1) |
| Estable | No | No |

## Mezcla Directa (ordenamiento externo)

`MezclaDirectaPractica` lee dos archivos auxiliares, `f1.txt` y `f2.txt`, que traen bloques ordenados de tamaño `L`, los compara frente a frente y los intercala ordenados en `f3.txt`.

### Paso a paso en IntelliJ IDEA

1. **Clonar:** en IntelliJ, ir a *File → New → Project from Version Control*, pegar `https://github.com/Pabmx11/Estructura-de-datos-ITSX.git` y dar clic en **Clone**. También se puede clonar desde la terminal con `git clone` (ver arriba).
2. **Abrir el proyecto:** *File → Open* y elegir la carpeta `Estructura-de-datos-ITSX/Metodos_de_Ordenamiento`.
3. **Configurar el JDK:** si IntelliJ avisa que no hay SDK, ir a *File → Project Structure → Project* y elegir un JDK 17 o superior.
4. **Revisar los archivos de entrada:** `f1.txt` y `f2.txt` ya vienen en la raíz de `Metodos_de_Ordenamiento`, con un número por renglón (`45` en `f1.txt` y `12` en `f2.txt`). Deben quedarse en esa carpeta y no dentro de `src`. Si no existen, el programa muestra `Error en E/S de archivos`.
5. **Ejecutar:** abrir `src/Metodos_de_Ordenamiento/MezclaDirectaPractica.java` y dar clic en el **▶** verde junto a `main`.
6. **Ver el resultado:** el programa crea `f3.txt` en la raíz del proyecto, junto a `f1.txt` y `f2.txt`.

### Desde la terminal

Desde la carpeta `Metodos_de_Ordenamiento`, después de compilar:

```bash
java -cp out Metodos_de_Ordenamiento.MezclaDirectaPractica
```

### Salida en consola

```text
Bloque intercalado con exito!
```

### Contenido de `f3.txt`

```text
12
45
```

### Cambios al código base

Además de completar los 3 `TODO`, se agregaron dos partes, marcadas con `AGREGADO` en el código:

- Cuando se escriben completos los dos bloques de tamaño `L`, los contadores se reinician para mezclar el siguiente par de bloques.
- Al terminar el ciclo principal, se vacía lo que haya sobrado en el archivo que todavía tiene números.

Sin estos cambios, con el ejemplo de `45` y `12`, `f3.txt` quedaba solo con `12`.
