# Evaluación DevOps 2

Proyecto backend desarrollado con Spring Boot, MySQL y Docker Compose.

---

# Descripción del proyecto

Este proyecto consiste en una API REST para la gestión de tareas, desarrollada con Spring Boot y conectada a una base de datos MySQL.  
La aplicación fue contenedorizada utilizando Docker y orquestada mediante Docker Compose.

---

# Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- MySQL 8
- Docker
- Docker Compose

---

# Estructura del proyecto

```txt
evaluacion2devops/
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

El proyecto utiliza un Dockerfile para construir la imagen del backend Spring Boot.

## Docker Compose

Docker Compose permite levantar:

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

## Base de datos

Contenedor MySQL encargado del almacenamiento persistente de datos.

Docker Compose permite la comunicación automática entre ambos servicios.

---

# Explicación técnica

## ¿Por qué usar Docker?

Docker permite:

- Portabilidad
- Aislamiento de dependencias
- Facilidad de despliegue
- Consistencia entre entornos

---

## ¿Por qué usar Docker Compose?

Docker Compose facilita la orquestación de múltiples contenedores utilizando un único archivo de configuración.

---

# Comunicación entre contenedores

Para conectar Spring Boot con MySQL dentro de Docker Compose se utilizó:

```properties
spring.datasource.url=jdbc:mysql://mysql:3306/devopsdb
```

Donde:

- `mysql` corresponde al nombre del servicio definido en `docker-compose.yml`

---

# Evidencias de funcionamiento

El proyecto fue probado exitosamente mediante:

- Navegador web
- Postman
- Docker Desktop

Se verificó:

- Endpoint GET
- Endpoint POST
- Persistencia en MySQL
- Comunicación entre contenedores

---

# Autor

Proyecto desarrollado para evaluación de DevOps.