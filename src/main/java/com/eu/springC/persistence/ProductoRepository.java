package com.eu.springC.persistence;

import com.eu.springC.persistence.crud.ProductoCrudRepository;
import com.eu.springC.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int id_categoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(id_categoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
