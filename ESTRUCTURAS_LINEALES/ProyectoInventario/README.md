# Sistema de Control de Inventario con Árbol Binario de Búsqueda

Proyecto Integrador de la materia **Estructura de Datos**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

## Integrantes

- Pablo Ali Hinojosa de la Hidalga
- Jorge Angel Saldaña Morales
- Mariem Cristina Garcia Lopez

## Descripción

Aplicación de consola en Java que simula el control de mercancía de un almacén. Cada producto se guarda como un nodo de un Árbol Binario de Búsqueda (ABB), ordenado alfabéticamente por su nombre: los nombres que van antes en el alfabeto quedan a la izquierda y los que van después, a la derecha.

## Estructura del proyecto

```
src/
└── Estructuras_No_Lineales/
    └── Inventario/
        ├── Producto.java               # Nodo: nombre, stock, precio, izq, der
        ├── ArbolBinarioBusqueda.java   # Inserción, búsqueda, eliminación e InOrder
        └── Main.java                   # Menú interactivo con Scanner
```

## Cómo ejecutar

### Desde IntelliJ IDEA

Abrir la carpeta `ProyectoInventario` como proyecto, ir a `Main.java` y dar clic en **Run**.

### Desde la terminal

Desde la carpeta `ProyectoInventario`:

```bash
javac -d out src/Estructuras_No_Lineales/Inventario/*.java
```

```bash
java -cp out Estructuras_No_Lineales.Inventario.Main
```

## Menú

```
a) Registrar nuevo producto
b) Buscar producto por nombre
c) Dar de baja producto
d) Mostrar inventario completo
e) Salir
```

## Adaptación del ABB a cadenas

Los números del ABB visto en clase se comparaban con `<` y `>`. Con nombres se usa `compareTo()`:

| Resultado de `nombre.compareTo(actual.nombre)` | Significado | Acción |
|---|---|---|
| Menor que 0 | El nombre va antes en el alfabeto | Ir a la rama izquierda |
| Mayor que 0 | El nombre va después en el alfabeto | Ir a la rama derecha |
| Igual a 0 | Es el mismo producto | Encontrado, o duplicado que no se inserta |

`compareTo()` distingue mayúsculas de minúsculas, así que el menú normaliza cada nombre antes de usarlo: `  aRROZ   integral ` se convierte en `Arroz Integral`. De esta forma, `arroz` y `Arroz` son el mismo producto.

## Eliminación

| Caso | Qué se hace |
|---|---|
| Nodo hoja | Se quita el nodo |
| Nodo con un hijo | El hijo toma su lugar |
| Nodo con dos hijos | Se copian `nombre`, `stock` y `precio` del sucesor inorden (el menor de la rama derecha) y después se elimina el sucesor |

## Complejidad

Insertar, buscar y eliminar son O(log n) cuando el árbol está balanceado. Como este ABB no se balancea solo, en el peor caso, por ejemplo al registrar los productos en orden alfabético, son O(n).

## Limitaciones

`compareTo()` ordena según el código Unicode de cada letra, así que los nombres que empiezan con vocal acentuada o con `Ñ` aparecen después de la `Z`.
