# proyecto-integrador-poo
# Sistema de Gestión para Agencia de Viajes con Indicadores de Transformación Digital y Madurez Digital

## Descripción

Este proyecto fue desarrollado como parte del Proyecto Integrador de Programación Orientada a Objetos.

La aplicación modela el funcionamiento de una Agencia de Viajes utilizando Programación Orientada a Objetos en Java. El sistema permite gestionar clientes, reservas, hoteles, servicios turísticos, transporte, pagos y facturación.

Además, incorpora una dimensión de Transformación Digital y Madurez Digital que permite evaluar el nivel de digitalización de la empresa mediante indicadores empresariales.

---

## Integrantes

* Byron Illescas
* Jesús Lucero
* Samuel Gonzales
* Jaime Reyes

---

## Sector Empresarial Modelado

Agencia de Viajes y Servicios Turísticos.

La empresa ofrece servicios relacionados con:

* Reservas turísticas.
* Hospedaje.
* City Tours.
* Excursiones.
* Tours Internacionales.
* Transporte turístico.
* Facturación y pagos.

---

## Clases Principales

### Gestión de Clientes

* Cliente

### Gestión de Reservas

* Reserva
* Hotel
* Factura

### Servicios Turísticos

* ServicioTuristico
* CityTour
* Excursion
* TourInternacional
* Ruta
* GuiaTuristico

### Transporte

* Vehiculo
* Bus
* Minibus
* Minivan
* Vehiculo4x4
* Conductor

### Métodos de Pago

* Pago
* PagoTarjeta
* PagoOnline
* PagoTransferencia
* PagoEfectivo

### Transformación Digital

* Empresa
* EvaluacionMadurezDigital
* IndicadorDigital

---

## Estructura del Proyecto

```text
proyecto-integrador-poo
│
├── src
│   ├── Cliente.java
│   ├── Reserva.java
│   ├── Hotel.java
│   ├── Factura.java
│   ├── GuiaTuristico.java
│   ├── ServicioTuristico.java
│   ├── CityTour.java
│   ├── Excursion.java
│   ├── TourInternacional.java
│   ├── Ruta.java
│   ├── Vehiculo.java
│   ├── Bus.java
│   ├── Minibus.java
│   ├── Minivan.java
│   ├── Vehiculo4x4.java
│   ├── Conductor.java
│   ├── Pago.java
│   ├── PagoTarjeta.java
│   ├── PagoOnline.java
│   ├── PagoTransferencia.java
│   ├── PagoEfectivo.java
│   ├── Empresa.java
│   ├── EvaluacionMadurezDigital.java
│   ├── IndicadorDigital.java
│   └── Main.java
│
├── uml
│   └── diagrama-clases.png
│
├── docs
│   └── documento-proyecto.pdf
│
├── presentacion
│   └── presentacion-final.pdf
│
└── README.md
```

---

## Instrucciones para Ejecutar el Código

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en Visual Studio Code, NetBeans o IntelliJ IDEA.
3. Compilar todos los archivos Java.
4. Ejecutar la clase Main.java.
5. Verificar los resultados mostrados en la consola.

---

## Diagrama UML

```markdown
![Diagrama UML](uml/diagrama-clases.png)
```

---

## Funcionamiento General

El sistema permite crear y administrar información relacionada con clientes, reservas, hoteles, servicios turísticos, transporte y métodos de pago.

La clase principal Main demuestra el funcionamiento del modelo mediante la creación de objetos, ejecución de métodos y visualización de resultados en consola.

Además, permite evidenciar la relación entre los procesos propios de la agencia de viajes y los elementos asociados a la transformación digital.

---

## Transformación Digital y Madurez Digital

El proyecto incorpora un módulo especializado para evaluar el nivel de digitalización de la empresa.

### Empresa

Representa la organización evaluada y almacena información general relacionada con el sector empresarial, ubicación y características de la empresa.

### EvaluacionMadurezDigital

Permite calcular el nivel de madurez digital mediante puntajes asociados a diferentes dimensiones tecnológicas como transformación digital, automatización de procesos, presencia digital y uso de datos.

### IndicadorDigital

Representa indicadores específicos que permiten medir aspectos relacionados con la digitalización de la empresa.

Este módulo permite identificar fortalezas, oportunidades de mejora y niveles de madurez digital que pueden servir como base para futuros dashboards empresariales y procesos de toma de decisiones.

---

## Indicadores Propuestos para Futuro Dashboard

| Indicador                        | Clase Relacionada        |
| -------------------------------- | ------------------------ |
| Total de Clientes                | Cliente                  |
| Total de Reservas                | Reserva                  |
| Reservas Confirmadas             | Reserva                  |
| Ingresos Totales                 | Factura                  |
| Tours Vendidos                   | ServicioTuristico        |
| Porcentaje de Reservas Digitales | Reserva                  |
| Nivel de Automatización          | IndicadorDigital         |
| Nivel General de Madurez Digital | EvaluacionMadurezDigital |

---

## Tecnologías Utilizadas

* Java
* Programación Orientada a Objetos (POO)
* UML
* GitHub
* StarUML

---

## Conceptos Aplicados

* Encapsulamiento
* Herencia
* Constructores
* Getters y Setters
* Relaciones UML
* Transformación Digital
* Madurez Digital
* Indicadores Empresariales

---

## Proyecto Integrador

Este proyecto fue desarrollado como evidencia práctica de la aplicación de Programación Orientada a Objetos para el modelado de sistemas empresariales y la incorporación de indicadores de transformación digital y madurez digital.

El modelo fue diseñado para representar de forma estructurada los procesos de una agencia de viajes y servir como base para futuras ampliaciones que incluyan bases de datos, interfaces gráficas y dashboards empresariales.