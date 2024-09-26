package atu.ie.week2_refresher;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(long id, Product product) {
        for (Product existingProduct : productList) {
            if (existingProduct.getId() == (id)) {
                existingProduct.setName(product.getName());
                existingProduct.setPrice(product.getPrice());
                return existingProduct;
            }
        }
        return null;
    }
    public void deleteProduct(long id) {
        Product productToDelete = productList.stream()
                .filter(p -> p.getId() == (id))
                .findFirst()
                .orElse(null);

        if (productToDelete != null) {
            productList.remove(productToDelete);
        } else {

        }
    }
}
