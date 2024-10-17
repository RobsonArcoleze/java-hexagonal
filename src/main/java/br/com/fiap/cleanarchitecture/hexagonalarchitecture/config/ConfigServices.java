package br.com.fiap.cleanarchitecture.hexagonalarchitecture.config;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.HexagonalArchitectureApplication;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.outbound.ProductServiceAdapter;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.service.ProductServiceImpl;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.in.ProductServicePort;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.out.ProductRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigServices {

    @Bean
    public ProductServicePort productServicePort(ProductRepositoryPort productRepositoryPort) {
        return new ProductServiceImpl(productRepositoryPort);
    }
}
