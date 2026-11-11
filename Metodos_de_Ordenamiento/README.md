# Métodos de Ordenamiento en Java

Práctica de la **Unidad 5** de la materia **Estructura de Datos (AED-1026)**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

**Alumno:** Pablo Ali Hinojosa de la Hidalga

Implementación del algoritmo de ordenamiento por **Burbuja** (Bubble Sort) visto en clase, con la optimización de bandera: si en una pasada no hay intercambios, el arreglo ya está ordenado y el algoritmo termina. El proyecto también incluye **QuickSort**.

## Estructura del proyecto

```
src/
└── Metodos_de_Ordenamiento/
    ├── Burbuja.java     # ordenar() e imprimirArreglo()
    ├── Main.java        # Prueba de Burbuja
    ├── QuickSort.java   # ordenar(), particionar() e imprimirArreglo()
    └── MainQuick.java   # Prueba de QuickSort
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

5. (Opcional) Ejecutar QuickSort:

```bash
java -cp out Metodos_de_Ordenamiento.MainQuick
```

### Desde IntelliJ IDEA

Abrir la carpeta `Metodos_de_Ordenamiento` con *File → Open*, abrir `src/Metodos_de_Ordenamiento/Main.java` y dar clic en **Run**.

## Salida esperada

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Complejidad de Burbuja

| Caso | Tiempo |
|---|---|
| Mejor caso (arreglo ya ordenado) | O(n), gracias a la bandera |
| Caso promedio | O(n²) |
| Peor caso (arreglo en orden inverso) | O(n²) |

Ordena dentro del mismo arreglo, así que solo usa memoria extra O(1).
