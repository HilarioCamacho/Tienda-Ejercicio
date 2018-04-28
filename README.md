# Tienda-Ejercicio
--------------------------------------------------------------------------------------------------------------------------

## Realizo:

#### Hilario Gutiérrez Camacho
#### Javier González Contreras

--------------------------------------------------------------------------------------------------------------------------

## Descripción:

Ejercicio ejemplo implementando el framework Spring creando un sistema CRUD desarrollado bajo el IDE de Eclipse:

* Agregar
* Consultar
* Eliminar
* Actualizar
* Listar

--------------------------------------------------------------------------------------------------------------------------

## Pasos:

1.- Crear base de datos con nombre tienda

*Nota: 
  Puede cambiar pero se debe actualizar el archivo application.properties cambiando el nombre de la base.
  Mismo caso con el usuario y contraseña.
  
2.- Ejecutar la Aplicación dentro de nuestro navegador:

    * Agregar : url = localhost:8080/tienda/agregar?codigo=Codigo(String)&nombre=Nombre(String)&precio=Precio(float)
    * Consultar : url = localhost:8080/tienda/consultar?id=ID(int)
    * Eliminar : url = localhost:8080/tienda/eliminar?id=ID(int)
    * Actualizar : url = localhost:8080/tienda/actualizar?id=ID(int)&codigo=Codigo(String)&nombre=Nombre(String)&precio=Precio(float)
    * Listar : url = localhost:8080/tienda/listar

