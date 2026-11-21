# Métodos de Búsqueda en Java

Prácticas en clase de la **Unidad 6: Métodos de Búsqueda** de la materia **Estructura de Datos (AED-1026)**
Instituto Tecnológico Superior de Xalapa · Docente: Víctor Hugo Vásquez Herrera

## Integrantes

- Pablo Ali Hinojosa de la Hidalga
- Jorge Angel Saldaña Morales
- Rey Arturo Acosta Varela

## Descripción

Implementación de los dos métodos de búsqueda vistos en clase:

- **Búsqueda Secuencial** (`PracticaBusquedaSecuencial`): recorre el arreglo elemento por elemento hasta encontrar la clave. Funciona con arreglos ordenados o desordenados.
- **Búsqueda Binaria** (`PracticaBusquedaBinaria`): sobre un arreglo **ordenado**, compara la clave con el elemento del medio y descarta la mitad donde no puede estar, hasta encontrarla o quedarse sin elementos.

Los dos métodos regresan el índice donde está la clave, o `-1` si no existe en el arreglo.

## Estructura del proyecto

```
Metodos_de_Busqueda/
└── src/
    └── Metodos_de_Busqueda/
        ├── PracticaBusquedaSecuencial.java   # busquedaSecuencial() y su main
        └── PracticaBusquedaBinaria.java      # busquedaBinaria() y su main
```

## Requisitos

- Git
- JDK 17 o superior (`java -version` para comprobarlo)

## Compilar y ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/Pabmx11/Estructura-de-datos-ITSX.git
```

2. Entrar a la carpeta del proyecto:

```bash
cd Estructura-de-datos-ITSX/Metodos_de_Busqueda
```

3. Compilar:

```bash
javac -d out src/Metodos_de_Busqueda/*.java
```

4. Ejecutar la Búsqueda Secuencial:

```bash
java -cp out Metodos_de_Busqueda.PracticaBusquedaSecuencial
```

5. Ejecutar la Búsqueda Binaria:

```bash
java -cp out Metodos_de_Busqueda.PracticaBusquedaBinaria
```

### Desde IntelliJ IDEA

1. Abrir la carpeta `Metodos_de_Busqueda` con *File → Open*.
2. Si IntelliJ avisa que no hay SDK, elegir un JDK 17 o superior en *File → Project Structure → Project*.
3. Abrir `PracticaBusquedaSecuencial.java` o `PracticaBusquedaBinaria.java` dentro de `src/Metodos_de_Busqueda/` y dar clic en el **▶** verde junto a `main`.

## Salida en consola

Búsqueda Secuencial, con `calificaciones = {78, 92, 65, 88, 95, 70}`:

```text
Posicion de 88: 3
Posicion de 100: -1
```

Búsqueda Binaria, con `folios = {102, 115, 128, 140, 156, 173, 190, 205}`:

```text
Indice de 173: 5
Indice de 130: -1
```

## Comparación

| Aspecto | Búsqueda Secuencial | Búsqueda Binaria |
|---|---|---|
| Requisito | Ninguno | El arreglo debe estar ordenado |
| Mejor caso | O(1): la clave es el primer elemento | O(1): la clave está justo en el medio |
| Caso promedio | O(n) | O(log n) |
| Peor caso | O(n): la clave es el último elemento o no existe | O(log n) |
| Si no existe | Revisa los n elementos y regresa -1 | Termina cuando `izq > der` y regresa -1 |
