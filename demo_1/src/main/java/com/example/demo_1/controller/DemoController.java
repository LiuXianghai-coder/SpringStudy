package com.example.demo_1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

/**
 * @author : LiuXianghai on 2021/2/19
 * @Created : 2021/02/19 - 12:11
 * @Project : demo_1
 */
@Slf4j
@RestController
@RequestMapping(path = "")
public class DemoController {
    @PostMapping(path = "/demo_1", produces = "application/json")
    public java.util.List<Object> demo_1(@RequestParam(name = "searchPage") SearchPage searchPage) {
        log.info("SearchPage: " + searchPage.toString());
        return Collections.singletonList("Hello Word!");
    }

    @PostMapping(path = "/demo")
    public String demo(
            @ModelAttribute(name = "searchPage") SearchPage searchPage,
            @ModelAttribute(name = "simple") Simple simple) {
        log.info("SearchPage: " + searchPage.toString());
        log.info("Simple: " + simple.toString());
        return "Hello World!";
    }

    @PostMapping(path = "/demo_4")
    public String demo_4(
            @ModelAttribute(name = "simple") Simple simple){
        log.info("Simple: " + simple.toString());
        return "Hello World!";
    }

    @PostMapping(path = "/demo_5")
    public String demo_5(
            @ModelAttribute(name = "searchPage") SearchPage searchPage
    ) {
        log.info("SearchPage: " + searchPage.toString());

        return "Hello World!";
    }

    @PostMapping(path = "/demo_2")
    public String demo_2(@RequestBody SearchPage searchPage) {
        log.info("SearchPage: " + searchPage.toString());
        return "Hello World!";
    }

    @PostMapping(path = "/demo_3")
    public String demo_3(SearchPage searchPage, Simple simple) {
        log.info("SearchPage: " + searchPage.toString());
        log.info("Simple: " + simple.toString());
        return "Hello World!";
    }
}
