package br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.in;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;

public interface ProductServicePort {

    Product save(Product product);

}
