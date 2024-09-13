package com.hiberus.application.configuration;

import com.hiberus.domain.repository.PriceRepository;
import com.hiberus.domain.usecase.PriceUseCases;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public PriceUseCases getPriceUseCases(PriceRepository priceRepository) {
        return new PriceUseCases(priceRepository);
    }
}
