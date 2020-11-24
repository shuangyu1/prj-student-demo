package tech.aistar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "tech.aistar.mapper")
@SpringBootApplication
public class PrjStudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrjStudentDemoApplication.class, args);
    }
}
