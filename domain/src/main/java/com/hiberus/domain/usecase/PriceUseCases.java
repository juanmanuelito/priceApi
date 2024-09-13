package com.hiberus.domain.usecase;

import com.hiberus.domain.model.PriceEntity;
import com.hiberus.domain.repository.PriceRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PriceUseCases {

    PriceRepository repository;

    public PriceUseCases(PriceRepository priceRepository) {
        this.repository = priceRepository;
    }

    public void createPrice(PriceEntity priceEntity){
        this.repository.savePrice(priceEntity);
    }

    public PriceEntity getPrice(Long productId, LocalDateTime date){
        return this.repository.getPrice(productId, date);
    }
}
