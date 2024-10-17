package br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.outbound;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.outbound.repositories.ProductRepositoryAdapter;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.in.ProductServicePort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@AllArgsConstructor
public class ProductServiceAdapter implements ProductServicePort {

    private final ProductRepositoryAdapter productRepositoryAdapter;

    @Override
    public Product save(Product product) {
        return null;
    }
}
