package com.ayou.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestApi {
    @GetMapping("hello")
    public String hello() {
        //log.debug("hello");
        return "hello";
    }

    @PostMapping("post")
    public String post(@RequestBody String body) {
        //log.info(body);
        return "recover:" + body;
    }

    @GetMapping("error")
    public String error() {
        String a = "";
        //log.error("error");
        return a.substring(0, 10);
    }
}
