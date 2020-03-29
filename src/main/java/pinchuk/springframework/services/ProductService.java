package pinchuk.springframework.services;

import pinchuk.springframework.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
