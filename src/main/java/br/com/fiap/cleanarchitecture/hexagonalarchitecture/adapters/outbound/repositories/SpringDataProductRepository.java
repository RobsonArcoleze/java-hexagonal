package br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.outbound.repositories;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProductRepository extends JpaRepository<ProductEntity, Long> {
}
