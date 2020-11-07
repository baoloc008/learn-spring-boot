package com.demo.part17_spring_profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class App {
    public static void setEnvInCode(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        // Thay đổi môi trường bằng cách comment và xem kết quả
        environment.setActiveProfiles("local");
//        environment.setActiveProfiles("aws");
        application.setEnvironment(environment);
        ApplicationContext context = application.run(args);

        LocalDatasource localDatasource = context.getBean(LocalDatasource.class);
        System.out.println(localDatasource);
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        AppConfig appConfig = context.getBean(AppConfig.class);
        System.out.println(appConfig);
    }
}
