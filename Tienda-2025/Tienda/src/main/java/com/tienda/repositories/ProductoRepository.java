/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repositories;
import com.tienda.entities.Producto;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author papac
 */
public interface ProductoRepository extends CrudRepository<Producto,Long>{
    
}
