package ar.com.supermercado.repository;

import ar.com.supermercado.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}

