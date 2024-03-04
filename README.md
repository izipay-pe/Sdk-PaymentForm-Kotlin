# [Sdk-PaymentForm-Kotlin]
##  Índice
* [1. Introducción](#1-introducción)
* [2. Requisitos previos](#2-requisitos-previos)
* [3. Despliegue](#3-despliegue)
* [4. Datos de conexión](#4-datos-de-conexión)
* [5. Transacción de prueba](#5-transacción-de-prueba)
* [6. Implementación de la IPN](#6-implementación-de-la-ipn)
* [7. Personalización](#7-personalización)
* [8. Consideraciones](#8-consideraciones)
## 1. Introducción
En este manual podrás encontrar una guía paso a paso para configurar un proyecto de **[Kotlin]** con la pasarela de pagos de IZIPAY. Te proporcionaremos instrucciones detalladas y credenciales de prueba para la instalación y configuración del proyecto, permitiéndote trabajar y experimentar de manera segura en tu propio entorno local.
Este manual está diseñado para ayudarte a comprender el flujo de la integración de la pasarela para ayudarte a aprovechar al máximo tu proyecto y facilitar tu experiencia de desarrollo.

<p align="center">
  <img src="https://github.com/izipay-pe/Imagenes/blob/main/formulario_movil_sdk/Imagen-Formulario-SDKAndroid.png?raw=true" alt="Formulario" width="350"/>
</p>

<a name="Requisitos_Previos"></a>
 
## 2. Requisitos previos
* Comprender el flujo de comunicación de la pasarela. [Información Aquí](https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/javascript/guide/start.html)
* Extraer credenciales del Back Office Vendedor. [Guía Aquí](https://github.com/izipay-pe/obtener-credenciales-de-conexion)
* Solicitar la habilitación de API REST: **Pago a tráves de un SDK móvil para Android o IOS**
* Para este proyecto utilizamos la herramienta Android Studio.
> [!NOTE]
> Tener en cuenta que, para que el desarrollo de tu proyecto, eres libre de emplear tus herramientas preferidas.

## 3. Despliegue

### Clonar el proyecto:
  ```sh
  git clone [https://github.com/izipay-pe/Sdk-PaymentForm-Kotlin.git]
  ```
### Ejecutar proyecto
Ejecutar el proyecto a través de Android Studio mediante el botón `Run`, debe tener configurado un `Virtual Device` para ejecutar la demo.

<p align="center">
  <img src="https://i.postimg.cc/ZYDp46PK/Sdk-Play.png" alt="Run"/>
</p>

## 4. Datos de conexión 

**Nota**: Reemplace **[CHANGE_ME]** con sus credenciales de `API REST` extraídas desde el Back Office Vendedor, ver [Requisitos Previos](#Requisitos_Previos).

* Editar en `java/com.lyra.sdk.sample.kotlin/Config.kt` :
<p align="center">
  <img src="https://i.postimg.cc/G27k95N9/Sdk-Credentials.png" alt="Credentials"/>
</p>

## 5. Transacción de prueba
Antes de poner en marcha su pasarela de pago en un entorno de producción, es esencial realizar pruebas para garantizar su correcto funcionamiento. 

Puede intentar realizar una transacción utilizando una tarjeta de prueba en el botón flotante de Test (en la parte superior derecha de la demo).

<p align="center">
  <img src="https://github.com/izipay-pe/Imagenes/blob/main/formulario_movil_sdk/android2.png?raw=true" alt="Test" width="450"/>
</p>

* También puede encontrar tarjetas de prueba en el siguiente enlace. [Tarjetas de prueba](https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/api/kb/test_cards.html)
 
## 6. Implementación de la IPN
> [!IMPORTANT]
> Es recomendable implementar la IPN para comunicar el resultado de la solicitud de pago al servidor del comercio.

La IPN es una notificación de servidor a servidor (servidor de Izipay hacia el servidor del comercio) que facilita información en tiempo real y de manera automática cuando se produce un evento, por ejemplo, al registrar una transacción.
Los datos transmitidos en la IPN se reciben y analizan mediante un script que el vendedor habrá desarrollado en su servidor.
* Ver manual de implementación de la IPN. [Aquí]( https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/kb/payment_done.html)
* Vea el ejemplo de la respuesta IPN con JavaScript. [Aquí](https://github.com/izipay-pe/Server-IPN-JavaScript)
* Vea el ejemplo de la respuesta IPN con PHP. [Aquí](https://github.com/izipay-pe/Server-IPN-Php)

## 7. Personalización
Si deseas aplicar cambios específicos en la apariencia de la pasarela de pago, puedes lograrlo mediante las opciones de personalización del SDK. En este enlace [Personalización - SDK](https://secure.micuentaweb.pe/doc/es-PE/mobp/integration_guide/android/) podrá encontrar la documentación para guiarlo en la personalización en la sección `Personalizar el SDK`.

## 8. Consideraciones
Para obtener más información, echa un vistazo a:
- [Formulario incrustado: prueba rápida](https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/javascript/quick_start_js.html)
- [Primeros pasos: pago simple](https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/javascript/guide/start.html)
- [Servicios web - referencia de la API REST](https://secure.micuentaweb.pe/doc/es-PE/rest/V4.0/api/reference.html)
