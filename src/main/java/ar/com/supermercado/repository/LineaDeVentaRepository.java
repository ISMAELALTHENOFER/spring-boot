package ar.com.supermercado.repository;

import ar.com.supermercado.model.LineaDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineaDeVentaRepository extends JpaRepository<LineaDeVenta, Integer> {
}
