package com.example.crudproducto.dao;

import com.example.crudproducto.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto, Integer> {

}
