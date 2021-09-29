package com.example.crudproducto.services;

import java.util.List;

import com.example.crudproducto.dao.IProductoDao;
import com.example.crudproducto.models.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDao productoDao;

    @Override
    public List<Producto> findAll() {

        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto findById(Integer id) {

        return productoDao.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {

        return productoDao.save(producto);
    }

    @Override
    public void delete(Integer id) {

    }

}
