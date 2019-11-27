1. keytool -genkeypair -alias mytestkey -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass letmein -keystore server.jks -storepass letmein

2. 生成的sever.jks放入config-server的resources中

3. bootstrap.properties配置

4. curl -X POST http://localhost:8080/encrypt -d caiyun-mima

->
