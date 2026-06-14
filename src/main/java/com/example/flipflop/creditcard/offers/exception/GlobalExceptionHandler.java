package com.example.flipflop.creditcard.offers.exception;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RequestNotPermitted.class)
    public ResponseEntity<Map<String, String>> handleRateLimitException(RequestNotPermitted ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "Too Many Requests");
        response.put("message", "Rate limit exceeded for flipflop-credit-card-offers-service. Please slow down!");

        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body(response);
    }
}
