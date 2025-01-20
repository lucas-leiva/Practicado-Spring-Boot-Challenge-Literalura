Catálogo de Libros

Objetivo

Desarrollar un Catálogo de Libros que permita la interacción textual (vía consola) con los usuarios. La aplicación proporcionará al menos 5 opciones de interacción, permitiendo a los usuarios buscar y explorar libros mediante una API específica.

Características Principales

Interacción vía consola: Los usuarios podrán interactuar con el programa introduciendo comandos o respuestas mediante la consola.

Búsqueda de libros a través de una API: La aplicación consumirá datos de una API externa que proporciona información sobre libros.

Opciones de interacción: Al menos 5 opciones de interacción estarán disponibles, como buscar libros por título, idioma o autor.

Requisitos

API para obtener los libros:

La aplicación consumirá información de una API específica.

Es necesario conocer los endpoints y parámetros que permite la API (como filtros por autor, idioma, etc.).

Interacción de usuario:

Diseñar una interacción clara y amigable para la consola.

Proporcionar mensajes e instrucciones fáciles de entender.

Opciones de Interacción

Las siguientes son posibles opciones que podrían implementarse:

Buscar libro por título: Permitir al usuario ingresar el título de un libro y mostrar la información relevante.

Listar libros más populares: Mostrar los 10 libros más descargados según la API.

Buscar por autor: Solicitar un nombre de autor y devolver todos los libros disponibles de él.

Filtrar por idioma: Mostrar libros disponibles en un idioma específico.

Detalles del libro: Permitir al usuario seleccionar un libro y mostrar detalles adicionales como sinopsis o número de descargas.

Tecnologías Utilizadas

Lenguaje: Java.

Bibliotecas:

Jackson: Para procesar y mapear los datos JSON obtenidos de la API.

Spring Boot: Para estructurar el proyecto y facilitar el desarrollo.

Dependencias de la API: Se deben agregar dependencias relevantes para consumir la API, como RestTemplate o HttpClient.

Instalación y Ejecución

Clonar el repositorio:

git clone https://github.com/usuario/catalogo-libros.git
cd catalogo-libros

Configurar las dependencias:

Asegúrate de que Maven o Gradle esté configurado correctamente para resolver las dependencias.

Configurar el acceso a la API:

En el archivo application.properties o application.yml, proporciona la URL base de la API y cualquier clave de acceso requerida.

Ejecutar la aplicación:

mvn spring-boot:run

Interactuar con la aplicación:

Sigue las instrucciones proporcionadas por la consola para buscar y explorar libros.

Notas Adicionales

API utilizada: Proveer información detallada sobre la API utilizada (nombre, URL, documentación oficial).

Próximas mejoras: Agregar una interfaz gráfica o guardar las búsquedas del usuario en una base de datos.
