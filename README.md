# Bono Parcial AREP y Laboratorio
Hecho por David Eduardo Valencia Cardona
A continuación, te proporcionaré un README desglosado para las clases proporcionadas y el Docker que mencionaste:

## Clase SparkWebServer

La clase `SparkWebServer` es una aplicación de servidor web desarrollada en Spark Java. Esta aplicación web proporciona un formulario para realizar diferentes operaciones matemáticas y de texto y luego muestra los resultados correspondientes. A continuación, se describe cómo ejecutar la aplicación y realizar pruebas.

### Ejecución

1. Asegúrate de tener Spark Java instalado en tu entorno de desarrollo.

2. Antes que nada no olvide iniciar el maven con el comando `mvn:clean install`
3. Ejecuta la clase `SparkWebServer` como una aplicación Java.

   ```shell
   java -cp "target/classes:target/dependency/*" edu.eci.arep.SparkWebServer
   ```


3. La aplicación se ejecutará y estará disponible en el puerto predeterminado (4567) o en el puerto especificado por la variable de entorno `PORT`.

4. Abre tu navegador y accede a la siguiente URL para interactuar con la aplicación:

   ```
   http://localhost:4567/formulario
   ```

### Pruebas

Puedes realizar pruebas en la aplicación de la siguiente manera:

1. Accede a la URL `http://localhost:4567/formulario` en tu navegador.

2. Se mostrará un formulario que te permite seleccionar una operación (coseno, seno, palíndromo o magnitud) y proporcionar los valores necesarios.

3. Completa el formulario y haz clic en "Calcular".

4. La aplicación procesará los datos y te mostrará el resultado correspondiente.

## Clase AppService

La clase `AppService` contiene métodos para realizar diferentes operaciones matemáticas y de texto. Estos métodos son utilizados por la clase `SparkWebServer` para calcular y mostrar resultados.

### Métodos Disponibles

- `getCos(String number)`: Calcula el coseno de un número y devuelve el resultado como una cadena.

- `getSin(String number)`: Calcula el seno de un número y devuelve el resultado como una cadena.

- `isPalindrome(String word)`: Verifica si una palabra es un palíndromo y devuelve un mensaje indicando si lo es o no.

- `getMagnitude(String str1, String str2)`: Calcula la magnitud de un vector 2D representado por `str1` y `str2` y devuelve el resultado como una cadena.

## Docker Container

El servicio se encuentra disponible en un contenedor Docker que puedes ejecutar en tu entorno. Puedes encontrar el contenedor en el siguiente enlace:

[Docker Container - davidval6/dockerbonofinal](https://hub.docker.com/repository/docker/davidval6/dockerbonofinal/general)

Para ejecutar el contenedor, puedes utilizar el siguiente comando:

```shell
docker run -p 34001:4567 davidval6/dockerbonofinal:latest
```

Esto iniciará el contenedor y expondrá la aplicación en el puerto 34001 de tu sistema local. Puedes acceder a la aplicación a través de la URL:

```
http://localhost:34001/formulario
```
## Pruebas de funcionamiento:

