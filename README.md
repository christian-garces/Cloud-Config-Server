Documentación del Proyecto Cloud Config Server
1. Introducción
Este proyecto implementa un Spring Cloud Config Server, que permite centralizar la configuración de múltiples aplicaciones en un entorno distribuido.
El objetivo es mostrar cómo gestionar propiedades de forma externa y dinámica, facilitando la administración de microservicios y asegurando consistencia en entornos de desarrollo, pruebas y producción.

2. Arquitectura del Proyecto
El repositorio sigue una estructura organizada:
Cloud-Config-Server/
│── src/main/java/com/christian/configserver/
│   ├── ConfigServerApplication.java   # Clase principal
│── resources/
│   ├── application.yml                # Configuración del servidor
│── docs/                              # Documentación técnica
│── README.md

Flujo general
- Config Server expone un endpoint centralizado.
- Aplicaciones clientes consultan sus configuraciones desde este servidor.
- Repositorio Git almacena los archivos de configuración versionados.

3. Requisitos
- Java 11+
- Apache Maven
- Spring Boot 2.x o 3.x
- Spring Cloud Config
- Git (para almacenar configuraciones)

4. Instalación y Ejecución
Clonar el repositorio
git clone https://github.com/christian-garces/Cloud-Config-Server.git
cd Cloud-Config-Server

Compilar y ejecutar
mvn clean install
mvn spring-boot:run

El servidor quedará disponible en:
http://localhost:8888

5. Ejemplo de uso
Configuración en application.yml
server:
  port: 8888

spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/usuario/config-repo

Consumo desde un cliente
Un microservicio cliente puede obtener sus propiedades con:
http://localhost:8888/servicio1/default


6. Pruebas
Ejecuta las pruebas unitarias con:
mvn test

7. Roadmap
- [ ] Añadir ejemplos de integración con múltiples microservicios.
- [ ] Documentar despliegue en Docker/Kubernetes.
- [ ] Implementar seguridad con Spring Security y OAuth2.
- [ ] Añadir monitoreo de cambios en tiempo real.
