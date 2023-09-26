# Bono Parcial AREP y Laboratorio
Hecho por David Eduardo Valencia Cardona

## Clase SparkWebServer

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
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/a85a21a5-f91e-4277-b924-58a888525c80)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/fb57f93d-b9b0-481d-bf9f-04c8e10270fa)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/6a07fcde-c2bd-4b5d-9159-5fb44bbf1222)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/98bbee33-70f4-4fc2-91a3-81f26986f57f)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/013d3319-8d59-4afc-965d-682997e90940)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/f3bab3b3-f906-4515-b30d-e48f8946f2e6)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/c9064637-d02d-4229-a85f-543b16bf8ea2)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/5d4c6c34-0699-481b-8ba6-4b7d5d6a8414)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/f3b3aa33-7e01-42dd-b36b-cd67e6964b32)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/1ae4508b-4017-4b9d-95e8-c5ce239e36b3)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/74616218-b4f9-4897-b646-d27764dd00b3)








