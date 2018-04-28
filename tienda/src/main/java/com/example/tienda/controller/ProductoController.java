package com.example.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.tienda.entity.Producto;
import com.example.tienda.service.IProductoService;


@Controller
@RequestMapping(path="/tienda")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	@GetMapping(path="/agregar")
	public @ResponseBody String addNewProduct(@RequestParam String codigo,@RequestParam String nombre, @RequestParam float precio) {
		if (!productoService.existeProducto(codigo, nombre)) {
			Producto producto = new Producto();
			producto.setCodigo(codigo);
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			productoService.añadirProducto(producto);
			return "Saved :D";
		}else {
			return "Ya existe";
		}
	}
	
	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Producto> getAllProducts(){
		return productoService.ObtenerProductos();
	}
	
	
	@GetMapping(path="/eliminar")
	public @ResponseBody String delProducto(@RequestParam int id) {
		productoService.borrarProducto(id);
		return "Deleted D:";
	}
	
	
	@GetMapping(path="/actualizar")
	public @ResponseBody String actualizar(@RequestParam int id,@RequestParam String codigo,@RequestParam String nombre, @RequestParam float precio) {
		Producto producto = productoService.obtenerProductoPorClave(id);
		producto.setCodigo(codigo);
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		productoService.actualizarProducto(producto);
		return "OK :D";
	}
	
	@GetMapping(path="/consultar")
	public @ResponseBody String getProducto(@RequestParam int id) {
		Producto producto = productoService.obtenerProductoPorClave(id);
		return producto.toString();
	}
	
}
