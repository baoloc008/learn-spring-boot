package com.demo.part05_component_scan;

import com.demo.part05_component_scan.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @ComponentScan("com.demo.part5_component_scan.others")
// @ComponentScan({"com.demo.part5_component_scan.others", ""com.demo.part5_component_scan.others2"})
@SpringBootApplication(scanBasePackages = "com.demo.part05_component_scan.others")
// @SpringBootApplication(scanBasePackages = {"com.demo.part5_component_scan.others", "com.demo.part5_component_scan.others2"})
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean Girl: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean OtherGirl: " + otherGirl.toString());
        } catch (Exception e) {
            System.out.println("Bean OtherGirl không tồn tại");
        }
    }
}
