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
    public boolean deleteProduct(long id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                return true;
            }
        }
        return false;
    }
}
