package atu.ie.week2_refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> products = new ArrayList<>();
    private ProductService productService;

    @Autowired
    public  ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/getDetails")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping("/postDetails")
    public Product addProduct(@RequestBody Product product) {
       return productService.addProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable long id,@RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
    @DeleteMapping("/delete/{id}")
        public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
        }

}
