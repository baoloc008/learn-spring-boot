package com.demo.part13_todo_app.config;

import com.demo.part13_todo_app.model.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {
    /**
     * Tạo ra Bean TodoValidator để sử dụng sau này
     *
     * @return
     */
    @Bean
    public TodoValidator todoValidator() {
        return new TodoValidator();
    }
}
