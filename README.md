# Evaluación DevOps 2

Proyecto backend desarrollado con Spring Boot, MySQL, Docker y GitHub Actions.

---

# Descripción del proyecto

Este proyecto consiste en una API REST para la gestión de tareas, desarrollada con Spring Boot y conectada a una base de datos MySQL.

La aplicación fue:

- Contenedorizada utilizando Docker
- Orquestada mediante Docker Compose
- Automatizada mediante pipelines CI/CD con GitHub Actions

---

# Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- MySQL 8
- Docker
- Docker Compose
- GitHub Actions
- Dependabot

---

# Estructura del proyecto

```txt
evaluacion2devops/
│
├── .github/
│   ├── workflows/
│   │   ├── ci.yml
│   │   ├── deploy.yml
│   │   └── security.yml
│   │
│   └── dependabot.yml
│
├── src/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── README.md
└── mvnw
```

---

# Configuración de Docker

## Dockerfile

El proyecto utiliza un Dockerfile para construir la imagen Docker del backend Spring Boot.

---

## Docker Compose

Docker Compose permite levantar automáticamente:

- Contenedor backend Spring Boot
- Contenedor MySQL

mediante un solo comando.

---

# Cómo ejecutar el proyecto

## 1. Clonar repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

---

## 2. Entrar a la carpeta

```bash
cd evaluacion2devops
```

---

## 3. Ejecutar Docker Compose

```bash
docker compose up --build
```

---

# Servicios levantados

| Servicio | Puerto |
|---|---|
| Backend Spring Boot | 8080 |
| MySQL | 3307 |

---

# Endpoints disponibles

## Obtener tareas

### GET

```txt
http://localhost:8080/tareas
```

---

## Crear tarea

### POST

```txt
http://localhost:8080/tareas
```

### Body JSON

```json
{
  "titulo":"Aprender Docker Compose"
}
```

---

# Arquitectura de la solución

La solución está compuesta por dos contenedores:

## Backend

Aplicación Spring Boot encargada de exponer la API REST.

---

## Base de datos

Contenedor MySQL encargado del almacenamiento persistente de datos.

Docker Compose permite la comunicación automática entre ambos servicios.

---

# Comunicación entre contenedores

Para conectar Spring Boot con MySQL dentro de Docker Compose se utilizó:

```properties
spring.datasource.url=jdbc:mysql://mysql:3306/devopsdb
```

Donde:

- `mysql` corresponde al nombre del servicio definido en `docker-compose.yml`

---

# Pipeline CI/CD

El proyecto implementa integración y despliegue continuo utilizando GitHub Actions.

---

## CI - Continuous Integration

El pipeline de integración continua ejecuta automáticamente:

- Descarga del repositorio
- Configuración de Java 21
- Ejecución de pruebas Maven
- Construcción automática de imagen Docker

Archivo utilizado:

```txt
.github/workflows/ci.yml
```

---

## Seguridad Automatizada

El pipeline de seguridad ejecuta:

- Verificación de dependencias
- Análisis automatizado
- Validaciones de seguridad

Archivo utilizado:

```txt
.github/workflows/security.yml
```

Además, se utiliza Dependabot para monitorear vulnerabilidades en dependencias Maven.

Archivo utilizado:

```txt
.github/dependabot.yml
```

---

## CD - Continuous Deployment

El pipeline CD automatiza:

- Construcción de Docker
- Levantamiento de contenedores
- Verificación de despliegue

Archivo utilizado:

```txt
.github/workflows/deploy.yml
```

---

# GitHub Actions

GitHub Actions fue utilizado para automatizar completamente el ciclo de vida del microservicio.

Los workflows se ejecutan automáticamente en cada:

- Push
- Pull Request

permitiendo validar calidad, seguridad y despliegue continuo.

---

# Trazabilidad y calidad

La trazabilidad se garantiza mediante:

- Uso de ramas Git
- Historial de commits
- Pull Requests
- Ejecución automática de workflows

La calidad del software se asegura mediante:

- Automatización de pruebas
- Integración continua
- Validaciones automáticas
- Escaneo de dependencias
- Construcción automática de Docker

---

# Evidencias de funcionamiento

El proyecto fue probado exitosamente mediante:

- Navegador web
- Postman
- Docker Desktop
- GitHub Actions

Se verificó:

- Endpoint GET
- Endpoint POST
- Persistencia en MySQL
- Comunicación entre contenedores
- Ejecución automática de pipelines
- Construcción de Docker
- Workflows CI/CD

---

# Autor

Proyecto desarrollado para evaluación de DevOps.