PROYECTO: Automatización de Pruebas Web E2E y APIs

DESCRIPCIÓN

Este repositorio contiene la automatización de pruebas funcionales Web (E2E) y pruebas de APIs REST utilizando diferentes herramientas de automatización.

Las pruebas Web fueron implementadas utilizando Serenity BDD con el patrón Screenplay, Cucumber y Selenium WebDriver.  
Las pruebas de APIs fueron desarrolladas utilizando Karate Framework.

El objetivo del proyecto es validar diferentes flujos funcionales en aplicaciones web y servicios REST, identificando entradas, capturando salidas y validando el comportamiento esperado del sistema.

------------------------------------------------------------

TECNOLOGÍAS UTILIZADAS

- Java 17
- Maven
- Selenium WebDriver
- Serenity BDD
- Cucumber
- Screenplay Pattern
- Karate Framework
- IntelliJ IDEA

------------------------------------------------------------

PRUEBAS WEB IMPLEMENTADAS

1. SauceDemo
   URL: https://www.saucedemo.com/

Flujo automatizado:
- Autenticación con usuario estándar
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar el checkout
- Finalizar la compra
- Validar mensaje de confirmación

------------------------------------------------------------

2. Demoblaze
   URL: https://www.demoblaze.com/

Flujo automatizado:
- Agregar productos al carrito
- Visualizar el carrito
- Completar el formulario de compra
- Finalizar la compra
- Validar confirmación de la orden

------------------------------------------------------------

3. OpenCart
   URL: http://opencart.abstracta.us/

Flujo automatizado:
- Agregar productos al carrito
- Visualizar carrito
- Checkout como invitado (Guest Checkout)
- Completar datos del pedido
- Confirmar la orden

------------------------------------------------------------

PRUEBAS DE APIs IMPLEMENTADAS

1. Demoblaze API
   Endpoints probados:

POST /signup
POST /login

Casos probados:
- Crear un nuevo usuario
- Intentar crear un usuario existente
- Login con credenciales correctas
- Login con credenciales incorrectas

------------------------------------------------------------

2. Petstore API (Mascotas)

Endpoints probados:

POST /pet
GET /pet/{id}
PUT /pet
GET /pet/findByStatus

Casos probados:
- Añadir mascota
- Consultar mascota por ID
- Actualizar mascota
- Consultar mascota por estado

------------------------------------------------------------

3. Petstore API (Usuarios)

Endpoints probados:

POST /user
GET /user/{username}
PUT /user/{username}
DELETE /user/{username}

Casos probados:
- Crear usuario
- Buscar usuario
- Actualizar datos del usuario
- Buscar usuario actualizado
- Eliminar usuario

------------------------------------------------------------

EJECUCIÓN DEL PROYECTO

1. Clonar el repositorio desde GitHub.

2. Abrir el proyecto en IntelliJ IDEA.

3. Ejecutar los siguientes comandos desde la raíz del proyecto:

Para ejecutar todas las pruebas:

mvn clean verify

Para ejecutar pruebas específicas:

Web Automation (Serenity)
Ejecutar los runners correspondientes.

API Automation (Karate)
Ejecutar los runners:

DemoApiRunner
PetstoreApiRunner
PetstoreUserApiRunner

------------------------------------------------------------

REPORTES

Los reportes de Serenity se generan automáticamente en:

target/site/serenity/index.html

Estos reportes incluyen el detalle de los escenarios ejecutados, pasos realizados y evidencias de ejecución.

------------------------------------------------------------

AUTOR

Proyecto desarrollado como ejercicio de automatización de pruebas funcionales Web y APIs.