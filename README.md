# monitor-test
java metrics + prometheus + grafana
# grafana dashboard
12856
# pushgateway
```
  #pom.xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
    <scope>runtime</scope>
  </dependency>
  <dependency>
    <groupId>io.prometheus</groupId>
    <artifactId>simpleclient_pushgateway</artifactId>
  </dependency>
  
  #properties
  spring.application.name=test-push-service
  management.metrics.export.prometheus.pushgateway.enabled=true
  management.metrics.export.prometheus.pushgateway.base-url=http://ip:9091
  management.metrics.export.prometheus.pushgateway.job=${spring.application.name}
  management.metrics.export.prometheus.pushgateway.push-rate=10s
```
