# Demo Programación: Uso ficheros en Java

Este repositorio contiene el código fuente desarrollado durante la videoconferencia de la asignatura de **Programación** del día **16 de Marzo**. El objetivo principal fue implementar un sistema de gestión de vehículos con persistencia de datos en diferentes formatos.

---

## 🚀 Conceptos Trabajados

### 1. Persistencia de Información
Se han implementado dos estrategias para el almacenamiento y recuperación de datos desde una aplicación Java:
* **Ficheros de Texto (`.txt`):** Uso de `PrintWriter` y `Scanner` para guardar datos legibles por humanos (formato .txt).
* **Ficheros de Bytes/Objetos (`.dat`):** Uso de `ObjectOutputStream` y `ObjectInputStream` para almacenar el estado completo de los objetos en ficheros de bytes.

### 2. Modelo de Datos: Clase `Car`
* Gestión de atributos específicos: `brand`, `model`, `seats` y `plate`.
* **`implements Serializable`**: Implementación de esta interfaz para permitir que Java transforme las instancias de la clase en secuencias de bytes persistentes.

### 3. Gestión de Excepciones
* **Bloques `try-catch`**: Manejo controlado de errores de entrada/salida (`IOException`) y errores de formato de datos.
* **Try-with-resources (AutoCloseable)**: Uso de esta estructura para asegurar el cierre automático de los flujos de datos (*streams*), garantizando la integridad de los archivos y evitando fugas de memoria.

### 4. Programación Modular (Clase Utils)
* Se ha seguido un diseño modular delegando la lógica de lectura y escritura en la clase **`Files`** mediante métodos **static**. Esto permite una separación clara entre la interfaz de usuario y la lógica de acceso a datos.

---

## 📂 Estructura del Proyecto y Workspace

Los archivos de datos se generan y consultan directamente en la **raíz del workspace** del proyecto para facilitar su localización:

| Archivo | Ubicación | Función                                            |
| :--- | :--- |:---------------------------------------------------|
| **`Car.java`** | `/src` | Clase de modelo serializable.                      |
| **`Files.java`** | `/src` | Clase de utilidades (Persistencia).                |
| **`Utils.java`** | `/src` | Clase de apoyo para la entrada por consola.        |
| **`Main.java`** | `/src` | Clase principal con menú interactivo.              |
| **`cars.txt`** | **`/ (Root)`** | Persistencia en texto plano (en el workspace).     |
| **`cars.dat`** | **`/ (Root)`** | Persistencia binaria de objetos (en el workspace). |


---
> **Nota:** Este contenido corresponde a la sesión práctica realizada el **16 de Marzo** para la asignatura de Programación.