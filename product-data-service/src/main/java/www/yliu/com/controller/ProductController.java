package www.yliu.com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.yliu.com.pojo.Product;
import www.yliu.com.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {
    @Resource
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> products() {
        List<Product> products = productService.listProducts();
        return products;
    }
}
