package www.yliu.com.component;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import www.yliu.com.pojo.Product;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @RequestMapping("/products")
    public List<Product> products();
}
