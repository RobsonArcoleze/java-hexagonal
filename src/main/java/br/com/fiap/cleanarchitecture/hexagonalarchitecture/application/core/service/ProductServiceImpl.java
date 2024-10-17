package br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.service;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.in.ProductServicePort;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.out.ProductRepositoryPort;

public class ProductServiceImpl implements ProductServicePort {

    private final ProductRepositoryPort productRepository;

    public ProductServiceImpl(ProductRepositoryPort productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {

        return productRepository.save(product);
    }

}
