package com.demo.part17_spring_profile;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfig {
    @Value("${spring.datasource.url}")
    public String datasourceUrl;
}
