package org.example.controle2025;

import org.example.controle2025.dao.entities.Computer;
import org.example.controle2025.dto.ComputerDto;
import org.example.controle2025.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Controle2025Application {

    public static void main(String[] args) {
        SpringApplication.run(Controle2025Application.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return  args -> {
            computerService.saveComputer(
                    List.of(
                            ComputerDto.builder().proc("model1").harddrive("red").ram(16).price(12345).build(),
                            ComputerDto.builder().proc("model2").harddrive("hdd").ram(32).price(12345).build(),
                            ComputerDto.builder().proc("model3").harddrive("ssd").ram(64).price(12345).build(),
                            ComputerDto.builder().proc("model4").harddrive("last").ram(264).price(12345).build()


                            )

            );
        };
    }
}
