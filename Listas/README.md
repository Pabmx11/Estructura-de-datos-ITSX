# Listas en Java: Lista Simple y Lista Doble

Práctica de la **Unidad 3 – Tarea 3** de la materia **Estructura de Datos**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

**Alumno:** Pablo Ali Hinojosa de la Hidalga

Análisis comparativo entre una **lista simplemente enlazada** (desarrollada en clase) y una **lista doblemente enlazada** (tomada del [repositorio de la materia](https://github.com/victorvasher/Estructura-de-datos-ITSX/tree/main/ESTRUCTURAS_LINEALES/Listas)). Cada lista tiene su propio `Main` independiente.

---

## Estructura del proyecto

```
src/
└── Estructuras_lineales/
    ├── Nodo.java              # Nodo simple: dato + siguiente
    ├── NodoDoble.java         # Nodo doble: anterior + dato + siguiente   (código del docente)
    └── LISTAS/
        ├── ListaSimple.java   # Lista simplemente enlazada
        ├── ListaMain.java     # Main → prueba de la lista simple
        ├── ListaDoble.java    # Lista doblemente enlazada                 (código del docente)
        └── MainDoble.java     # Main → prueba de la lista doble           (código del docente)
```

| Estructura | Clase | Nodo | Main independiente |
|---|---|---|---|
| Lista simple | `ListaSimple` | `Nodo` | `ListaMain` |
| Lista doble | `ListaDoble` | `NodoDoble` | `MainDoble` |

> ⚠️ Las primeras líneas de cada archivo deben coincidir con su carpeta:
> `Nodo` y `NodoDoble` usan `package Estructuras_lineales;`, y las clases de `LISTAS/` usan
> `package Estructuras_lineales.LISTAS;` con su `import Estructuras_lineales.Nodo;` o `import Estructuras_lineales.NodoDoble;`.

---

## Operaciones implementadas

| Operación | `ListaSimple` | `ListaDoble` |
|---|---|---|
| ¿Está vacía? | `estaVacia()` | `estaVacia()` |
| Insertar al inicio | `insertarAlInicio(int)` | `insertarAlInicio(int)` |
| Insertar al final | `insertarAlFin(int)` | `insertarAlFinal(int)` |
| Mostrar hacia adelante | `mostrar()` | `mostrarAdelante()` |
| Mostrar hacia atrás | — | `mostrarAtras()` |
| Buscar un valor | `buscar(int)` | `buscar(int)` |
| Eliminar un valor | `eliminar(int)` | `eliminar(int)` |

---

## Cómo ejecutar

### Desde IntelliJ IDEA
Abrir la carpeta `Listas` como proyecto, ir a `ListaMain` o `MainDoble` dentro de `src/Estructuras_lineales/LISTAS/` y dar clic en **Run**.

### Desde la terminal
Desde la carpeta `Listas`:

```bash
javac -d out src/Estructuras_lineales/*.java src/Estructuras_lineales/LISTAS/*.java
```

```bash
java -cp out Estructuras_lineales.LISTAS.ListaMain
```

```bash
java -cp out Estructuras_lineales.LISTAS.MainDoble
```

---

## Salida en consola

### Lista simple (`ListaMain`)

```text
¿La lista está vacia? true
Lista: [5] ->[10] ->[20] ->[30] ->null
¿El 20 está en la lista? true
¿El 99 está en la lista? false

Eliminado el numero 20 (del centro)...
Lista: [5] ->[10] ->[30] ->null
```

### Lista doble (`MainDoble`)

```text
--- PRUEBA DE INSERCIONES ---
Lista (Adelante): null <- [5] <-> [10] <-> [20] <-> [30] -> null
Lista (Atrás): null <- [30] <-> [20] <-> [10] <-> [5] -> null

--- PRUEBA DE BÚSQUEDA ---
¿El 20 está en la lista? true
¿El 99 está en la lista? false

--- PRUEBA DE ELIMINACIÓN (Elemento del medio: 20) ---
Lista (Adelante): null <- [5] <-> [10] <-> [30] -> null
Lista (Atrás): null <- [30] <-> [10] <-> [5] -> null
```

---

## Comparación

| Aspecto | Lista simple | Lista doble |
|---|---|---|
| **Nodo** | `dato` + `siguiente` | `anterior` + `dato` + `siguiente` |
| **Memoria** | 1 referencia por nodo | 2 referencias por nodo (más memoria) |
| **Apuntadores de la lista** | `cabeza` | `cabeza` y `cola` |
| **Insertar al final** | O(n): recorre hasta el último nodo | O(1): usa `cola` directamente |
| **Recorrido** | Solo hacia adelante | Hacia adelante y hacia atrás |
| **Eliminar** | Debe detenerse en el nodo *anterior* al que se elimina | Busca el nodo mismo y reconecta a sus dos vecinos |
| **Ventajas** | Menos memoria, código más sencillo | Navegación en ambos sentidos, operaciones en los extremos más rápidas |
| **Desventajas** | Solo avanza; operaciones al final son O(n) | Más memoria y más enlaces que mantener en cada operación |
| **Uso ideal** | Pilas, colas sencillas, recorridos de inicio a fin | Historial atrás/adelante, listas de reproducción, deshacer/rehacer |
