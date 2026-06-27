# Microservicio Gestión de Usuarios

## Integrantes

* Francisca Acosta.
* Cristobal Garcia.

---

## Tecnologías Utilizadas

### Backend

* Java 17
* Spring Boot 3
* Spring Data JPA
* Maven

### DevOps

* GitHub
* GitHub Actions
* Docker
* Kubernetes (Amazon EKS)

### Observabilidad

* AWS CloudWatch
* Dashboards personalizados
* Logs y métricas del sistema

### Base de Datos

* Amazon RDS (MySQL)

---

### Endpoints

| Método | Endpoint       | Descripción                |
| ------ | -------------- | -------------------------- |
| GET    | /usuarios      | Obtener todos los usuarios |
| GET    | /usuarios/{id} | Obtener usuario por ID     |
| POST   | /usuarios      | Crear usuario              |
| PUT    | /usuarios/{id} | Actualizar usuario         |
| DELETE | /usuarios/{id} | Eliminar usuario           |

---

## Pipeline CI/CD

1. Ejecución de pruebas
2. Generación de cobertura con JaCoCo
3. Análisis de calidad mediante SonarCloud
4. Construcción del artefacto JAR
5. Construcción de imagen Docker
6. Despliegue automatizado en Kubernetes
7. Monitoreo y observabilidad mediante CloudWatch

---

## Observabilidad

* Monitoreo de uso de CPU
* Monitoreo de memoria
* Registro de logs
* Disponibilidad del servicio
* Métricas de despliegue
* Métricas de calidad de código
