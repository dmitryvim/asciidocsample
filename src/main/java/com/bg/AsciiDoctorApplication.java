package com.bg;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
@SpringBootApplication
public class AsciiDoctorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsciiDoctorApplication.class, args);
    }
}
