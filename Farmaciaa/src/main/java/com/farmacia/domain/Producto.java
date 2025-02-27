

package com.farmacia.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Laboratorio
 */
public class Producto {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
