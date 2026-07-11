# Microservicio Gestión de Usuarios

## Integrantes

* Francisca Acosta.
* Cristobal Garcia.

## Descripción

Este proyecto corresponde a un microservicio para la gestión de usuarios, desarrollado con Spring Boot. Se implementaron herramientas DevOps

---

## Tecnologías Utilizadas

### Backend

* Java 17
* Spring Boot 3
* Spring Data JPA
* Maven

### DevOps
* Git
* GitHub
* GitHub Actions
* Docker
* Docker Hub
* Kubernetes (Amazon EKS)

## Calidad y seguridad
* JaCoCo
* SonarCloud
* Snyk

### Base de Datos

* Amazon RDS (MySQL)

---

## Estrategia de rama
- **main:** contiene la versión estable del proyecto
- **develop:** rama donde se integran los cambios antes de pasar a producción
- **feature/***: utilizada para desarrollar nuevas funcionalidades
- **hotfix/***: utilizada para corregir errores detectados

Los cambios se integraron mediante errores detectados

---

### Endpoints

| Método | Endpoint | Descripción |
|---------|----------|-------------|
| GET | /usuarios | Obtener todos los usuarios |
| GET | /usuarios/{id} | Obtener un usuario por ID |
| POST | /usuarios | Guardar un nuevo usuario |
| PUT | /usuarios/{id} | Actualizar un usuario existente |
| DELETE | /usuarios/{id} | Eliminar un usuario por ID |

---

## Pipeline CI/CD

1. Ejecución de pruebas
2. Generación del reporte de cobertura con JaCoCo
3. Análisis de calidad del código con SonarCloud
4. Análisis de seguridad con Snyk
5. Construcción del archivo JAR
6. Construcción de imagen Docker
7. Publicación de la imangen en Docker Hub
8. Despliegue automatizado en Kubernetes

---

## Contenedores
La aplicación se ejecuta dentro de un contenedor Docker. La imagen se publica automáticamente en Docker Hub cuando el pipeline finaliza correctamente

---

## Kubernetes
La aplicación se despliega en Amazon EKS utilizando un Deployment y un Service. El despliegue se realiza automáticamente desde GitHub Actions

---

## Monitoreo

- AWS CloudWatch para métricas y monitoreo.
- Kiali para visualizar el estado de los servicios.
- Istio para la administración y observabilidad de la comunicación entre servicios.

---

## Pruebas

- Pruebas unitarias.
- Pruebas de integración del controlador.
- Cobertura de código mediante JaCoCo.

---

## Seguridad

- SonarCloud para el análisis del código.
- Snyk para detectar vulnerabilidades en las dependencias.
- Dependabot para mantener las dependencias actualizadas.
