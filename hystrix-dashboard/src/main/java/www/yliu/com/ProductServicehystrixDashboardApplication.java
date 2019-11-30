package www.yliu.com;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ProductServicehystrixDashboardApplication
{
    public static void main( String[] args )
    {
        int port = 8020;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductServicehystrixDashboardApplication.class)
                .properties("server.port=" + port).run(args);
    }
}
