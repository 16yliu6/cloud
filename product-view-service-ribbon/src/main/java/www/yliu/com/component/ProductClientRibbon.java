package www.yliu.com.component;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import www.yliu.com.pojo.Product;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ProductClientRibbon {
    @Resource
    RestTemplate restTemplate;

    public List<Product> products() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }
}
