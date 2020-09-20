package com.mlkit.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ML Kit test controller
 */
@Controller
@Slf4j
public class MlkitController {

    /**
     * 테스트 페이지
     *
     * @return
     */
    @GetMapping("/test")
    public String test() {
        return "view/test";
    }



}
