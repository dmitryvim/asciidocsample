package com.bg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
@RestController
public class Controller {
    @GetMapping("/get/{value}")
    AsciiResponse getResponse(@PathVariable String value)
    {
        return new AsciiResponse(value, LocalDateTime.now().toString());
    }
}
