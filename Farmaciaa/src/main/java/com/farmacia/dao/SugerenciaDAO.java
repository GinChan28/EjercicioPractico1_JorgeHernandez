/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.dao;


import com.farmacia.domain.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugerenciaDAO extends JpaRepository<Sugerencia, Long> {
}