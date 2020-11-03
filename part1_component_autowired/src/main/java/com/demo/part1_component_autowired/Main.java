package com.demo.part1_component_autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // ApplicationContext chứa toàn bộ dependency trong project.
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        ApplicationContext context = SpringApplication.run(Main.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        // Lấy Bean ra bằng cách
        Outfit outfit = context.getBean(Outfit.class);
        // In ra để xem thử nó là gì
        System.out.println("Instance: " + outfit);
        // xài hàm wear()
        outfit.wear();

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);
        girl.outfit.wear();
    }
}
