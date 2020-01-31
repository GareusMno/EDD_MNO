# Práctica de evaluación unidad 1
## Ejercicio 1
### Lenguajes
| Característica | Javascript | Java | Python |
| --- | --- | --- | --- |
|Nivel de abstracción | Alto | Alto | Alto | Alto |
|Propósito | Específico | Específico | General | General |
|Generación | 4a Gen | 4a Gen | 4a Gen | 4a Gen |
|Forma de ejecución | Interpretado | Interpretado | Interpretado | Interpretado |
|Como se plantean los problemas | Imperativo | Imperativo | Imperativo | Imperativo |
|Paradigma | O.O | O.O | Funcional, O.O | 
|Lugar habitual de ejecución | Cliente | Client-Servidor | Multiplataforma | Servidor |

| Característica | Php | C++ | C# |
| --- | --- | --- | --- |
|Nivel de abstracción | Alto | Alto | Alto |
|Propósito | Específico | General | General |
|Generación | 4a Gen | 4a Gen | 4a Gen |
|Forma de ejecución | Interpretado | Interpretado | Interpretado |
|Como se plantean los problemas | Imperativo | Imperativo | Imperativo |
|Paradigma | Procedural, O.O, reflexivo y funcional | Estructurado, O.O, Imperativo, genérica | Estructurado, O.O, Imperativo, dirigido por eventos, funcional, genérico y reflexivo |
|Lugar habitual de ejecución | Servidor | Multiplataforma | Multiplataforma |

| Característica |TypeScript | Shell |
| --- | --- | --- |
|Nivel de abstracción | Alto | Alto |
|Propósito | General | Específico |
|Generación | 4a Gen | 3a Gen |
|Forma de ejecución | Interpratado | Interpretado |
|Como se plantean los problemas | Imperativo/declarativo | Declarativo |
|Paradigma | Estructurado, Imperativo, O.O, script, funciona y genérico | Declarativo |
|Lugar habitual de ejecución | Multiplataforma | Multiplataforma |

| Característica | C | Ruby
| --- | --- | --- |
|Nivel de abstracción | Alto | Alto |
|Propósito | General | Específico |
|Generación | 3a Gen | 3a Gen |
|Forma de ejecución | Interpretado | Interpretado |
|Como se plantean los problemas | Imperativo | Declarativo |
|Paradigma | Imperativo (Procedural) y estructurado | O.O, Reflexivo |
|Lugar habitual de ejecución | Multiplataforma | Multiplataforma |
## Ejercicio 2
### Aplicaciones multiplataforma

1. LibreOffice
Es un software de oficina libre y de código abierto, siendo una suit ofimática contando con Writer, Calc, Impress, Base, Draw y Math. Programado en C++, Java y Python
2. Mozilla Firefox
Es un navegador web libre y de código abierto que usa el motor Gecko para renderizar páginas web.
Programado en C++, XUL, XBL, JavaScript, CSS, C y Rust
3. GIMP
Es un programa de edición de imágenes digitales en forma de mapa de bits, tanto dibujos como fotografías.
Programado en C y GTK.
4. Plucker
Es un lector de documentos de software libre para dispositivos de mano y PDAs basado en Palm OS. Teniendo su propio formato de archivos.
Programado en Python.
5. Skype
Es un software propietario de Microsoft que permite comunicaciones de texto, voz y vídeo a través de Internet.
Programado en Embarcadero Delphi, Objective-C, C++, Object Pascal y JavaScript.
6. Opera
Es un navegador que usa el motor Blink con versión para todas las plataformas.
Programado en C++
## Práctica 3
### Compilación y ejecución de código
##### Python
Editamos un fichero de texto que llamaremos hello.py con lo siguiente:
```print "Hello World! des de python"```
```print "Hola a todos! Me llamo Marc y estudio 1r de DAM"```
Se guarda y ejecutaremos desde la misma carpeta del archivo.
```$ python hello.py```
Y nos saldra lo que hemos escrito.
##### Nodejs
Ahora otro archivo con hello.js
```console.log("Hello World! des de Javascript");```
```console.log("Hola a todos! Me llamo Marc y estudio 1r de DAM");```
Para ejecutarlo necesitremos nodejs y desde la carpeta con el archivo:
```$ nodejs hello.js```
##### C
Archivo llamado hello.c
```#include <stdio.h```
```int main(void)```
```{```
```printf("Hello World! des de C!");```
```}```
```#include <stdio.h```
```int main(void)```
```{```
```printf("Hola a todos!, Me llamo Marc y estudio 1r de DAM");```
```}```
Para ejecutarlo necesitaremos compilarlo, asi que necesitaremos hacer lo siguiente
```$ gcc hello.c -o hello```
Y ahora que lo tenemos compilado:
```$ ./hello```

##### Java
Para java en un archivo de texto:
```class HolaMon {```
    ```static public void main( String args[] ) {```
    ```System.out.println("Hello World! des de Java!");```
    ```}```
    ```}```
```class HolaMon {```
    ```static public void main( String args[] ) {```
    ```System.out.println("Hola a todos! Me llamo Marc y estudio 1r de DAM");```
    ```}```
    ```}```
    Y compilariamos el programa con el compilador de java que se incluye en el JDK, desde la carpeta del archivo:
    ```$ javac Hello.java```
    Ahora tendremos un archivo llamado HolaMon.class, ejecutaremos ese archivo
    ```$ java HolaMon```
