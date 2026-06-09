# 🧠 Actividad Sumativa 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

**Nombre completo:** Sandra Mamani
**Carrera:** Analista programador
**Sede:** Online/virtual

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Actividad Sumativa 1 de la asignatura Desarrollo Orientado a Objetos I. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar las personas vinculadas a la agencia de turismo Llanquihue Tour, aplicando principios fundamentales de la programación orientada a objetos como encapsulamiento, composición, herencia y manejo de excepciones.

El proyecto fue desarrollado a partir de un caso contextualizado basado en una agencia de turismo ubicada en la Región de Los Lagos. Para ello, se diseñó un conjunto de clases que representan entidades como personas, empleados y clientes, permitiendo organizar la información de manera estructurada y reutilizable.



---

## 🧱 Estructura general del proyecto

📁 src/
├── app/         # Clase principal con el método main
├── model/       # Clases del dominio del problema
│   ├── Persona.java
│   ├── Empleado.java
│   ├── Cliente.java
│   ├── Direccion.java
│   └── Rut.java
└── exception/   # Excepciones personalizadas
    └── RutInvalidoException.java
```

---

## 🏛️ Clases principales

### Persona

Clase base del sistema que representa a cualquier persona vinculada a la organización.

**Atributos:**

* Rut rut
* String nombre
* String telefono
* String correo
* Direccion direccion
* int edad

### Empleado

Hereda de Persona y representa a los trabajadores de la agencia.

**Atributos adicionales:**

* String cargo
* double sueldo
* String fechaContratacion

### Cliente

Hereda de Persona y representa a los clientes de la agencia.

**Atributos adicionales:**

* int idCliente
* String pasaporte

### Direccion

Representa la dirección física de una persona.

**Atributos:**

* String calle
* int numero
* String ciudad
* String region

### Rut

Clase encargada de almacenar y validar el formato del RUT.

### RutInvalidoException

Excepción personalizada utilizada cuando se ingresa un RUT con formato incorrecto.

---

## 🔍 Conceptos de Programación Orientada a Objetos Aplicados

### Encapsulamiento

Todos los atributos fueron declarados como privados y se accede a ellos mediante métodos getter y setter.

### Herencia

Las clases Empleado y Cliente heredan de la clase Persona.

### Composición

La clase Persona está compuesta por objetos de tipo Rut y Direccion.

### Sobrescritura de métodos

Se sobrescriben métodos como mostrarInformacion() y toString() en las clases derivadas.

### Manejo de excepciones

Se implementó la excepción personalizada RutInvalidoException para validar el ingreso correcto del RUT.

---

## ⚙️ Instrucciones para ejecutar el proyecto

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en NetBeans o IntelliJ IDEA.
3. Verificar que todas las clases se encuentren dentro de sus respectivos paquetes.
4. Ejecutar la clase Main.java ubicada en el paquete app.
5. Revisar la salida generada en consola.

---

## 📌 Ejemplo de ejecución

El programa crea instancias de:

* Rut
* Direccion
* Empleado
* Cliente

Posteriormente muestra la información de cada objeto utilizando los métodos desarrollados para la actividad.

---

## 📂 Repositorio GitHub

**Repositorio:** https://github.com/sandramamani-rep/GestionAgenciaDeTurismo

**Fecha de entrega:** [08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
