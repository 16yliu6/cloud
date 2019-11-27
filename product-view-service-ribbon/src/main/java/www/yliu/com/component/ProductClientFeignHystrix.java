package www.yliu.com.component;

import org.springframework.stereotype.Component;
import www.yliu.com.pojo.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
    @Override
    public List<Product> products() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }
}
