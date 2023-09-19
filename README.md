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
[docker pull davidval6/firstsparkrepo:latestBono](https://hub.docker.com/repository/docker/davidval6/dockerbono/general)
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
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/2d81d7cc-001a-4b30-addf-9448c6722c70)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/0eb0ba9b-07ab-4aaf-a9c1-41784099acc1)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/b8c2dca6-a8cb-40ae-a277-c778e7f465e7)
![image](https://github.com/DavidVal6/bono-Arep/assets/98176834/8bdd23c3-aea9-443f-bd96-c540f48f6b18)

