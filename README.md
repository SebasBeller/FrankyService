

# API de Saludos para Empleados

Este proyecto es una API desarrollada en Java que permite realizar saludos personalizados a empleados y ofrece la funcionalidad adicional de traducir estos saludos a diferentes idiomas. La API está diseñada para ser fácilmente integrable en cualquier aplicación o sistema que requiera enviar mensajes de bienvenida, despedida o cualquier otro tipo de saludo a empleados, con soporte para traducciones.

## Características

- **Saludo personalizado a empleados**: Permite generar mensajes de saludo dirigidos específicamente a empleados.
- **Traducción de saludos**: Soporte para traducir los saludos a varios idiomas, facilitando la comunicación en entornos laborales internacionales.
- **API RESTful**: Implementación basada en el estándar REST, lo que facilita la integración con otros sistemas y aplicaciones.

## Tecnologías Utilizadas

- **Lenguaje**: Java (JDK 17)
- **Framework**: Spring Boot (para la creación de la API)
- **Dependencias**: Maven para la gestión de dependencias

## Endpoints Disponibles

La API ofrece los siguientes endpoints:
### 1. Saludo

- **Descripción**: Genera un saludo general.
- **Método HTTP**: `GET`
- **Endpoint**: `/greet/get`
- **Respuesta**:
  ```json
    {
    "greetingMessage": "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana."
    }
  ```
  
### 2. Saludo a Empleado

- **Descripción**: Genera un saludo personalizado para un empleado en particular.
- **Método HTTP**: `POST`
- **Endpoint**: `/greet/greeting-for-employee`
- **Cuerpo de la solicitud**:
  ```json
    {
    "name": "Sebastian"
    }
  ```
- **Respuesta**:
  ```json
    {
    "greetingMessage": "Sebastian. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana."
    }
  ```
  
### 3. Traducción de Saludo

- **Descripción**: Traduce un saludo personalizado a uno de los idiomas soportados.
- **Método HTTP**: `POST`
- **Endpoint**: `/greet/greeting-for-employee`
- **Cuerpo de la solicitud**:
  ```json
    {
    "name": "Sebastian",
    "language":"EN-US"
    }
  ```
- **Respuesta**:
  ```json
    {
        "greetingMessage": "Sebastian. Ask yourself if what you are doing today is getting you closer to where you want to be tomorrow."
    }
  ```
- **Idiomas soportados**:
  - **AR**: Árabe
  - **DE**: Alemán
  - **EL**: Griego
  - **EN-GB**: Inglés (Reino Unido)
  - **EN-US**: Inglés (Estados Unidos)
  - **ES**: Español
  - **FR**: Francés
  - **IT**: Italiano
  - **JA**: Japonés
  - **KO**: Coreano
  - **PT-BR**: Portugués (Brasil)
  - **PT-PT**: Portugués (Portugal)
  - **RO**: Rumano
  - **RU**: Ruso
  - entre otros.
    
