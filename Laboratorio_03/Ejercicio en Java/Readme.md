### README Laboratorio 3 Ejercicio de simulación de universidad en Java

---

### Descripción
Proyecto de laboratorio que implementa una simulación básica de una universidad en Java con clases que modelan personas, cursos, horarios, profesores, estudiantes y generación de reportes.

---

### Estructura del proyecto y clases clave
- **Archivo Curso.java**: representa un curso y sus atributos.  
- **Archivo Estudiante.java**: representa a un estudiante y sus operaciones.  
- **Archivo Horario.java**: modela horarios asociados a cursos o personas.  
- **Archivo Main.java**: clase ejecutable que inicia la simulación.  
- **Archivo Persona.java**: clase base para entidades humanas en la simulación.  
- **Archivo Profesor.java**: representa a un profesor con sus atributos.  
- **Archivo Reporte.java**: genera reportes sobre el estado o estadísticas de la simulación.  
- **Archivo Universidad.java**: orquesta la entidad universidad y las relaciones entre objetos.  
Todos los archivos mencionados están en el directorio del Laboratorio 03 del repositorio mostrado.

---

### Requisitos
- **JDK** instalado (Java 11 o superior recomendado).  
- Entorno de línea de comandos o IDE Java (Eclipse, IntelliJ, VS Code).

---

### Compilar y ejecutar
1. Compilar todos los archivos Java desde la raíz del paquete donde se encuentran:
```bash
javac *.java
```
2. Ejecutar la clase principal:
```bash
java Main
```
Los comandos anteriores asumen que los archivos fuente están en un mismo directorio sin paquete declarado. Ajustar rutas o nombres de paquete si fuera necesario.

---

### Casos de prueba y salida esperada
- **Ejecución básica**: la ejecución de Main debe crear instancias de universidad, cursos, profesores y estudiantes, asignar horarios y producir salidas por consola o un reporte mediante la clase Reporte.  
- **Verificaciones recomendadas**: validación de asignación de estudiantes a cursos, consistencia de horarios y generación correcta de informes por Reporte.

---
