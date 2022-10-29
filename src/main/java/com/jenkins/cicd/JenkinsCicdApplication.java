package com.jenkins.cicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class JenkinsCicdApplication {

    @GetMapping("/jenkins")
    public String getMessage() {
        log.info("Entering into Jenkins get method!!!!");
        return "Welcome to Jenkins CI/CD pipeline!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCicdApplication.class, args);
    }

}
