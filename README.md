# BONO PARCIAL AREP
Hecho por David Eduardo Valencia

## Como ejecutar el proyecto
Para poder usar este proyecto se debe de:
### Clonar el repositorio:
``` bash
git clone https://github.com/DavidVal6/bono-Arep.git
```
Una vez clonado se debe de ejecutar el siguiente comando dentro de la carpeta raiz
``` bash
java -cp "target/classes:target/dependency/*" edu.eci.arep.SparkWebServer
```

Una vez se ejecute o descargando el docker de la siguiente manera:
```
docker pull davidval6/firstsparkrepo:latest
```
tiene una forma de ejecutarse y es : 
aqui se vera el coseno de el numero
```
localhost:4567/cos?number=x 
```
aqui se vera el seno de el numero
```
localhost:4567/sin?number=x 
```
aqui se vera si el string es un palindrome
```
localhost:4567/palindrom?palindrome=x 
```
Aqui se vera la magnitud de un vector dandole x y y:
```
localhost:4567/magnitude?x=1&y=2 
```
PRUEBAS DE FUNCIONAMIENTO:
