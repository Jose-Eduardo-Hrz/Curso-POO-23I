# Curso POO 23I

## Requerimientos 

- Tener instalado el JDK [Link de Descarga](https://www.oracle.com/mx/java/technologies/downloads/#jdk19-windows)
- Tener instalado cualquier editor de codigo
  - Netbeans 15 [Link de Descarga](https://netbeans.apache.org/download/nb15/index.html)
  - Eclipse [Link de Descarga](https://www.eclipse.org/downloads/)
  - Visual Studio Code [Link de Descarga](https://code.visualstudio.com/download)
  
## Verificar Instalacion de JDK

Para verificar la instalación de las herramientas del JDK se debe realiza lo siguiente:

### Verificar Instalacion de JAVAC

``` path
javac --version 
``` 

### Verificar Instalacion de JAVA

``` path
java --version 
``` 

## Compilar y Ejecutar un archivo .java desde Linea de Comandos

### Compilar 

Suponiendo que existe el archivo `Aplicacion.java` en el directorio `Programa`:

``` path
Programa\: javac Aplicacion.java
``` 

### Ejecutar 

Suponiendo que existe el archivo `Aplicacion.class` en el directorio `Programa`:

``` path
Programa\: java Aplicacion
``` 

## Compilar y Ejecutar un proyecto de java desde Linea de Comandos

Suponinedo que se tiene la siguinete estructura en el directorio del proyecto `Proyecto`:

~~~ path
Proyecto
   |---bin
   |---src
        |---Archivo1.java
        |---Archivo2.java
        |---Archivo3.java
~~~

### Compilar

``` path
Proyecto\: javac -d bin src/*java
``` 

El resultado es el siguinte en las carpetas del proyecto:

~~~ path
Proyecto
   |---bin
        |---Archivo1.class
        |---Archivo2.class
        |---Archivo3.class
   |---src
        |---Archivo1.java
        |---Archivo2.java
        |---Archivo3.java
~~~

### Ejecutar

Suponiendo que el archivo `Archivo1.class` contenga el  metodo principal main:  

``` path
Proyecto\: java -cp bin Archivo
``` 

Enlaces Importantes:

- Instalacion de JDK y Netbeans [Link de Video](https://www.youtube.com/watch?v=zf0IodhRFqg)
- Curso POO [Link de Video](https://www.youtube.com/watch?v=FevtwLhsa4c&list=PL-zjQ7bVlkdXUYlepG4g0GCHaxJzOyQq-)

## Autores
- José Eduardo Hernández
- Maricela Claudia Bravo
