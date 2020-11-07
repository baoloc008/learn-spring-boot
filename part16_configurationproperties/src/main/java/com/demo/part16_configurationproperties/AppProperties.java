package com.demo.part16_configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data // Lombok
@Component // Là 1 spring bean
// @PropertySource("classpath:loda.yml") // Đánh dấu để lấy config từ trong file loda.yml
@ConfigurationProperties(prefix = "loda") // Chỉ lấy các config có tiền tố là "loda"
public class AppProperties {
    private String email;
    private String googleAnalyticsId;
    private List<String> authors;

    private Map<String, String> exampleMap;

    // standard getters and setters
}
