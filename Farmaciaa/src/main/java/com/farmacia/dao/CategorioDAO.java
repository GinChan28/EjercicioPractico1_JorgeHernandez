/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.dao;

/**
 *
 * @author Laboratorio
 */
import com.farmacia.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorioDAO extends JpaRepository<Categoria, Long> {
}