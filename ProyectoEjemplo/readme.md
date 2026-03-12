PROYECTO: Automatización de pruebas funcionales Web (E2E)

DESCRIPCIÓN

Este proyecto contiene la automatización de pruebas funcionales end-to-end
sobre diferentes aplicaciones web públicas utilizando el patrón Screenplay
con Serenity BDD, Cucumber y Selenium WebDriver.

Las pruebas validan flujos completos de compra en diferentes aplicaciones
de comercio electrónico.

HERRAMIENTAS UTILIZADAS

- Java 17
- Maven
- Selenium WebDriver
- Serenity BDD
- Cucumber (BDD)
- Screenplay Pattern
- IntelliJ IDEA

APLICACIONES AUTOMATIZADAS

1. SAUCEDEMO
URL: https://www.saucedemo.com/

Flujo automatizado:
- Autenticación con usuario estándar
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar el checkout
- Finalizar la compra
- Validar el mensaje de confirmación: "Thank you for your order!"

------------------------------------------------------------

2. DEMOBLAZE
URL: https://www.demoblaze.com/

Flujo automatizado:
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar el formulario de compra
- Finalizar la compra
- Validar el mensaje de confirmación

------------------------------------------------------------

3. OPENCART
URL: http://opencart.abstracta.us/

Flujo automatizado:
- Agregar dos productos al carrito
- Visualizar el carrito
- Realizar checkout como invitado (Guest Checkout)
- Completar los datos de facturación
- Confirmar la orden
- Validar el mensaje: "Your order has been placed!"

------------------------------------------------------------

ESTRUCTURA DEL PROYECTO

src
 └── test
     ├── java
     │   └── Codex.example
     │       ├── runners
     │       ├── stepdefinitions
     │       ├── tasks
     │       ├── userinterfaces
     │       └── questions
     │
     └── resources
         └── features

Los tests están organizados siguiendo el patrón Screenplay, separando:

- Step Definitions
- Tasks
- User Interfaces
- Questions
- Runners
- Features

------------------------------------------------------------

REQUISITOS

Para ejecutar el proyecto se necesita:

- Java 17 o superior
- Maven 3.8+
- Google Chrome instalado
- Conexión a internet

------------------------------------------------------------

EJECUCIÓN DE LAS PRUEBAS

1. Clonar el repositorio desde GitHub:

git clone <URL_DEL_REPOSITORIO>

2. Abrir una terminal en la carpeta del proyecto.

3. Ejecutar el siguiente comando:

mvn clean verify

Esto ejecutará todas las pruebas automatizadas definidas en los archivos feature.

------------------------------------------------------------

EJECUCIÓN POR PROYECTO

Cada aplicación tiene su propio Runner:

SauceDemo
Ejecutar:
SauceDemoTestSuite.java

Demoblaze
Ejecutar:
DemoblazeTestSuite.java

OpenCart
Ejecutar:
OpenCartTestSuite.java

------------------------------------------------------------

REPORTES

Serenity genera reportes automáticos después de la ejecución.

Los reportes se encuentran en:

target/site/serenity/index.html

Estos reportes incluyen:

- Escenarios ejecutados
- Resultados de cada paso
- Evidencias de ejecución
- Screenshots automáticos

------------------------------------------------------------

CASOS DE PRUEBA IMPLEMENTADOS

SauceDemo
- Login con usuario estándar
- Agregar productos al carrito
- Checkout
- Confirmación de compra

Demoblaze
- Agregar productos al carrito
- Compra de productos
- Confirmación de orden

OpenCart
- Agregar productos
- Guest checkout
- Confirmación de orden

------------------------------------------------------------

AUTOR

Proyecto desarrollado como ejercicio de automatización de pruebas
funcionales web utilizando Serenity BDD y el patrón Screenplay.