package com.example.crudproducto.services;

import java.util.List;

import com.example.crudproducto.models.entity.Producto;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Integer id);

    public Producto save(Producto producto);

    public void delete(Integer id);
}
