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

1.- Crear base de datos con nombre tienda dentro del gestor MySQL con el siguiente comando:

    create database tienda;
    
*Nota: La estructura de la tabla no es requerida ya que de acuerdo al segundo link dentro del archivo al crear las entidades estas se encargan de crear la tabla correspondiente dentro del manejador lo cual permite la interacción con cada sentencia que se encuentra en el paso numero 2.

*Nota: 
  Puede cambiar pero se debe actualizar el archivo application.properties cambiando el nombre de la base.
  Mismo caso con el usuario y contraseña.
  
2.- Ejecutar la Aplicación dentro de nuestro navegador:

    * Agregar : url = localhost:8080/tienda/agregar?codigo=Codigo(String)&nombre=Nombre(String)&precio=Precio(float)
    * Consultar : url = localhost:8080/tienda/consultar?id=ID(int)
    * Eliminar : url = localhost:8080/tienda/eliminar?id=ID(int)
    * Actualizar : url = localhost:8080/tienda/actualizar?id=ID(int)&codigo=Codigo(String)&nombre=Nombre(String)&precio=Precio(float)
    * Listar : url = localhost:8080/tienda/listar

