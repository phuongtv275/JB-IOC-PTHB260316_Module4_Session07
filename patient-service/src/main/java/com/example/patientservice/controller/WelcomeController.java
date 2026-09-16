package com.example.patientservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller demo tính năng tự động làm mới cấu hình động với @RefreshScope
 * mà không cần phải khởi động lại ứng dụng.
 */
@Slf4j
@RestController
@RefreshScope
@RequestMapping("/welcome")
public class WelcomeController {

    @Value("${app.welcome}")
    private String welcome;

    @GetMapping
    public String welcome() {
        log.info("[WELCOME-CONTROLLER] Nhận request GET /welcome, lời chào hiện tại: {}", welcome);
        return welcome;
    }
}
