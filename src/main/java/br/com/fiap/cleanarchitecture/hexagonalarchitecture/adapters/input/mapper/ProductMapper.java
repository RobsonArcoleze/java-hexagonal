package br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.mapper;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.entities.ProductEntity;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductEntity mapToEntity(Product product) {
        var productEntity = new ProductEntity();
        BeanUtils.copyProperties(product, productEntity);
        return productEntity;
    }

    public Product mapToModel(ProductEntity productEntity) {
        var product = new Product();
        BeanUtils.copyProperties(productEntity, product);
        return product;
    }
}
