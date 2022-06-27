package com.example.farmermap.farmer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class FarmerConfig {

    @Bean
    CommandLineRunner commandLineRunner(FarmerRepository farmerRepository) {
        return args -> {
            Farmer clarence = new Farmer(
                    "Clarence Petry",
                    "2020 Farmer Profile for Clarence Petry.pdf"
            );
            farmerRepository.saveAll(Arrays.asList(clarence));
        };
    }
}
