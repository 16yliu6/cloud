package www.yliu.com.service;

import org.springframework.stereotype.Service;
import www.yliu.com.component.ProductClientFeign;
import www.yliu.com.component.ProductClientRibbon;
import www.yliu.com.pojo.Product;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductService {
    @Resource
    ProductClientRibbon productClientRibbon;
    @Resource
    ProductClientFeign productClientFeign;

    public List<Product> products() {
//        return productClientRibbon.products();
        return productClientFeign.products();
    }
}
