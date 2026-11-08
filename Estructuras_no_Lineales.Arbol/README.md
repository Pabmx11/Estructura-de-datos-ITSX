# Árbol Binario de Búsqueda en Java

Práctica realizada en clase de la materia **Estructura de Datos** (Estructuras no lineales)
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

**Alumno:** Pablo Ali Hinojosa de la Hidalga

Implementación de un **árbol binario de búsqueda (ABB)** con inserción, búsqueda, eliminación y recorrido InOrder, todo de forma recursiva.

---

## Estructura del proyecto

```
src/
└── Estructuras_No_Lineales/
    └── Arbol/
        ├── Nodo.java                   # Nodo: valor + hijo izquierdo + hijo derecho
        ├── ArbolBinarioBusqueda.java   # Operaciones del árbol
        └── Main.java                   # Prueba: inserta y elimina valores
```

---

## Operaciones implementadas

| Operación | Método | Descripción |
|---|---|---|
| Insertar | `insertar(int)` | Baja por la izquierda si el valor es menor y por la derecha si es mayor. Ignora valores repetidos. |
| Buscar | `buscar(int)` | Regresa `true` si el valor está en el árbol. |
| Eliminar | `eliminar(int)` | Cubre los tres casos: nodo hoja, nodo con un hijo y nodo con dos hijos (lo reemplaza por el mínimo del subárbol derecho). |
| Recorrer | `imprimirInOrder()` | Imprime izquierda → raíz → derecha, que muestra los valores ordenados. |

---

## Compilación y ejecución

Requisitos: Java JDK 17 o superior (probado con OpenJDK 26).

### Desde la terminal

Desde la carpeta `Estructuras_no_Lineales.Arbol`:

```bash
javac -d out $(find src -name "*.java")
java -cp out Estructuras_No_Lineales.Arbol.Main
```

### Desde IntelliJ IDEA

Abrir la carpeta `Estructuras_no_Lineales.Arbol` como proyecto y ejecutar `Main.java`.

---

## Salida esperada

```
Árbol original (InOrder): 20 30 40 50 70

Eliminando el 20 (sin hijos)...
Árbol actualizado: 30 40 50 70

Eliminando el 30 (con 1 hijo)...
Arbol actualizado final: 40 50 70
```
