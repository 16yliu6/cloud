非对称加密：

1. keytool -genkeypair -alias mytestkey -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass letmein -keystore server.jks -storepass letmein

2. 生成的sever.jks放入config-server的resources中

3. bootstrap.properties配置

4. curl -X POST http://localhost:8080/encrypt -d caiyun-mima

-> AQAf4tedfIqx72/UyZGwHTN+O7NKs0OvOTuEYRNfjIlS4LMqQaCpjJwK94ivxlgApTzA/pwQ2IG65/D7IjNUehS2P75CWUWsuzCrU/fo6L6mRIZjR8g9GtQD3t0oL0n/7Z/nQKI3XPFc6Uz51n6LU8PUJi2WDxmnJ1D2r2yStPRpyg1xJFlRPC7Db7n7Ro0UVLsxNYZn3nddSYc4WHlXHIPwtcnyU846rBL0szaI/nutYfXEN11++zxsM6rsNXvqB+wtVCYeMGKn8yrbM4+nPiqYq71eSyc3Np4rjbOJNYpRGMLVPELPW4H1kzebI+9wnCRiaaPHIeTw8inxHoNfx3K8DSrAh0Mlw+CJey+TW0iL9RTjE7p0QWn3ReIQWTonn1o=

5. 修改git

6. curl -X POST http://localhost:8080/actuator/bus-refresh

7. 访问http://localhost:8080/microservice-foo/dev

自动刷新配置：git webhook和/actuator/bus-refresh

1. config-server和客户端微服务化

2. 更新git

3. curl -x POST http://localhost:8080/actuator/bus-refresh 配置中心刷新

4.配置中心通过消息总线通知客户端，客户端更新