package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author 16792
 * @Date 2023/12/2 9:32
 *
 */

@RequestMapping("/")
@RestController
public class HelloWorldController {


    @RequestMapping("hello")
    public Mono<String> hello() {
        return Mono.just("hello");
    }
}
