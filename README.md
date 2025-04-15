# CRUD Data 1

Este es un proyecto Spring Boot que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando una arquitectura limpia y moderna.

## 🚀 Tecnologías Utilizadas

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## 📋 Requisitos Previos

- Java JDK 17 o superior
- Maven 3.6 o superior
- PostgreSQL instalado y configurado
- IDE de preferencia (IntelliJ IDEA, Eclipse, etc.)

## 🔧 Configuración

1. Clonar el repositorio:
```bash
git clone https://github.com/efervasquez/crud-pequeno.git
```

2. Configurar la base de datos:
   - Crear una base de datos PostgreSQL
   - Configurar las credenciales en el archivo `application.properties`

3. Compilar el proyecto:
```bash
mvn clean install
```

4. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

## 📦 Estructura del Proyecto

```
src/main/java/com/cruddata1/
├── controller/     # Controladores REST
├── service/        # Lógica de negocio
├── entity/         # Entidades JPA
├── repository/     # Repositorios de datos
└── Cruddata1Application.java
```

## 📝 Características

- API RESTful para operaciones CRUD
- Persistencia de datos con JPA y PostgreSQL
- Validación de datos
- Manejo de excepciones
- Arquitectura en capas (Controller, Service, Repository)
- Uso de Lombok para reducir código boilerplate

## 🔍 Endpoints Disponibles

La API expone los siguientes endpoints:

- GET /api/entidades - Obtener todas las entidades
- GET /api/entidades/{id} - Obtener una entidad por ID
- POST /api/entidades - Crear una nueva entidad
- PUT /api/entidades/{id} - Actualizar una entidad existente
- DELETE /api/entidades/{id} - Eliminar una entidad

## 🛠️ Desarrollo

### Estructura de Paquetes

- `controller`: Maneja las peticiones HTTP y devuelve respuestas
- `service`: Contiene la lógica de negocio
- `entity`: Define las entidades del dominio
- `repository`: Gestiona el acceso a datos

### Pruebas

Para ejecutar las pruebas:
```bash
mvn test
```

## 🤝 Contribución

Las contribuciones son bienvenidas. Por favor, sigue estos pasos:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 📧 Contacto

Edgar Vasquez - efer_vasquez@hotmail.com

Project Link: [https://github.com/efervasquez/crud-pequeno](https://github.com/efervasquez/crud-pequeno.git)
