/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.service;

import com.farmacia.domain.Producto;
import java.util.List;

public interface ProductoService {
    public List<Producto> listarProductos();
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
    Producto obtenerProductoPorId(Long id);

    
    
}