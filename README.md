# monitor-test
java metrics + prometheus + grafana
# grafana dashboard
12856
# pushgateway maven pom
```
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
```
# pushgateway properties
```
  spring.application.name=test-push-service

  management.metrics.export.prometheus.pushgateway.enabled=true
  management.metrics.export.prometheus.pushgateway.base-url=http://172.16.0.55:9091
  management.metrics.export.prometheus.pushgateway.job=${spring.application.name}
  management.metrics.export.prometheus.pushgateway.push-rate=10s
```
