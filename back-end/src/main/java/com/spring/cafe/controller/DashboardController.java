package com.spring.cafe.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/dashboard")
public interface DashboardController {

    @GetMapping(path = "/details")
    ResponseEntity<Map<String, Object>> getCount();

}
