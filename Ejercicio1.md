#Ejercicio 1

##Ejercicios RCS

Creamos el archivo y le añadimos texto

![Paso 1](1%20RCS.PNG)

![Paso 2](2%20RCS.PNG)

Añadimos el archivo al controlador de versiones RCS

![Paso 3](3%20RCS.PNG)

Al intentar modificar el archivo, veremos que no tenemos permisos

![Paso 4](4%20RCS.PNG)

Ahora lo desbloquearemos con 
```co  -l archivo.txt```
Y le añadiremos más texto

![Paso 5](5%20RCS.PNG)

Cuando intentemos acceder con otro usuario e intentar desbloquearlo, no podremos

![Paso 6](6%20RCS.PNG)

Ahora, una vez modificados los cambios anteriores, volveremos a ver que con el otro usuario no se puede abrir/modificar el fichero

![Paso 7](7%20RCs.PNG)

![Paso 8](8%20RCS.PNG)

Veremos la diferencia cada vez que introducimos un texto antes.

![Paso 9](9%20RCS.PNG)

Y una vez añadidos mas cambios, volveremos a guardar en la siguiente versión del archivo.

![Paso 10](10%20RCS.PNG)
