package br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.out;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;


public interface ProductRepositoryPort {
    Product save(Product product);
}
