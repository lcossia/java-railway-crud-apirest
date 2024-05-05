package com.lcossia.apirest.repositories;

import com.lcossia.apirest.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
