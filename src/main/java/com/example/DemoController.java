package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rwarner on 9/22/16.
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "Spring boot bitches";
    }
}
