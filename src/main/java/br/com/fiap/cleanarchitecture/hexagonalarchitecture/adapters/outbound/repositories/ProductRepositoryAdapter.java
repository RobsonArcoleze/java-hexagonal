package br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.outbound.repositories;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.entities.ProductEntity;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.mapper.ProductMapper;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.out.ProductRepositoryPort;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final SpringDataProductRepository springDataProductRepository;
    private final ProductMapper productMapper;

    public ProductRepositoryAdapter(SpringDataProductRepository springDataProductRepository, ProductMapper productMapper) {
        this.springDataProductRepository = springDataProductRepository;
        this.productMapper = productMapper;
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = productMapper.mapToEntity(product);
        return productMapper.mapToModel(springDataProductRepository.save(entity));
    }
}
