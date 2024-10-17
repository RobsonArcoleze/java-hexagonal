package br.com.fiap.cleanarchitecture.hexagonalarchitecture.adapters.input.request;

import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.domain.Product;
import br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.ports.in.ProductServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductServicePort productServicePort;

    @PostMapping
    private Product save(@RequestBody Product product) {
        return productServicePort.save(product);
    }
}
