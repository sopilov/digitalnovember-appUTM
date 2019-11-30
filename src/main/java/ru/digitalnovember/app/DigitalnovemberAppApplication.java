package ru.digitalnovember.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.digitalnovember.app.config.InitData;

@SpringBootApplication(scanBasePackages = "ru.digitalnovember.app")
@EnableJpaRepositories
public class DigitalnovemberAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalnovemberAppApplication.class, args);
    }

    @Bean(initMethod = "init")
    public InitData initTestData() {
        return new InitData();
    }
}
