package com.mlkit.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MlkitController {

    @GetMapping("/test")
    public String test() {
        return "view/test";
    }

}
