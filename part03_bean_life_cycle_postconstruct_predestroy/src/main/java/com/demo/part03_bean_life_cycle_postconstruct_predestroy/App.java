package com.demo.part03_bean_life_cycle_postconstruct_predestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        System.out.println("> Trước khi IoC Container được khởi tạo");
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println("> Sau khi IoC Container được khởi tạo");

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        com.demo.part03_bean_life_cycle_postconstruct_predestroy.Girl girl = context.getBean(com.demo.part03_bean_life_cycle_postconstruct_predestroy.Girl.class);
        System.out.println(girl);
        System.out.println("> Trước khi IoC Container destroy Girl");
        context.getBeanFactory().destroyBean(girl);
        System.out.println("> Sau khi IoC Container destroy Girl");
    }
}
