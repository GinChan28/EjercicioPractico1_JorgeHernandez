package com.farmacia.serviceImpl;

import com.farmacia.dao.ProductoDAO;
import com.farmacia.domain.Producto;
import com.farmacia.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoDAO productoDAO;

    @Override
    public List<Producto> listarProductos() {
        return productoDAO.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoDAO.deleteById(id);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoDAO.findById(id).orElse(null);
    }
}