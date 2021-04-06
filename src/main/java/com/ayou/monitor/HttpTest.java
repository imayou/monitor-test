package com.ayou.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Component
@EnableScheduling
public class HttpTest {

    WebClient webClient = WebClient.builder().build();

    //@Scheduled(fixedRate = 1000)
    public void get() {
        for (int i = 0; i < 100; i++) {
            webClient.get().uri("http://127.0.0.1:8080/test/hello").retrieve().bodyToFlux(String.class).subscribe(str -> {
                log.info("get:" + str);
            });
        }
    }

    //@Scheduled(fixedRate = 1000)
    public void post() {
        for (int i = 0; i < 100; i++) {
            webClient.post().uri("http://127.0.0.1:8080/test/post").bodyValue("这是body" + i).retrieve().bodyToFlux(String.class).subscribe(str -> {
                log.info("post:" + str);
            });
        }
    }
}
