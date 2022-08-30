package com.wh.demo.controller;

import com.wh.demo.Util.WindowsFilter;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private WindowsFilter filter;
    @GetMapping
    public String a(){
        filter.HttpMethod();
        return "";
    }
}
