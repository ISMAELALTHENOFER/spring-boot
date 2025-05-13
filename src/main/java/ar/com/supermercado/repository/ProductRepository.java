package ar.com.supermercado.repository;

import ar.com.supermercado.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
