package io.lzh.administrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.lzh.administrationback.dao")
public class AdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministrationBackApplication.class, args);
    }

}
