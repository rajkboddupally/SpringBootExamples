package com.springboot.examples.SpringBootExamples;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:global.properties")
@Data
public class GlobalProperties {
    @Value("${thread-pool}")
    private int threadPoolSize;

    @Value("${email}")
    private String email;
}
