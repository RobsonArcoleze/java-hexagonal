package br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.application.service;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.service.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductServiceImpl.class)
public class ProductServiceTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test

    public void saveProduct_shouldSaveProduct_whenDataIsValid() {

        
    }
}
