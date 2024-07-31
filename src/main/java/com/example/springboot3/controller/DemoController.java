package com.example.springboot3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  demo controller
 * </p>
 *
 * hello method url:
 * <a href="http://localhost:8095/api/project-detail/hi">...</a>
 * @author
 */
@Tag(name = "demo controller")
@RestController
@RequestMapping("/project-detail")
public class DemoController {

//    @Parameter
    @Operation(summary = "hello", description = "Hello World")
    @Schema(description = "say hello")
    @GetMapping("/hi")
    public String getProjectDetail() {
        return "Hello World";
    }
}
