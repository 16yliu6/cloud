package www.yliu.com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import www.yliu.com.pojo.Product;
import www.yliu.com.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductController {
    @Resource
    ProductService productService;

    @RequestMapping("/products")
    public String products(Model mv) {
        List<Product> products = productService.products();
        mv.addAttribute("products", products);
        return "products";
    }
}
