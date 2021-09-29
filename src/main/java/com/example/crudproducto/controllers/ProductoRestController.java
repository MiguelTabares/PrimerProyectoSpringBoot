package com.example.crudproducto.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.crudproducto.models.entity.Producto;
import com.example.crudproducto.services.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http:localhost/4200" })
@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("")
    public ResponseEntity<?> List() {
        List<Producto> productos = new ArrayList<>();

        Map<String, Object> response = new HashMap<>();

        try {
            productos = productoService.findAll();
        } catch (DataAccessException e) {

            response.put("Mensaje", "Error al intentar consultar la base de datos");
            response.put("Error", e.getCause().getMessage());

            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("Mensaje", "Lista de productos disponible");
        response.put("Productos", productos);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

    }

}
