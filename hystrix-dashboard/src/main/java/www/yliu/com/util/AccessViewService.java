package www.yliu.com.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

public class AccessViewService {
    public static void main(String[] args) {
        while (true) {
            ThreadUtil.sleep(1000);
            String html = HttpUtil.get("http://127.0.0.1:8010/products");
            System.out.println("html length: " + html.length());
        }
    }
}
