package com.spring.cafe.controllerImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cafe.controller.DashboardRest;
import com.spring.cafe.service.DashboardService;

@RestController
public class DashboardControllerImpl implements DashboardRest{

    @Autowired
    DashboardService dashboardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashboardService.getCount();
    }

}
