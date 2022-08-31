package com.wh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WindowsFilter
 *
 * @author : 张宇健
 * @date : 2022-08-30 17:37
 **/
@RestController
@RequestMapping("/A")
public class AController {

    @GetMapping
    public String a(){

        return "";
    }
}
